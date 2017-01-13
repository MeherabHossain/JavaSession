package classArray;

import java.util.Scanner;

public class sumAverage {

	public static void main(String[] args) {
  int total=0;
  double average;
  int number[]=new int[5];
  Scanner input =new Scanner(System.in);
  System.out.println("enter 5 numbers u want to sum :");
  for(int i=0;i<number.length;i++){
	number[i]=input.nextInt();
	  total+= number[i];
  }
 average=(float)total/number.length;
 System.out.println("total number ="+total+"average number ="+average);
	}
	

}
