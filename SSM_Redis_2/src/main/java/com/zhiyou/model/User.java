package com.zhiyou.model;

import java.io.Serializable;
import java.sql.Date;

public class User implements Serializable{
	

	private Integer id;
	private String name;
	private String password;
	private Double money;
	private Date date;
	public User(Integer id, String name, String password, Double money, Date date) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.money = money;
		this.date = date;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	public Double getMoney() {
		return money;
	}
	public void setMoney(Double money) {
		this.money = money;
	}
	
	public User(Integer id, String name, String password, Double money) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.money = money;
	}
	
	public User(String name, String password, Double money) {
		this.name = name;
		this.password = password;
		this.money = money;
	}
	public User() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", password=" + password + ", money=" + money + ", date=" + date
				+ "]";
	}
	


}
