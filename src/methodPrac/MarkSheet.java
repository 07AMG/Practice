package methodPrac;

public class MarkSheet {

	public static void main(String[] args) 
	{
		MarkSheet mo=new MarkSheet();
		mo.marks("ANKIT GODWE", "CIVIL", 145, 66, 70, 80, 40);
        mo.marks("SAYALI GODWE", "ZOOLOGY", 160, 77, 84, 78, 90);
	    mo.marks("AMIT GODWE", "ENTC", 621, 78, 87, 67, 59);
	    mo.marks("NEHA GODWE", "ENTC", 212, 50, 60, 90, 60);
	}

	public void marks(String name,String depart,int roll,int maths,int science,int histroy,int marathi)
	{
		float result=((maths+science+histroy+marathi)/4);
		System.out.println("==============================");
		System.out.println("______MUMBAI UNIVERSITY_______");
		System.out.println("==============================");
	    System.out.println("NAME       ="+name);
	    System.out.println("DEPARTMENT ="+depart);
	    System.out.println("ROLL NO    ="+roll);
	    System.out.println("==============================");
	    System.out.println("SUBJECT        MARKS");
	    System.out.println("MATHS           "+maths);
	    System.out.println("SCIENCE         "+science);
	    System.out.println("HISTORY         "+histroy);
	    System.out.println("MARATHI         "+marathi);
	    System.out.println("==============================");
	    System.out.println("PERCENTAGE      "+result+" %");
	    System.out.println("==============================");
	}
}
