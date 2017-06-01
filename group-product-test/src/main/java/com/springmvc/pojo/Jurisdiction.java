package com.springmvc.pojo;

import java.io.Serializable;

/**
 * Ȩ�� 
 * ��id��ʶ���洢Ȩ�޵�ģ������
 * 
 * @author shhz
 */
public class Jurisdiction implements Serializable {
	private int j_id;// Ȩ��id
	private String j_name;// Ȩ��ģ����

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