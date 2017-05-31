package com.springmvc.model;

/**
 * 用户 
 * 自身索引，用户名，登录密码和对应角色 多对一
 * 
 * @author shhz
 */
public class User {
	private int u_id;// 索引
	private String u_name;// 用户名
	private String u_pwd;// 密码
	private Role role;// 角色 id

	public int getU_id() {
		return u_id;
	}

	public void setU_id(int u_id) {
		this.u_id = u_id;
	}

	public String getU_name() {
		return u_name;
	}

	public void setU_name(String u_name) {
		this.u_name = u_name;
	}

	public String getU_pwd() {
		return u_pwd;
	}

	public void setU_pwd(String u_pwd) {
		this.u_pwd = u_pwd;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public User(int u_id, String u_name, String u_pwd, Role role) {
		super();
		this.u_id = u_id;
		this.u_name = u_name;
		this.u_pwd = u_pwd;
		this.role = role;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

}
