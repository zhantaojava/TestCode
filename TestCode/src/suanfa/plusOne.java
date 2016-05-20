package suanfa;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class plusOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={9,9};
		System.out.println("before"+ Arrays.toString(a));
		
		
		System.out.println("after"+Arrays.toString(plus(a)));
		
		
		
	}
	
	public static int[] plus(int[] a){
		int carry=1;
		int temp;
		for(int i=a.length-1;i>=0;i--){
			
			temp=a[i];
			
			a[i]=(temp+carry)%10;  //进行加1 操作以后的结果。当前位的新值。 模10的原因是为了保证结果为个位数
								   //如果加1后小于10，则无论怎样模10，都是原来的结果（如9%10=9）
			carry=(temp+carry)/10;
			
			if(carry==0) break; //如果没有进位，就直接退出这个循环了 (如98+1)
		}
		
		if(carry==1){
			int[] newArray= new int[a.length+1];
			System.arraycopy(a, 0, newArray, 1, a.length);
			newArray[0]=carry;
			return newArray;
		}
		else{
			return a;
		}
	}
	
	

}
