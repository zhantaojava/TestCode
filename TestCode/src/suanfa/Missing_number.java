package suanfa;

public class Missing_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums={0,1,2};
		System.out.println(nums.length);
		int first=nums[0];
		int last=nums[nums.length-1];
		int length=last-first+1;
		System.out.println(length);
		
		int sum=(first+last)*nums.length/2;
		System.out.println(sum);
		int sum1=(first+last)*length/2;
		System.out.println(sum1);
	}

}
