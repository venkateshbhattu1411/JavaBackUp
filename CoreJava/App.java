interface Menu{
	
	public abstract void hotelInfo();
	public abstract void prepareItem();
	
}

abstract class menuAbs implements Menu{
	
	public void hotelInfo() {
		
		System.out.println("welcome to Taj Banjara");
	}
}

class IndianCookie extends menuAbs{
	
	public void prepareItem() {
		
		System.out.println("food prepared by indian cookie");
	}
}

class ChineesCookie extends menuAbs{
	
	public void prepareItem() {
		
		System.out.println("food prepared by chinees cookie");
	}
}

class AmericanCookie extends menuAbs{
	
	public void prepareItem() {
		
		System.out.println("food prepared by American cookie");
	}
}

class customer{
	
	public void orderItem(Menu m) {
		
		m.prepareItem();
	}
}


public class App 
{
    public static void main( String[] args )throws Exception
    {
    	if(args.length == 1) {
    		
    		Class c=Class.forName(args[0]);
    		Menu m=(Menu)c.newInstance();
    		m.hotelInfo();
    		
    		customer cus=new customer();
    		cus.orderItem(m);
    		
    	}else {
    		
    		System.out.println("enter cookie name as argument");
    	}
    	
    }
}
