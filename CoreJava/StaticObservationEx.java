class Parent
	{
public static void display()
{
System.out.println(" Parent display()");
}
	}


class Child extends Parent
	{
public static void display()
{
System.out.println(" Child display()");
}
	}

public class StaticObservationEx
	{
public static void main(String args[])
{
	Parent p = new Child();
	p.display();
}
	}