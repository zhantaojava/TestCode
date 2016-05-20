package suanfa;

public class BestTimeToBuy2 {

	public static void main(String[] args) {
		int[] a={1,2,3,1,2};
		
		int maxP=0;
		
		maxP=maxProfit(a);
		
		System.out.println("m:"+maxP);
	}
	
	/**
	 * 
	 * find max profit
	 * 
	 * @param prices
	 * @return
	 */
	public static int maxProfit(int[] prices) {
        if (prices.length < 2) return 0;
        
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            int diff = prices[i] - prices[i - 1];
            //System.out.println(diff);
            if (diff > 0) {
                //maxProfit += diff;
                maxProfit =maxProfit+ diff;
            }
        }
        
        return maxProfit;
    }

}
