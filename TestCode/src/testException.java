
public class testException {
	public static void main(String args[]) {
	     int num1, num2;
	     
	     try { 
	        // Try block to handle code that may cause exception
	        num1 = 1;
	        num2=1/num1;
	        
	        
	        System.out.println("Try block message");
	        System.out.println("result: "+num2);
	        
	        
	     } catch (ArithmeticException e) { 
	            // This block is to catch divide-by-zero error
	            System.out.println("Error: Don't divide a number by zero");
	       }
	     
	     catch(NullPointerException e){
	    	 
	    	 System.out.println("null pointer ");
	    	 
	     }
	     finally{
	    	 System.out.println("I'm finally ");
	     }
	     System.out.println("I'm out of try-catch block in Java.");
	   }
}
