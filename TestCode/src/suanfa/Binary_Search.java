package suanfa;

public class Binary_Search {
	
	private Binary_Search(){
		
	}
	
	public static void main(String[] args) {
		int[] array={1,4,5,6};
		
		int i=search(array,6);
		System.out.println("index: "+i+" value: "+array[i]);
	}
	
	static int search(int[] array,int target){
		
		int start=0;
		int end=array.length-1;
		
		
		while(start+1<end){
			int mid=start+(end-start)/2;
			if(array[mid]==target){
				end=mid;
			}
			if(array[mid]<target){
				start=mid;
			}
			if(array[mid]>target){
				end=mid;
			}
		}
		
		if(array[start]==target){
			return start;
		}
		else if(array[end]==target){
			return end;
		}
		return -1;
	}
	
}



