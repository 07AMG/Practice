package arraylist1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class A4 {

	public static void main(String[] args) 
	{

		ArrayList<Object> al=new ArrayList<>();
		al.add("anku");
		al.add('a');
		al.add(26);
		al.add(null);
		al.add(30);
		al.add(null);
		al.add(21.1);
		System.out.println(al);
		System.out.println("**********************************");

		for(int i=0;i<=al.size()-1;i++)
		{
			System.out.println(al.get(i));
		}
		System.out.println("**********************************");

		for(Object a:al)
		{
			System.out.println(a);
		}
		System.out.println("**********************************");

		Iterator<Object> it = al.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("**********************************");

		ListIterator<Object> li = al.listIterator();
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		System.out.println("**********************************");

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
