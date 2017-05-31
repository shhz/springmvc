package com.springmvc.model;

/**
 * 角色权限中间表 
 * 存储自身索引，角色 多对一 和权限 多对一
 * 
 * @author shhz
 */
public class Middle_role_jurisdiction {
	private int m_id;// 中间表 id
	private Role role;// 角色 id
	private Jurisdiction jurisdiction;// 权限 id

	public int getM_id() {
		return m_id;
	}

	public void setM_id(int m_id) {
		this.m_id = m_id;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public Jurisdiction getJurisdiction() {
		return jurisdiction;
	}

	public void setJurisdiction(Jurisdiction jurisdiction) {
		this.jurisdiction = jurisdiction;
	}

	public Middle_role_jurisdiction(int m_id, Role role, Jurisdiction jurisdiction) {
		super();
		this.m_id = m_id;
		this.role = role;
		this.jurisdiction = jurisdiction;
	}

	public Middle_role_jurisdiction() {
		super();
		// TODO Auto-generated constructor stub
	}

}
