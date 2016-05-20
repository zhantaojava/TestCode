package designPattern;

public class SingltonPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton s=Singleton.getObject();
		Singleton ss=Singleton.getObject();
		
		// singleton object will return the same hashcode,no matter how many object you'd created
		System.out.println(s.hashCode());
		System.out.println(ss.hashCode());
		
		Dog d=new Dog();
		Dog dd=new Dog();
		System.out.println(d.hashCode());
		System.out.println(dd.hashCode());
		
	}
	
}


 class Singleton{
	
	private Singleton(){
		
	}
	
	private static Singleton instance = new Singleton();
	
	public static synchronized Singleton getObject(){
		return instance;
	}
}
 
 
 class Dog{
	 
	 
 }
