import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * use loop to retrieve the key and item
 * @author suzhantao
 *
 */
public class HashMap_KeySet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Map<String ,Integer> hm=new HashMap();
		hm.put("F50", 3);
		hm.put("Ace", 2);
		
		//such method can iterative
		for(String name:hm.keySet()){
			System.out.println(name);
			System.out.println(hm.get(name));
			System.out.println("Soccer shoes "+name+"'s quantity is "+hm.get(name));
		}
		
		
		Map<Shoes ,Integer> hm1=new HashMap();
		hm1.put(new Shoes("F50",199), 3);
		hm1.put(new Shoes("CR7",275), 2);
		
		for(Shoes shoes:hm1.keySet()){
			System.out.println("Product: "+shoes.getName());
			System.out.println("Price: "+shoes.getPrice());
			System.out.println("Quantity:"+hm1.get(shoes));
		}
	
	}
	
	

}
