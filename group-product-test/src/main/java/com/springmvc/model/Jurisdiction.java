package com.springmvc.model;

/**
 * 权限 
 * 由id标识，存储权限的模块名称
 * 
 * @author shhz
 */
public class Jurisdiction {
	private int j_id;// 权限id
	private String j_name;// 权限模块名

	public int getJ_id() {
		return j_id;
	}

	public void setJ_id(int j_id) {
		this.j_id = j_id;
	}

	public String getJ_name() {
		return j_name;
	}

	public void setJ_name(String j_name) {
		this.j_name = j_name;
	}

	public Jurisdiction(int j_id, String j_name) {
		super();
		this.j_id = j_id;
		this.j_name = j_name;
	}

	public Jurisdiction() {
		super();
		// TODO Auto-generated constructor stub
	}

}