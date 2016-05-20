package multithreading;

public class TicketMaster  implements Runnable // extends Thread 
{
		private  int tickets = 1000;
		Object obj=new Object();
		
		public void run() {
			while (true) {
				
					this.show();  
				
			}
		}
		public synchronized void show(){
			if (tickets > 0) {
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					System.out.println("Find exception: ");
					e.printStackTrace();
				}
				
				System.out.println("vendor "+Thread.currentThread().getName()+" sale :" + tickets--);
			}	
		}
	

}
