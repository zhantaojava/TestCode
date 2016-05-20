package Pratices;

public enum Calculator {
	Plus,
	Minus,
	Multiply,
	Divide;
	
	
	double calculate(double x,double y){
		
		switch(this){
		case Plus:
			return x+y;
		case Minus:
			return x-y;
		case Multiply:
			return x*y;
		case Divide:
			return x/y;
			
		default:
			throw new AssertionError("Unknown operations " + this);
		}
		
		
		
		
		
		
	}
}
