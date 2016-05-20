package suanfa;

public class Revers_Integer {

	public static void main(String[] args) {
		int a=123;
		long rev=0;
		while(a!=0){
			rev=rev*10+a%10;
			System.out.println(rev);
			a=a/10;
			System.out.println(a);
		}
		
		
	}

}
