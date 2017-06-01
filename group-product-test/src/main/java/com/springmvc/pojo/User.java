package com.springmvc.pojo;

import java.io.Serializable;

/**
 * �û� 
 * �����������û�������¼����Ͷ�Ӧ��ɫ ���һ
 * 
 * @author shhz
 */
public class User implements Serializable {
	private int u_id;// ����
	private String u_name;// �û���
	private String u_pwd;// ����
	private Role role;// ��ɫ id

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
