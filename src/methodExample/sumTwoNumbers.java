package methodExample;

import java.util.Scanner;

public class sumTwoNumbers {

	public static void main(String[] args) {
	Scanner input =new Scanner(System.in);
	System.out.println("enter an integer number :");
		int fnum1=input.nextInt();
		System.out.println("enter a second integer number :");
		int fnum2=input.nextInt();
	int	sum=max(fnum1,fnum2);
		System.out.println("your sum numbers are :"+sum);
	}
	
	public static int max(int a ,int b){
		int value;
		value=a+b;
		return value;
	}

}
