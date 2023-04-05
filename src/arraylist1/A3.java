package arraylist1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class A3 {

	public static void main(String[] args) 
	{
	 ArrayList<Character> al=new ArrayList<>();
	 al.add('A');
	 al.add('B');
	 al.add('C');
	 al.add('D');
	 al.add('E'); 
	 al.add('F');
	
	 System.out.println(al);
	 System.out.println("**********************************");
 
	 for(int i=0;i<=al.size()-1;i++)
	 {
		 System.out.println(al.get(i));
	 }
	 System.out.println("**********************************");

	 for(Character q:al)
	 {
		 System.out.println(q);
	 }
	 System.out.println("**********************************");

	 Iterator<Character> it = al.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	 System.out.println("**********************************");

     ListIterator<Character> li = al.listIterator();	
	while(li.hasNext())
	{
		System.out.println(li.next());
	}
	 System.out.println("**********************************");

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
