package multithreading;

public class Thread_Multiple_Synchronized_Block {

	public static void main(String[] args) {
		Task11 task11=new Task11();
		
		Thread t=new Thread(task11);
		
		t.setName("a");
		
		
		t.start();
		
		task11.run2();
		
		
	}

}


class Task11 implements Runnable{

	Account1 account=new Account1();
	
	public void run() {
		
		account.deposit();
		
		
	}
	
	public void run2(){
		account.withdraw();
	}
	
	
	

	
}




class Account1 {
	
	int balance;
	
	public synchronized void deposit(){
		
		
		
			
				balance=10;
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
		
					e.printStackTrace();
				}
				
				System.out.println(Thread.currentThread().getName()+" "+balance);
		
	}
	
public synchronized void withdraw(){
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		balance=100;
		System.out.println(Thread.currentThread().getName()+" "+balance);
	}
	
	
}
