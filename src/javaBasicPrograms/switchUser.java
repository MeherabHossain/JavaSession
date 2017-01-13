import java.util.Scanner;

public class switchUser {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		 int n;
		 System.out.println("enter your number :");
		 n=input.nextInt();
     switch(n){
     case 1:
    	 System.out.println("ONE");
    	  break;
     case 2:
    	 System.out.println("TWO");
    	 break;
     case 3:
    	 System.out.println("THREE");
    	 break;
    	 default :
    		 System.out.println("your number is out of limit");
     }
	}

}
