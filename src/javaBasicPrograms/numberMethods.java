import java.util.Random;
import java.lang.Math.*;
public class numberMethods {
//	import java.lang.Math.*;

	public static void main(String[] args) {
		int number1=-4;
		double number2=8.50,x=4,function;
		int num1=4,num2=5;
		function=Math.pow(x,9)+5*(Math.pow(x,3))+2*x-5;
    System.out.println("absolute value of number1 :"+Math.abs(number1));
	System.out.println("ceil value of number2 :"+Math.ceil(number2));
	System.out.println("floor value of number2 :"+Math.floor(number2));
	System.out.println("squart valueof num1 :"+Math.sqrt(num1));
	
	    System.out.println("minimum value betn num1&num2 :"+Math.min(num1,num2));
		System.out.println("maximum value betn num1&num2:"+Math.max(num1,num2));
		System.out.println("pow value of num1 :"+Math.pow(num1,3));
		System.out.println("value of function :"+function);
	
 
 Random rand= new Random();
 int randValue =rand.nextInt(100);
 System.out.println("random number is :"+randValue);

  
   }
}
