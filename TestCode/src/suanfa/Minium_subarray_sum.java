package suanfa;

import java.util.Arrays;

public class Minium_subarray_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={2,3,1,2,4,3};
		Arrays.toString(a);
		System.out.println( minSubArrayLen(4,a));
	}
	public static int minSubArrayLen(int s, int[] nums) {  
        int start = 0;  
        int sum = 0;  
        int minLen = Integer.MAX_VALUE;  
        for(int i = 0; i < nums.length; i++) {  
            sum += nums[i];  
            //if(sum >= s) {  
                while(sum >= s) {  
                    minLen = Math.min(minLen, i - start + 1);  
                    sum -= nums[start];  
                    start ++;  
                }  
            //}  
        }  
        //return minLen == Integer.MAX_VALUE ? 0 : minLen;  
        return minLen;
    }  

}
