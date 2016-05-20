package multithreading;

/**
 * 
 *  dead lock simulation. 
 *  not finish yet. 
 * @author suzhantao
 *
 */

public class DeadLock {

	
	
	public static void main(String[] args) {
		
		DeadTest d1=new DeadTest();
		Thread t=new Thread(d1);
		
	}

}


class DeadTest implements Runnable{

	@Override
	public void run() {
		
	}
	
}