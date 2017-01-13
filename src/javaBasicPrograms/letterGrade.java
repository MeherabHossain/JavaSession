import java.util.Scanner;

public class letterGrade {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.println("enter your number :\n");
		int n=input.nextInt();
		
	
		
	if(n>=80&&n<=100){
		System.out.println("your grade number is : A+");
		}
	else if(n>=70&&n<=79){
		System.out.println("your grade number is : A");
		}
    else if(n>=60&&n<=69){
		System.out.println("your grade number is : A-");
			}
     else if(n>=50&&n<=59){
				System.out.println("your grade number is : B");
			}
     else if(n>=40&&n<=49){
		System.out.println("your grade number is : C");
				}
     else if(n>=33&&n<=39){
		System.out.println("your grade number is : D");
        }
     else if(n>=0&&n<33){
		System.out.println("your grade number is : F");
        }
	 else
		System.out.println("your input number is invalid");
		}

	}


