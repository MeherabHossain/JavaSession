import java.util.Scanner;

public class evenNumber {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
  int even;
  even=input.nextInt();
//  
 // for(int i=0;i<=event;i++)
if(even%2==0){
	System.out.println("even");
	}
else if(even%2==1){
	even+=1;
	
	for(int i=0;i<even;i+=2){
		System.out.println(""+i);
		
	}
}
	}

}
