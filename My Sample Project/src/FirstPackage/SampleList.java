package FirstPackage;

import java.util.LinkedList;
import java.util.ListIterator;

public class SampleList {

	public static void main(String[] args)
	{
		LinkedList<String> l1=new LinkedList<>();
		l1.add("abc");
		l1.add("xyz");
		l1.add("pqr");
		l1.add("ttt");
		System.out.println(l1);
		
		ListIterator<String> litr=l1.listIterator();
		while(litr.hasNext())
		{
			String s=litr.next();
			if (s.equals("pqr"))
				litr.set("hhh");
		}
				System.out.println(l1);
	}
}
