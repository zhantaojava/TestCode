package suanfa;

import java.util.Arrays;

public class Remove_Element {

	public static void main(String[] args) {
		
		int[] a={1,2,2,1};
		
		int b=removeElement(a,2);
		
		System.out.println(Arrays.toString(a));
		System.out.println(b);
		
	}
	public static int removeElement(int[] A, int elem) {  
        //{1,1,2,1,2,3,2,3,1}  
        int newIndex = 0;  
        for (int oldIndex = 0; oldIndex < A.length; ++oldIndex) {  
            if (A[oldIndex] != elem) {  
                A[newIndex++] = A[oldIndex];  
            }   
        }  
        return newIndex;  
    } 
	

}
