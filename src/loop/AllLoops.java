package loop;


public class AllLoops {

	public static void main(String[] args) {
	int i,number;
	for(i=100;i>0;i--){
		System.out.println("i=\t"+i);
	}
	 i=100;
	while(i>0){
		System.out.println("i="+i);
		i--;
	}
	i=100;
	do{
		System.out.println("i=\t"+i);
		i--;
	}while(i>0);

	}

}
