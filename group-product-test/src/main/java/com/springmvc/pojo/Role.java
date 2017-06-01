package com.springmvc.pojo;

import java.io.Serializable;
import java.util.List;

/**
 * ��ɫ �� id ��ʶ���洢��ɫ�����ƣ��洢�м�� һ�Զ�
 * 
 * @author shhz
 */
public class Role implements Serializable {
	private int r_id;// ��ɫ id
	private String r_name;// ��ɫ��
	private List<Middle_j_r> list;// ��ɫȨ���м�� һ�Զ�

	public int getR_id() {
		return r_id;
	}

	public void setR_id(int r_id) {
		this.r_id = r_id;
	}

	public String getR_name() {
		return r_name;
	}

	public void setR_name(String r_name) {
		this.r_name = r_name;
	}

	public List<Middle_j_r> getList() {
		return list;
	}

	public void setList(List<Middle_j_r> list) {
		this.list = list;
	}

	public Role(int r_id, String r_name, List<Middle_j_r> list) {
		super();
		this.r_id = r_id;
		this.r_name = r_name;
		this.list = list;
	}

	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}
}
