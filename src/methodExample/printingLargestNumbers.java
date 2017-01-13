package methodExample;

import java.util.Scanner;

public class printingLargestNumbers {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		int number1,number2,number3;
		System.out.println("enter your first number :");
		number1=input.nextInt();
		
		System.out.println("enter your second number :");
		number2=input.nextInt();
		
		System.out.println("enter your third number :");
		number3=input.nextInt();
System.out.println("largest number :"+max(number1,number2,number3));
	}
	public static int max(int fnum1,int fnum2,int fnum3){
		
		if(fnum1>fnum2 && fnum1>fnum3){
			return fnum1;
		}
		
		else if(fnum2>fnum1 && fnum2>fnum3){
			return fnum2;
		}
		
		else if (fnum3>fnum1 && fnum3>fnum2){
			return fnum3;
	}else
		return 0;
		
		

}
	
}





