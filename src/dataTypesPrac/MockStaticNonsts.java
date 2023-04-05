package dataTypesPrac;

public class MockStaticNonsts {

	public static void main(String[] args) 
	{
		ankit();
		
       MockStaticNonsts cu=new MockStaticNonsts();
       cu.godwe();
	}

	
	public static void ankit()//static method
	{
		System.out.println("im ankit from team 6");
	}
	
	public void godwe()//non static method
	{
		System.out.println("im non static member from team 6");
	}
}
