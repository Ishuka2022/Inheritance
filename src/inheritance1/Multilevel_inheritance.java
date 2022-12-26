package inheritance1;
 // example of multilevel inheritnce
public class Multilevel_inheritance 
{
	public static void main(String[] args)
	{
		Feature4 s4 = new Feature4();
		s4.f1();
		s4.f2();
		s4.f3();
		s4.f4();
	}

}
class Feature1
{ 
	public void f1()
	{
		System.out.println(" app1 feature1 ");
	}
}
class Feature2 extends Feature1
{
	public void f2()
	{
		System.out.println(" app2 feature2 ");
	}
}
class Feature3 extends Feature2
{
	public void f3()
	{ 
		System.out.println(" app3 feature3");
	}
}
class Feature4 extends Feature3
{ 
	public void f4()
	{ 
		System.out.println(" app4 feature4 ");
	}
}