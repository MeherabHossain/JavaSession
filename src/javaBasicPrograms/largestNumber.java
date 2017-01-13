import java.util.Scanner;

public class largestNumber {

	public static void main(String[] args) {
	Scanner input= new Scanner(System.in);
		int fnum1,fnum2,fnum3;
		System.out.println("enter your first number :");
		fnum1=input.nextInt();
		
		System.out.println("enter your second number :");
		fnum2=input.nextInt();
		
		System.out.println("enter your third number :");
		fnum3=input.nextInt();
		
		if(fnum1>fnum2 && fnum1>fnum3){
			System.out.println("Largest Number is :"+fnum1);
		}
		
		else if(fnum2>fnum1 && fnum2>fnum3){
			System.out.println("Largest Number is :"+fnum2);
		}
		
		else if (fnum3>fnum1 && fnum3>fnum2){
			System.out.println("Largest Number is :"+fnum3);
	}
		else if((fnum1==fnum2)&& fnum1>fnum3){
			System.out.println("two equal largest number is  :"+fnum1);
			}
		else if((fnum1==fnum2)&& fnum1<fnum3){
			System.out.println("largest number is :"+fnum3);
		}
		else if(fnum1==fnum3 && fnum3>fnum2){
			System.out.println("two equal largest number is  :"+fnum1);
		}
		else if(fnum1==fnum3 && fnum3<fnum2){
			System.out.println("largest number is :"+fnum2);
		}
		else if(fnum3==fnum2&& fnum3>fnum1){
			System.out.println("two equal largest number is  :"+fnum3);
		}
		else if(fnum3==fnum2&& fnum3<fnum1){
			System.out.println("largest number is :"+fnum1);
		}
		else
			System.out.println("All Three Numbers Are Equal");

}
}
