package com.mkpits.methods;

public class MethodDeclaration {

	public static void main(String[] args) {
		
		// Direct Access
		displayUser();
		
		// ClassName.methodName()
		MethodDeclaration.getName();
		
		// Objectref.methodName()
		MethodDeclaration declaration = new MethodDeclaration();
		declaration.getData();
		
	}
	
	
	private static void getData() {
		// TODO Auto-generated method stub
		String url = "https://www.mkpits.in";
		
		System.out.println("Organisation URL is :-"+url);
		
	}


	public static void getName() {
		// TODO Auto-generated method stub
		String name = "Mkpits Nagpur";
		System.out.println("Organisation Name is :-"+name);
		
	}


	// Declare return type if not use void
	// method name - any valid name but not keyword
	// () - for arguements
	// {} - method body
	public static void displayUser() {
		
		System.out.println("Welcome to method");
		
	}
	
}
