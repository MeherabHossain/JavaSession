package JavaExam;

import java.util.Scanner;

public class stringCnversion {

	public static void main(String[] args) {
		String fnum1,fnum2,fnum3,num2,num3;
		double num1;
		Scanner input=new Scanner(System.in);
		System.out.println("enter a number :");
		fnum1=input.nextLine();
		System.out.println("enter a 2nd number :");
		fnum2=input.nextLine();
		System.out.println("enter a 3rd number :");
		fnum3=input.nextLine();
		double value =Double.parseDouble(fnum1);
		System.out.println(value);
		double value2 =Double.parseDouble(fnum2);
		System.out.println(value2);
		double value3 =Double.parseDouble(fnum3);
		System.out.println(value3);
	}

}
