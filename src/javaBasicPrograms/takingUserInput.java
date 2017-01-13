import java.util.Scanner;

public class takingUserInput {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
  double fnum,snum,sum,subtract,division,multi,reminder;
		
    System.out.println("enter first number :");
	fnum=input.nextDouble();
	System.out.println("enter second number :");
	snum=input.nextDouble();
		
		sum= fnum+snum;
		subtract=fnum-snum;
		division=fnum/snum;
		multi=fnum*snum;   
		reminder=fnum%snum;
		   
		   System.out.println("two number additon        : "+sum);
		   System.out.println("two number multiplication : "+multi);
		   System.out.println("two numbwer subtraction   : "+subtract);
		   System.out.printf("two number division        :%.2f",division);
		   System.out.println("reminder betn two number  : "+reminder);
	}

}
