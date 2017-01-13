package classArray;

import java.util.Scanner;

public class printNames {

	public static void main(String[] args) {
		int n;
		String names []= new String[5];
    Scanner input = new Scanner(System.in);
    System.out.println("ENTER YOUR FIVE FAVOURITE NAMES :");
   for(int i=0;i<names.length;i++){
	  
	  names[i]=input.nextLine(); 
       }
   for(int i=0;i<names.length;i++){
		  
		 System.out.println("ALL YOUR FAVOURITE NAMES ARE :"+names[i]);
	       }
    
	}
}
