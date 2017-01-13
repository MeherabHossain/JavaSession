package oop;

import java.util.Scanner;

public class circleDemo {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		double radius = input.nextDouble();
		
		circleClass obj=new circleClass();
	
	     obj.setRadius(radius);
	
		System.out.println(	obj.getRadius());
		
		System.out.println(obj.getDiameter());
		
		System.out.println(obj.getCircumference());
		
	
		System.out.println(	obj.getArea());

	}

}
