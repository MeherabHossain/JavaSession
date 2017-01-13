package classArray;

import java.util.Scanner;

public class countPositiveNegative {

	public static void main(String[] args) {
		int positive=0,negative=0;
	System.out.println("enter how many numbers u want to input :");
	Scanner input =new Scanner(System.in);
	int n=input.nextInt();
	int number []=new int[n];
	System.out.println("enter the numbers :");
	for (int i=0;i<n;i++){
		number[i]=input.nextInt();
		if(number[i]>0){
			positive++;
		}else
		{
			negative++;
		}
	}
	System.out.println("positive :"+positive+"\t"+"negative :"+negative);
	
	}

}
