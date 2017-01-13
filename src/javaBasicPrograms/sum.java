import java.util.Scanner;

public class sum {

	public static void main(String[] args) {
		int fnum,snum,Sum=0,avg,n,i,var;
		Scanner input= new Scanner(System.in);
		System.out.println("enter how many number u want:");
		n=input.nextInt();
		
		for( i=0;i<=n;i++){
			var=input.nextInt();
			Sum+=var;
		}

	System.out.println(Sum);

		 //System.out.println("enter seconf number :");
		// snum=input.nextInt();
		 //sum=fnum+snum
	}

}
