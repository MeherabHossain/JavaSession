package Trycatch;

import java.util.Scanner;

public class stringConcatenation {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
	String name1 ,name2;
	System.out.println("enter your first line :");
	name1=input.nextLine();
	System.out.println("enter your second line :");
	name2=input.nextLine();
	String fullname=name1+" "+name2;
	System.out.println("your full concatenated line is :"+fullname);
	}

}
