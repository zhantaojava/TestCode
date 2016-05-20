package multithreading;

public class Thread_Synchronized {

	public static void main(String[] args) {
		Task1 task1=new Task1();
		
		Thread t=new Thread(task1);
		Thread t1=new Thread(task1);
		t.setName("a");
		t1.setName("b");
		
		t.start();
		t1.start();
		
	}

}


class Task1 implements Runnable{

	Account account=new Account();
	
	public void run() {
		for(int i=0;i<100;i++){
			account.deposit(100);
		}
	}
	
	
}

class Account {
	
	static int balance;
	
	public  void deposit(int amount){
		balance=balance+amount;
		
		synchronized (this) {
			
		
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
		
					e.printStackTrace();
				}
				
				System.out.println(Thread.currentThread().getName()+" deposit "+amount+" "+"balance "+balance);
		}
	}
}
