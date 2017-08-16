package collections.set;
import java.util.*;
public class hashset {
public static void main(String args[])
{
	
	HashSet<String> s1=new HashSet<String>();
	s1.add("dhawan");
	s1.add("rahul");
	s1.add("kohli");
	s1.add("pujara");
	//insertion order is not preserved
	System.out.println("the initial set is "+s1);
	s1.add("dhawan");
	//does not allow duplicates
	System.out.println(s1);
	HashSet<Integer> s2=new HashSet<Integer>();
for(int i=0;i<17;i++)
{
	s2.add(i);
}
System.out.println(s2);
	Iterator<Integer> itr=s2.iterator();
	while(itr.hasNext())
	{
		int i =itr.next();
		if(i%3==0)
		{
			System.out.println(i);
		}
		else
			itr.remove();
	}
	System.out.println(s2);
}
}
