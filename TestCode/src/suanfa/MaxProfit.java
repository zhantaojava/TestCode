package suanfa;

public class MaxProfit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] stock = { 2,-3,5};
		int a = maxSubArray(stock);
		//System.out.println("max:"+a);
		
	}

	public static int maxSubArray(int[] A) {
		int newsum = A[0];
		int max = A[0];
		for (int i = 1; i < A.length; i++) {
			newsum = Math.max(newsum + A[i], A[i]);
			System.out.println("newsum:"+newsum);
			max = Math.max(max, newsum);
			System.out.println("max:"+max);

		}

		return max;
	}

}
