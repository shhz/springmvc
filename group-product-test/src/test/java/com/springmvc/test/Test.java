package com.springmvc.test;

import java.util.Scanner;

import com.springmvc.cfg.Init;
import com.springmvc.model.User;

public class Test {
	public static void main(String[] args) {
		Init.init();
		Scanner sc = new Scanner(System.in);
		User u = new User();
		boolean flag = true;
		while (flag) {
			System.out.println("*****��¼*****");
			System.out.println("�������û���");
			u.setU_name(sc.next());
			System.out.println("*************");
			System.out.println("����������");
			u.setU_pwd(sc.next());
			if (!u.getU_name().equals(Init.USER.getU_name()) || !u.getU_pwd().equals(Init.USER.getU_pwd())) {
				System.out.println("�û������������");
				System.out.println("���µ�¼");
			} else {
				System.out.println("��¼�ɹ�");
				// �жϽ�ɫ
				if (u.getRole().equals(Init.ROLE)) {
					System.out.println("����:" + Init.ROLE.getR_name());
				}
				// �ж�Ȩ��
				if (Init.ROLE.getList().get(0).getJurisdiction().equals(Init.JURISDICTION)) {
					System.out.println("Ȩ����:" + Init.JURISDICTION.getJ_name());
				}
				flag = !flag;
			}
		}
	}
}
