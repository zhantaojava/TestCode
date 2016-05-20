

/**
 * 
 * 遍历 用过value来遍历enum类的元素
 * 
 * @author suzhantao
 *
 */
public class EnmuTest {

	public static void main(String[] args) {
		    
		for(WeekDayEnum today:WeekDayEnum.values()){
			System.out.println(today);
		}
		
		System.out.println(WeekDayEnum.valueOf("Mon"));
	}
	
	
	public enum WeekDayEnum { Mon, Tue, Wed, Thu, Fri, Sat, Sun } 
    
	
}
