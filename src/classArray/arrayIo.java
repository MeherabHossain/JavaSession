package classArray;

import java.util.Scanner;
import static java.util.Arrays.*;
public class arrayIo {

	public static void main(String[] args) {
		int number,n;
		
		Scanner input= new Scanner(System.in);
    System.out.println("enter how many numbers do u want :");
  
    number= input.nextInt();
    int values[]=new int[number];
    System.out.println("input numbers");
    for(int i=0;i<number;i++){
    	values[i]=input.nextInt();
    }
    sort(values);
    System.out.println("output");
    for(int i=number-1;i>=0;i--){
    	System.out.println(values[i]);
    }
    
	}

}
