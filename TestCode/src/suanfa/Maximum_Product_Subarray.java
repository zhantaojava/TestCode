package suanfa;

public class Maximum_Product_Subarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a={2,3,-2,4,3};
		
		int result =Max(a);
		System.out.println(result);
		
		
	}
	
	public static int Max(int[] nums){
		
		int i=0; 
		int start=1;
		int sum=nums[start-1];
		int max=sum;
		while(i<nums.length-1){
			
			sum=nums[start-1];
			while(nums[start]>=0){
				sum=sum*nums[start];
				start++;
				max=Math.max(max, sum);
				
			}
			if(start>nums.length-1){
				return max;
			}
			
			start++;
			i=start;
			
			
		}
			
			return max;
	}

}
