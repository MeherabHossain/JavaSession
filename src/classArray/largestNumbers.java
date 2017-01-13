package classArray;

import java.util.Scanner;

public class largestNumbers {

	public static void main(String[] args) {
		int number[]=new int[5];
		int i,max;
		Scanner input =new Scanner(System.in);
		System.out.println("enter five numbers to find large number :");
		for(i=0;i<5;i++){
			number[i]=input.nextInt();
		}
		max=number[0];
		
		for(i=0;i<5;i++){		// 5 3 6 2 1
		
			if(max<number[i]){
		 
			max=number[i];
			 
		 }
	  }
      System.out.println(max);
	}

}

