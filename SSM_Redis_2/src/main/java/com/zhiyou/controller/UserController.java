package com.zhiyou.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhiyou.model.User;
import com.zhiyou.service.UserService;

@Controller
public class UserController {

	private PageInfo<User> pageInfo = null;
	@Autowired
	UserService userService;
	
	@RequestMapping("show")
	public String show(@RequestParam(value="pagenum",defaultValue="1") int pagenum,HttpServletRequest req,HttpServletResponse resp) {		
		
		List<User> list = userService.select(pagenum);		
		pageInfo = new PageInfo<User>(list);		
		req.setAttribute("list", list);		
		req.setAttribute("pageInfo", pageInfo);
		return "show";
	}
	
	@RequestMapping("add")
	public String show(User user,HttpServletRequest req,HttpServletResponse resp) {
		userService.add(user);
		return "forward:show";
	}
	
	@RequestMapping("delete")
	public String delete(int id,HttpServletRequest req,HttpServletResponse resp) {
		userService.delete(id);
		return "forward:show";
	}
	
	@RequestMapping("selectById")
	public String selectByID(int id,HttpServletRequest req,HttpServletResponse resp) {
		req.setAttribute("user", userService.selectById(id));
		return "update";
	}
	@RequestMapping("update")
	public String update(User user,HttpServletRequest req,HttpServletResponse resp) {
		userService.update(user);
		return "forward:show";
	}
}
