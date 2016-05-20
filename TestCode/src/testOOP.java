
public class testOOP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user1=new User("Jero",26);
		
		User user2=user1;
		User user3=new User("Jero",26);
		
		
		
		System.out.println(user1.equals(user2));
		System.out.println(user1==user2);
		System.out.println(user1.equals(user3));
		System.out.println(user1==user3);
		
		//string is imutalbe object ,so it can use equals to compare. 
	    System.out.println("name compare: "+user1.getName().equals(user3.getName()));
		
	    System.out.println("name compare by == :"+(user1.getName()==user3.getName()));
	    
		
		
		user3.sayName();
	}

}
