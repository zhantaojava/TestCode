package suanfa;

import java.util.Arrays;

public class Revers_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={1,2,3,4,5};
		
		int[] b=new int[a.length];
		
		for(int i=0;i<a.length;i++){
			b[i]=a[a.length -1-i];
		}
		System.out.println(Arrays.toString(b));
	}
}
