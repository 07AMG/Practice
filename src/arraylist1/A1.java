package arraylist1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class A1 {

	public static void main(String[] args) 
	{
		ArrayList<String> al=new ArrayList<>();
		
		al.add("ankit");
		al.add("sayali");
		al.add("neha");
		al.add("amol");
		al.add("amit");
		al.add("samapda");
		
		System.out.println(al);
		System.out.println("**********************************");
		
		for(int i=0;i<=al.size()-1;i++)
		{
			System.out.println(al.get(i));
		}
		System.out.println("**********************************");

		for(String a:al)
		{
			System.out.println(a);
		}
		System.out.println("**********************************");

		Iterator<String> it = al.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("**********************************");

		ListIterator<String> li = al.listIterator();
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		System.out.println("**********************************");

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
