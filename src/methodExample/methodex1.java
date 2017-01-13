package methodExample;

public class methodex1 {

	public static void main(String[] args) {
		System.out.println(sum(1,10));

	}
public static int sum(int x, int y){
	int total=0;
	for(int i=x;i<=y;i++){
	total+=i;	
	}
	return total;
}
}
