package suanfa;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MajorityElement {

	public static void main(String[] args) {
		
		int[] nums={1,2,2,55,55,55,55,55,55,6,6,6,6};
		
		Map<Integer,Integer> hm=new HashMap<Integer,Integer>();
		
		for(int i=0;i<nums.length;i++){
			if(hm.containsKey(nums[i])){
				hm.put(nums[i], hm.get(nums[i])+1);
			}
			else{
				hm.put(nums[i], 1);
			}
		}
		
		int major=0;
		
		for(int i=0;i<nums.length;i++){
			if(hm.get(nums[i])>nums.length/2){
				major=nums[i];
			}
		}
		
		System.out.println(major);
		
	}

}
