package com.springmvc.pojo;

import java.io.Serializable;

/**
 * ��ɫȨ���м�� 
 * �洢������������ɫ ���һ ��Ȩ�� ���һ
 * 
 * @author shhz
 */
public class Middle_j_r implements Serializable{
	private int m_id;// �м�� id
	private Role role;// ��ɫ id
	private Jurisdiction jurisdiction;// Ȩ�� id

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

	public Middle_j_r(int m_id, Role role, Jurisdiction jurisdiction) {
		super();
		this.m_id = m_id;
		this.role = role;
		this.jurisdiction = jurisdiction;
	}

	public Middle_j_r() {
		super();
		// TODO Auto-generated constructor stub
	}

}
