package designPattern;

public class FactoryPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gun gun=GunFactory.getGun("AK47");
		gun.shot();
		
		Gun gun1 =GunFactory.findGun("m4a1");
		gun1.shot();
	}

}

interface Gun{
	public void shot();
}

interface Color{
	public void paint();
}

class AK47 implements Gun{

	@Override
	public void shot() {
		System.out.println("AK47....papapapa");
	}
	
}


class M4A1 implements Gun{

	@Override
	public void shot() {
		System.out.println("M4A1....biubiubiu");
	}
	
}
class HK416 implements Gun{

	@Override
	public void shot() {
		System.out.println("HK416....dadadada");
	}
}

class GunFactory{
	public static Gun getGun(String pick)
	  {
	    if ( pick.equals("AK47") )
	      return new AK47();
	    else if ( pick.equals("M4A1") )
	      return new M4A1();
	    else if ( pick.equals("HK416") )
	      return new HK416();
	 
	    return null;
	  }
	
	
	public static Gun findGun(String gun){
		switch( gun.toUpperCase()){
		case "AK47" :
			return new AK47();
		case "M4A1":
			return new M4A1();
		case "HK416" :
			return new HK416();
		default :
			break;
		}
		return null;
	}
}



