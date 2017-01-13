package methodExample;

import java.util.Scanner;

public class printingNames {

	public static void main(String[] args) {
Scanner input=new Scanner(System.in);
String fnum1,fnum2,fnum3;
System.out.println("enter your three friends name :");
 fnum1=input.nextLine();
 fnum2=input.nextLine();
 fnum3=input.nextLine();
 System.out.println("name of your three friends are :"+names(fnum1,fnum2,fnum3));
	}
public static String names(String num1,String num2,String num3){
	String namevalues=num1+" "+num2+" "+num3;
	return namevalues;
}
}
