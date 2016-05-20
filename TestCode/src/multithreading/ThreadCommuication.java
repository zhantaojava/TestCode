package multithreading;
/**
 * 
 * Thread communication means ,multiple thread access same resouse,but difference action.
 * @author suzhantao
 *
 */
public class ThreadCommuication {
	 public static void main(String args[]){
		 Res r=new Res();
		 Input in=new Input(r);
		 Output out=new Output(r);
		 
		 Thread t1=new Thread(in);
		 Thread t2=new Thread(out);
		 
		 t1.start();
		 t2.start();
	 }
}


class Res{
	String name;
	String sex;
	boolean flag;
}

class Input implements Runnable{
	private Res r;
	
	Input(Res r){
		this.r=r; 
		
	}
	public void  run() {
		int x=0;
		while(true){
			  
			if(r.flag){
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			synchronized(r){
				if(x==0){
					r.name="mike";
					r.sex="male";
					x=1;
				}
				else if(x==1){
					r.name="丽丽";
					r.sex="女";
					x=0;
				}
				
				r.flag=true;
				notify();
			}
						
		}
	}
	
}

class Output implements Runnable{
	private Res r;
	
	Output(Res r){
		this.r=r; 
		
	}  
	public void run() {
		while(true){
			System.out.println(r.name+"...."+r.sex);
		}
	}
	
}