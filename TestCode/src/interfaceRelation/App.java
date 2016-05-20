package interfaceRelation;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c=new ChildImpl2();
		
		c.getChildName();
		c.getParentName();
		
		//ChildImpl2实现了 Child接口  ，总共只有两个方法 
	
		Parent p=new ParentImpl();
		
		p.getParentName();
		//parentImpl实现了 Parent接口 ，Parent接口只提供一个方法
		
		
	}

}
