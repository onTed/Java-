package com.han;

public class SubClass extends Parent {
	/* ��̬���� */
	public static String s_StaticField = "����--��̬����";
	/* ���� */
	public String s_Field = "����--����";

	/* ��̬��ʼ���� */
	static {
		System.out.println(s_StaticField);
		System.out.println("����--��̬��ʼ����");
	}

	/* ��ʼ���� */
	{
		System.out.println(s_Field);
		System.out.println("����--��ʼ����");
	}

	/* ������ */
	public SubClass() {
		System.out.println("����--������");
		System.out.println("i=" + i + ",j=" + j);
	}

	/* ������� */
	public static void main(String[] args) {
		System.out.println("����main����");
		new SubClass();
	}
}

class Parent {
	public static String parentStaticField = "����-��̬����";

	public String parentField = "����-����";

	protected int i = 9;

	protected int j = 100;

	/* ��̬��ʼ���� */
	static {
		System.out.println(parentStaticField);
		System.out.println("����--��̬��ʼ����");
	}

	/* ��ʼ���� */
	{
		System.out.println(parentField);
		System.out.println("����--��ʼ����");
	}

	/* ������ */
	public Parent() {
		System.out.println("����--������");
		System.out.println("i=" + i + ", j=" + j);
		j = 20;
	}
}


