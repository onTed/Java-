package com.han;

public class InitialOrderTest {
	
	private static String staticField = "��̬����";
	
	private String field = "����";
	
	static {
		System.out.println(staticField);
		System.out.println("��������̬�����");
	}
	
	{
		System.out.println(field);
		System.out.println("***��ʼ����");
	}
	
	public InitialOrderTest() {
		System.out.println("�޲ι��캯���С�����");
	}

	public static void main(String[] args) {
		new InitialOrderTest();
	}

}
