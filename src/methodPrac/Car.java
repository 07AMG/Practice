package methodPrac;

public class Car {

	public static void main(String[] args)
	{
		flower();
		//called static method from same class
	
		Car baleno=new Car();
		baleno.velocity();
		//===========================================
		
		Bike.superman();
		
		Bike e=new Bike();
		e.superwomen();

	}

	public static void flower()
	{
		System.out.println("heloo anku");
	}
//==================================================	
	public void velocity()
	{
		System.out.println("heloo prishu");
	}
}
