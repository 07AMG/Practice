package controlStatmentPrac;

public class NestedIfMock {

	public static void main(String[] args) 
	
	{
		String user="ank";
		String pass="an12";
		if (user=="ank") 
		{
			System.out.println("user name allrady registred plz entr pass");
	      if (pass=="an12") 
	      {
			System.out.println("coreect pass u can buy product");
		  }
	      else 
	      {
	    	  System.out.println("incoreect pass");
	      }
	    }
		else {
			System.out.println("user name not valid unregistred coustmore");
		}
       System.out.println("=============================================================");
		NestedIfMock bb=new NestedIfMock();
		bb.anku();
	}
	public void anku()
	{
		int color=4;
		switch (color) 
		{
		case 1:System.out.println("apple is green");
		break;
		case 2:System.out.println("apple is red");
		break;
		case 3:System.out.println("apple is orange");
		break;
		default:System.out.println("this is not apple");
			break;
		}
	}
}
