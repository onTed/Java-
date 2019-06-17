package com.ienum;

public enum Size {

	SMALL("S"), MEDIUM("M"), LARGE("L");

	private String desc;

	/**
	 * 枚举类的构造方法必须是包访问权限或者私有的
	 * The constructor for an enum type must be
	 * package-private or private access
	 * 
	 */
	Size(String s) {
		this.desc = s;
	}

	private Size() {
	}

	public String getDesc() {
		return desc;
	}

	public static void main(String[] args) {
		System.out.println(Size.MEDIUM.toString());

	}

}
