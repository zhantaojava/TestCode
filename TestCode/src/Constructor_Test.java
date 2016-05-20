
public class Constructor_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal dog=new Dog();
		System.out.println(dog.getName());
	}

}


class Animal{
	String name="animal";
	public String getName(){
		return name;
	}
	public Animal(){
		System.out.println("Animal "+name);
	}
}

class Dog extends Animal{
	String name="dog";
	public Dog(){
		
		System.out.println("Dog "+name);
	}
	
	
	public String getName(){
		return super.name;
	}
}
