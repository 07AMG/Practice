package methodPrac;

public class Methodpratice2 {

	public static void main(String[] args) 
	{
		//calling static method from another class
		MethodPratice.m1();
		
		//calling non static method from another class
		MethodPratice a=new MethodPratice();
		a.m2();
		
Methodpratice2 b=new Methodpratice2();
b.a();
	}

	
	public void a()
	{
		System.out.println("=========================");
		String animal="lion";
		System.out.println(animal+" is king of jungle");
	}
	
	
	
	
}
