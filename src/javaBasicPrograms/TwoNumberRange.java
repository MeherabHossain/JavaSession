import java.util.Scanner;

public class TwoNumberRange {

 public static void main(String[] args) {
    Scanner input =new Scanner(System.in);
		
		System.out.println("enter a number :");
		int n=input.nextInt();
		
		if(n>=200&& n<=500)
			System.out.println("your number is : "+n+" ==> between 200 to 500");
		else
			System.out.println("your number is : "+n+" ==> not in a range");
	}

}
