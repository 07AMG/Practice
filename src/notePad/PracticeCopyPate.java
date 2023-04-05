package notePad;

public class PracticeCopyPate {

	public static void main(String[] args) 
	{   addition();
		info();
		gender();
	PracticeCopyPate cp=new PracticeCopyPate();
	cp.student();
	cp.subtraction();
	cp.nature();
	}

	public static void info()

	{
	System.out.println("hello ma'am");
	}
	
	public void student()
	{
	System.out.println("Im Ankit form sction B");
	}

	public static void addition()
	{
	int a=1;
	int b=2;
	int sum=a+b;
	System.out.println("addition of a and b is "+sum);
	}

	public void subtraction()
	{
	String name="ANKIT";
	System.out.println("my name is "+name);
	}
	public static void gender()
	{
	char gender='f';
	System.out.println("gender is "+gender);
	}


	public void nature()
	{
	float weight=23.45f;
	System.out.println("my weight is "+weight);
	}
	
	
}
