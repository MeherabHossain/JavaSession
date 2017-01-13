import java.util.Scanner;

public class alphabetDetection {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.println("enter your Alphabet Letter :\n");
		int n=input.next().charAt(0);
		
		switch(n){
		case  'A' :
		case  'E' : 
		case  'I' : 
		case  'O' : 
		case  'U' :
		case  'a' :
		case  'e' :
		case  'i' :	
		case  'o' :
		case  'u' :	
			System.out.println("Input letter is vowel");
			break;
		default :
			System.out.println("Input letter is not vowel");
		}

	}
}
