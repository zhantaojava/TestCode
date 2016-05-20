package suanfa;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class ContainDuplicate {

	public static void main(String[] args) {
		int[] nums={1,2,3,4,5,1};
		System.out.println(containsDuplicate(nums,1));
	}
	
	public static boolean containsDuplicate(int[] nums,int k){
		
		Hashtable<Integer,Integer> ht=new Hashtable();
		
		Map<Integer,Integer> hm=new HashMap();
		
		for(int i=0;i<nums.length;i++){
			if(hm.containsKey(nums[i])&&(i-hm.get(nums[i])<=k)){
				System.out.println("Duplicate Number is "+nums[i]);
				return true;
			}
			
			hm.put(nums[i], i);
			
			
		}
		System.out.println("no dupliate number");
		return false;
	}

}
