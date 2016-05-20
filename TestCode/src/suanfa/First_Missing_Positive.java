package suanfa;

import java.util.Arrays;

public class First_Missing_Positive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={1};
		//Arrays.sort(a);
		
		System.out.println(Arrays.toString(a));
		
		int result=find(a);
		System.out.println(result);
	}
	
	public static int find(int[] array){
		
		Arrays.sort(array);
		
		if(array.length==0){
            return 1;
        }
        
        
//        
       
        if(array.length==1&&array[0]!=0&&array[0]!=1){
        	
        	return array[0]-1;
        }
        
        
		
		int index=0;
		
		for(int i=0;i<array.length;i++){
			
			if(array[i]>0){
				index=i;
				break;
			}
			
		}
		System.out.println("index: "+index);
		
		int sum=(array[index]+array[array.length-1])*(array[array.length-1]-array[index]+1)/2;
		
		System.out.println("last "+ array[array.length-1]);
		System.out.println("sum: "+sum);
		int newSum=0;
		
		int result=0;
		
		for(int i=index;i<array.length;i++){
			newSum=newSum+array[i];
		}
		
		if(sum-newSum!=0){
			result=sum-newSum;
		}
		else{
			result=array[array.length-1]+1;
		}
		
		return result;
		
	}

}
