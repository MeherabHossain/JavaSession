import java.util.Scanner;

public class switchShow {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		
		System.out.println("enter a number from 1 to 3  :");
		int n=input.nextInt();
		String num;
		switch(n){
		case 1: num="ONE";break;
		case 2:	num="TWO";break;
		case 3: num="THREE";break;
		default :num="not in a range";
		}	
		
		System.out.println("your input number is :"+num);
		
	}

}
