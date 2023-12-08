package com.mkpits.basic;

public class StaticVariable {

	static String cityName = "Nagpur";
	
	// for comment and uncomment single line ctrl + /
	
	public static void main(String[] args) {
		
		long mobile = 9890581851l;
		String cityName = "Pune";
		System.out.println("Calling Local Variable "+cityName);
		System.out.println("Calling static variable "+StaticVariable.cityName);
	}
	
	static {
		String cityName ="Mumbai";
		System.out.println("MKPITS Nagpur "+ cityName);
	}

}
