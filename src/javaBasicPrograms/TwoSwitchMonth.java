import java.util.Scanner;

public class TwoSwitchMonth {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		 int n;
		 System.out.println("enter your number :");
		 n=input.nextInt();
		 String month;
    switch(n){
    case 1: month="JANUARY";
            break;
    case 2: month="FEBRUARY";
            break;
    case 3: month="MARCH";
            break;
    case 4: month="APRIL";
            break;
    case 5: month="MAY";
            break;
    case 6: month="JUNE";
            break;
    case 7: month="JULY";
            break;
    case 8: month="AUGUST";
            break;
    case 9: month="SEPTEMBER";
            break;
    case 10:month="OCTOBER";
            break;
    case 11:month="NOVEMBER";
            break;
    case 12:month="DECEMBER";
            break;
    default :month="OUT OF RANGE";
            break;
    }
 System.out.println("your month is :"+month);
	}

}
