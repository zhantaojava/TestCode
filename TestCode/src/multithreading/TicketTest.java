package multithreading;

public class TicketTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		TicketMaster t1=new TicketMaster();
//		TicketMaster t2=new TicketMaster();
//		TicketMaster t3=new TicketMaster();
//		TicketMaster t4=new TicketMaster();
//		
//		
//		t1.start();
//		t2.start();
//		t3.start();
//		t4.start();
		
		TicketMaster t=new TicketMaster();
		
		Thread thread1=new Thread(t);
		Thread thread2=new Thread(t);
		Thread thread3=new Thread(t);
		Thread thread4=new Thread(t);
		
		thread1.start();
		
		thread2.start();
		thread3.start();
		thread4.start();
		
	}

}
