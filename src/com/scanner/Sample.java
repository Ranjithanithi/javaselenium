package com.scanner;

import java.util.Scanner;

public class Sample {
public static void main(String[] args) {

	Scanner s=new Scanner(System.in);
	System.out.println("Enter Employee name:");
	String name=s.next();
	System.out.println("Employee Name is:" + name);
	System.out.println("Enter employee phone no");
	long phoneno = s.nextLong();
	System.out.println("Employee phoneno is:" +phoneno);
}
}

