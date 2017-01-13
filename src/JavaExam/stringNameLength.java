package JavaExam;

import java.util.Scanner;

public class stringNameLength {

	public static void main(String[] args) {
		String fnum1,fnum2,fnum3;
		Scanner input=new Scanner(System.in);
		System.out.println("enter ur first name :");
		fnum1=input.nextLine();
		System.out.println("enter ur second name :");
		fnum2=input.nextLine();
		System.out.println("enter ur last name :");
		fnum3=input.nextLine();
		
	
		if(fnum1.length()>fnum2.length()&&fnum1.length()>fnum3.length()){
			System.out.println("largest name :"+(fnum1));
		}else if(fnum2.length()>fnum1.length()&&fnum2.length()>fnum3.length()){
			System.out.println("largest name :"+fnum2);
		}else if(fnum3.length()>fnum2.length()&&fnum3.length()>fnum1.length()){
			System.out.println("largest name :"+fnum3);
		}else if(fnum1.length()==fnum2.length()&&fnum2.length()>fnum3.length()){
			System.out.println("two largest name :"+fnum2);
		}else if(fnum1.length()==fnum3.length()&&fnum1.length()>fnum2.length()){
			System.out.println("two largest name :"+fnum1);
		}else if(fnum1.length()==fnum2.length()&&fnum2.length()>fnum3.length()){
			System.out.println("two largest name :"+fnum2);
		}else if(fnum3.length()==fnum2.length()&&fnum2.length()>fnum1.length()){
			System.out.println("two largest name :"+fnum2);
		}
		
		else
			System.out.println("invalid/equal");
	}

}
