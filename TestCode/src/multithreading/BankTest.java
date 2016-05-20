package multithreading;
/**
 * 
 * 要往金库里面存钱。
 * 有两个储户，要存300，分三次存，每次存100
 * 
 * @author suzhantao
 *
 */
public class BankTest {

	public static void main(String[] args) {
		Customer c1=new Customer();
		
		Thread t1=new Thread(c1);
		Thread t2=new Thread(c1);
		
		t1.start();
		t2.start();
	}

}


class Customer implements Runnable {

	Bank bank=new Bank(); 
	public void run() {
		
		for(int i=0;i<3;i++){
			try {
				bank.add(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}

class Bank {
	private int sum;
	Object obj=new Object();
	public void add(int n) throws InterruptedException{
		synchronized (obj) {
			sum=sum+n;
			Thread.sleep(10);
			System.out.println("Sum: "+sum);
		}
		
			
	}
	
}