package methodPrac;

public class MethodPratice {

	public static void main(String[] args) 
	{
	m1();//static method 
	
	//for calling non static me have to create object in main method
	
	MethodPratice d=new MethodPratice();
	d.m2();
	

	}
	
	
public static void m1()
{
	int rollno=23;
	System.out.println("MY ROLL NO IS "+rollno);
	 
	long prn=123456789l;
	System.out.println("ankits prn no is "+prn);
	
	double weight=34.5555567d;
	System.out.println("ram's weight is "+weight);
	
	float salary=3020.4056f;
	System.out.println("my salary is "+salary);
	
	char male='m';
	System.out.println("my gender is "+male);
	
	boolean coronatest=true;
	System.out.println("my corona test was "+coronatest);
	
	String name="ankit";
	System.out.println("hes name is "+name);
	
	System.out.println("=========================");
	}
   

public void m2() 
{
	System.out.println("calling a non static method");
}
}
