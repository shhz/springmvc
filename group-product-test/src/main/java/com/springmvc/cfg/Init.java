package com.springmvc.cfg;

import java.util.ArrayList;
import java.util.List;

import com.springmvc.pojo.Jurisdiction;
import com.springmvc.pojo.Middle_j_r;
import com.springmvc.pojo.Role;
import com.springmvc.pojo.User;

public class Init {
	public static User USER;
	public static Role ROLE;
	public static Jurisdiction JURISDICTION;
	public static Middle_j_r MIDDLE;

	public static void init() {
		JURISDICTION = new Jurisdiction(0, "权限1");
		List<Middle_j_r> list = new ArrayList<>();
		ROLE = new Role(0, "管理员", list);
		MIDDLE = new Middle_j_r(0, ROLE, JURISDICTION);
		list.add(MIDDLE);
		ROLE.setList(list);
		USER = new User(0, "system", "password", ROLE);
		System.err.println("init success");
	}
}
