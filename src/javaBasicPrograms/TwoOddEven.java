import java.util.Scanner;

public class TwoOddEven {

	public static void main(String[] args) {
		 Scanner input =new Scanner(System.in);
			
			System.out.println("enter a number :");
			int n=input.nextInt();
			
		if (n%2==0)
			System.out.println("your number is Even");
		else
			System.out.println("your number is ODD");
	}

}
