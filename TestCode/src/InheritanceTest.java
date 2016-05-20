
public class InheritanceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c=new Child();
		
		//c.sing();
		
	}

}



class Parent{
	public Parent(){
		System.out.println("I'm father");
	}
	
	public Parent(int i){
		System.out.println(i);
	}
	
	public void sing(){
		
		System.out.println("parents sing");
	}
	
	String name="parents";
	
}

class Child extends Parent{
	public Child(){
		System.out.println("I'm child");
	}
	
	public Child(int i){
		super(i);
		System.out.println("child "+i);
	}
	
	
	public void sing(){
		
		super.sing();
		
		System.out.println("child sing");
	}
	
}



