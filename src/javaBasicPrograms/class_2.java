import java.util.Scanner;

public class class_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
 int n;
 System.out.println("enter your grade number :");
 n=input.nextInt();
   if(n>=80&&n<=100){
	   System.out.println("your grade is A+");
   }
   else if(n<=79&&n>=70){
	   System.out.println("your grade is A");
   }
   else if(n>=60&&n<=69){
	   System.out.println("your grade is A-");
   }
   else if(n>=50&&n<=59){
	   System.out.println("your grade is B");
   }
   else if(n>=40&&n<=49){
	   System.out.println("your grade is C");
   }
   else if(n>=33&&n<=39){
	   System.out.println("your grade is D");
   }
   else if(n<=33){
	   System.out.println("your grade is F");
   }
   else
	   System.out.println("you are out of bound");
	}

}
