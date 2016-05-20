package interfaceRelation;

public class ChildImpl2 extends ChildAbstract {

	@Override
	public void getChildName() {
		System.out.println("I'm Child");
		
	}

	

	@Override
	public void getAbstract() {
		System.out.println("I'm abstract");
		
	}



	@Override
	public void getParentName() {
		System.out.println("I'm Father");
	}

}
