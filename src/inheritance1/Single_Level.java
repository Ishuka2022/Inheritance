package inheritance1;
// example of singlelevel inheritance
public class Single_Level 
{
	public static void main(String[] args)
	{
		App2 a2 = new App2();
		a2.app1code();
		a2.app2code();
	}

}
class App1		//Super Class
{
	
	public void app1code()
	{
		System.out.println("This is Superclass.");
	}
}
class App2 extends App1		//Sub Class
{
	public void app2code() 
	{
		System.out.println(" This is sub class of app1");
		
    }
}