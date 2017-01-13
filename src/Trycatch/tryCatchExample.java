package Trycatch;

import java.util.Scanner;

public class tryCatchExample {

	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	int number =10;
    int value,result;
    System.out.println("ENTER INPUT :");
   
    try{
    	 value =input.nextInt();
    result =number/value;
    System.out.println("OUTPUT"+result);
	}catch(Exception e){
		System.out.println("ERROR"+e);
	}
    
 }
}
