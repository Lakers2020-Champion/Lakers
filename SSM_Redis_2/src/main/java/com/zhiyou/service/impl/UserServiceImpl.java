package com.zhiyou.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.zhiyou.dao.UserDao;
import com.zhiyou.model.User;
import com.zhiyou.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserDao userDao;
	
	@CacheEvict(value="userList",allEntries=true)
	public void add(User user) {
		userDao.add(user);	
		
	}
	@CacheEvict(value="userList",allEntries=true)
	public void update(User user) {
		userDao.update(user);
		
	}
	
	//用来标记需要清除的方法，以及指定需要清除的缓存  allEntries:代表是否清除缓存中的所有元素
	@CacheEvict(value="userList",allEntries=true)
	public void delete(int id) {
		userDao.delete(id);
		
	}
	
	//指定下面这个方法需要使用缓存，使用缓存的名字叫做userList
	@Cacheable(value="userList",key="#page")
	public List<User>select(int page) {	
		PageHelper.startPage(page,5);
		return userDao.select();
	}
	
	//key="#id"
	@Cacheable(value="userList",key="T(String).valueOf(#id).concat('heihei')")
	public User selectById(int id) {		
		return userDao.selectById(id);
	}
	

}
