import java.util.Scanner;

public class TwoSmallestNumber {

	public static void main(String[] args) {
		 Scanner input =new Scanner(System.in);
			
			
			int fnum1,fnum2,fnum3;
			System.out.println("enter your first number :");
			fnum1=input.nextInt();
			
			System.out.println("enter your second number :");
			fnum2=input.nextInt();
			
			System.out.println("enter your third number :");
			fnum3=input.nextInt();
		
		if(fnum1<fnum2&&fnum1<fnum3){
			System.out.println("smallest number is :"+fnum1);
		}
		else if(fnum2<fnum1 && fnum2<fnum3){
			System.out.println("smallest number is :"+fnum2);    
		}
		else if(fnum3<fnum1 && fnum3<fnum2)
			System.out.println("smallest number is :"+fnum3);
	}

	
	
}
