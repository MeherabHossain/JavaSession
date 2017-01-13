package classArray;

import java.util.Scanner;
import static java.util.Arrays.*;
public class sortingNumbers {

	public static void main(String[] args) {
	
		int numbers []=new int[5];
		Scanner input =new Scanner(System.in);
		System.out.println("enter ten numbers to sort :");
		for(int i=0;i<numbers.length;i++){
			numbers[i]=input.nextInt();
			
		}
		sort(numbers);
		
		for(int i=numbers.length-1;i>=0;i--){
			System.out.println("your descending numbers are :"+numbers[i]);
		}

	}

}
