package com.springmvc.cfg;

import java.util.ArrayList;
import java.util.List;

import com.springmvc.model.Jurisdiction;
import com.springmvc.model.Middle_role_jurisdiction;
import com.springmvc.model.Role;
import com.springmvc.model.User;

public class Init {
	public static User USER;
	public static Role ROLE;
	public static Jurisdiction JURISDICTION;
	public static Middle_role_jurisdiction MIDDLE;

	public static void init() {
		JURISDICTION = new Jurisdiction(0, "权限1");
		List<Middle_role_jurisdiction> list = new ArrayList<>();
		ROLE = new Role(0, "管理员", list);
		MIDDLE = new Middle_role_jurisdiction(0, ROLE, JURISDICTION);
		list.add(MIDDLE);
		ROLE.setList(list);
		USER = new User(0, "system", "password", ROLE);
		System.err.println("init success");
	}
}
