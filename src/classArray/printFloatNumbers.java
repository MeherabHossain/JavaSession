package classArray;

import java.util.Scanner;

public class printFloatNumbers {

	public static void main(String[] args) {
	float numbers []= new float[5];
	Scanner input=new Scanner(System.in);
	for(int i=0;i<5;i++){
		numbers[i]=input.nextFloat();
	}
	for(int i=0;i<5;i++){
		System.out.println("your floating numbers are :"+numbers[i]);
	}
	}

}
