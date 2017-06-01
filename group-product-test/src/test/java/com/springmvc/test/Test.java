package com.springmvc.test;

import java.util.Scanner;

import com.springmvc.cfg.Init;
import com.springmvc.pojo.User;

public class Test {
	public static void main(String[] args) {
		Init.init();
		Scanner sc = new Scanner(System.in);
		User u = new User();
		boolean flag = true;
		while (flag) {
			System.out.println("*****登录*****");
			System.out.println("请输入用户名");
			u.setU_name(sc.next());
			System.out.println("*************");
			System.out.println("请输入密码");
			u.setU_pwd(sc.next());
			System.out.println("*************");
			if (!u.getU_name().equals(Init.USER.getU_name()) || !u.getU_pwd().equals(Init.USER.getU_pwd())) {
				System.out.println("用户名或密码错误");
				System.out.println("重新登陆");
				System.out.println("*************");
			} else {
				System.out.println("登陆成功");
				System.out.println("*************");
				// 角色
				if (Init.USER.getRole().equals(Init.ROLE)) {
					System.out.println("身份:" + Init.ROLE.getR_name());
					System.out.println("*************");
				}
				// 权限
				if (Init.ROLE.getList().get(0).getJurisdiction().equals(Init.JURISDICTION)) {
					System.out.println("权限:" + Init.JURISDICTION.getJ_name());
					System.out.println("*************");
				}
				flag = !flag;
			}
		}
	}
}
