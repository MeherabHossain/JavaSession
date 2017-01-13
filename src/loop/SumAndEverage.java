package loop;

import java.util.Scanner;

public class SumAndEverage {

	public static void main(String[] args) {
		int i,number,storage;
		double average,sum=0;
 Scanner input=new Scanner(System.in);
   System.out.println("enter the number of range :");
 
   number=input.nextInt();
 
 for(i=0;i<number;i++){
	 storage=input.nextInt();
	 sum+=storage;
 }
 System.out.println(sum);
 average= sum/number;
 
 System.out.println(average);
	}

}
