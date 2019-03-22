package com.han;

public class InitialOrderTest {
	
	private static String staticField = "静态变量";
	
	private String field = "变量";
	
	static {
		System.out.println(staticField);
		System.out.println("···静态代码块");
	}
	
	{
		System.out.println(field);
		System.out.println("***初始化块");
	}
	
	public InitialOrderTest() {
		System.out.println("无参构造函数中。。。");
	}

	public static void main(String[] args) {
		new InitialOrderTest();
	}

}
