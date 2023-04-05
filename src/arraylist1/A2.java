package arraylist1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class A2 {

	public static void main(String[] args) 
	{
	ArrayList<Integer> al=new ArrayList<>();

	al.add(1);
	al.add(2);
	al.add(3);
	al.add(4);
	al.add(5);
	
    System.out.println(al);
	System.out.println("**********************************");

	for(int i=0;i<=al.size()-1;i++)
	{
		System.out.println(al.get(i));
	}
	System.out.println("**********************************");

	Iterator<Integer> it = al.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	System.out.println("**********************************");

    ListIterator<Integer> li = al.listIterator();
	while(li.hasNext())
	{
		System.out.println(li.next());
	}
	System.out.println("**********************************");
    
	for(Integer b:al)
	{
		System.out.println(b);
	}
	System.out.println("**********************************");

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
