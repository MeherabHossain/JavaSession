package loop;

import java.util.Scanner;

public class OddNumber {

	public static void main(String[] args) {
		int i,number;
		Scanner input = new Scanner(System.in);
		System.out.println("enter the range of number u want :");
		number=input.nextInt();
		for(i=1;i<=number;i+=2){
			System.out.println("ODD number is :\t"+i);
		}

	}

}
