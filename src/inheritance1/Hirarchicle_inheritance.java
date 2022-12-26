package inheritance1;

public class Hirarchicle_inheritance 
{
public static void main(String[] args) 
{
	Mens m1  = new Mens();
	m1.shirt();
	m1.paymentmode();
	System.out.println("----------------");
	Female m2 = new Female();
	m2.kurti();
	m2.paymentmode();
	System.out.println("----------------");
	Kids m3 = new Kids();
	m3.kids_wear();
	m3.paymentmode();
}
}
class PaymentGateway
{
	public void paymentmode()
	{
		System.out.println(" Debit Card ");
		System.out.println(" Credit Card ");
		System.out.println(" UPI ");
		System.out.println(" EMI");
		System.out.println(" Paytm");
		System.out.println(" QR CODE");
		System.out.println(" Cash ON Delivery");
	}
}
class Mens extends PaymentGateway
{
	public void shirt()
	{
		System.out.println(" mens shirt ");
	}
}
class Female  extends PaymentGateway
{
	public void kurti() 
	{
		System.out.println(" female kurti ");
	}
}
class Kids extends PaymentGateway
{ 
	public void kids_wear()
	{
		System.out.println(" kids wear fashion ");
	}
}
