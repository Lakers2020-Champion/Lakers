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
	
	//���������Ҫ����ķ������Լ�ָ����Ҫ����Ļ���  allEntries:�����Ƿ���������е�����Ԫ��
	@CacheEvict(value="userList",allEntries=true)
	public void delete(int id) {
		userDao.delete(id);
		
	}
	
	//ָ���������������Ҫʹ�û��棬ʹ�û�������ֽ���userList
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
