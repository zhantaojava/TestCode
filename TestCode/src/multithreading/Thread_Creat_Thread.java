package multithreading;

public class Thread_Creat_Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d1=new Demo("D1");
		Demo d2=new Demo("D2");
		//d.setName("my-thread:");
		d1.start();
		d2.start();
		for(int i=0;i<60;i++){
			System.out.println("main thread "+i);
		}
	}
	
	
	
	
	
}
class Demo extends Thread{
	
	public Demo(String string) {
		super(string);
	}

	public void run(){
		for(int i=0;i<60;i++){
		
		System.out.println(Thread.currentThread().getName()+"  demo run "+i);
		}
	}
}



