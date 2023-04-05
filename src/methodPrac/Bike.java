package methodPrac;

public class Bike {

	public static void main(String[] args)
	{
		Car.flower();
		
		Car swift=new Car();
		swift.velocity();
//=================================================
	superman();
	  
	Bike a=new Bike();
	a.superwomen();
	
	}

	public static void superman()
	{ int a=20;
	  int b=30;
	  int sum=a+b;
	  
		System.out.println("total sum is "+sum);
	}
	  
	public void superwomen()
	{ float a=23.30f;
	  float b=234.34f;
	  float sumb=a-b;
	  System.out.println("total sum is "+sumb);
		
	}
}
