package collections.list;

import java.util.ArrayList;
import java.util.Collections;

public class arraylist {
public static void main(String args[])
{
	ArrayList<String> l1= new ArrayList<String>();
	l1.add("sanjay");
	l1.add("prashanth");
	l1.add("srinivas");
	//preserves insertion order
	System.out.println("the initial list is "+l1);
	l1.add(1,"sudhir");
	//arraylist allows duplicates
	l1.add("sanjay");
	System.out.println("After changes the list is"+l1);
	l1.remove("sanjay");
	l1.set(2, "sanjay");
	int i=l1.indexOf("srinivas");
	String s=l1.get(1);
	System.out.println("now the list is"+l1);
	System.out.println("index of srinivas is "+i);
	System.out.println("object at the first position is "+s);
	Collections.sort(l1);
	System.out.println("the sorted list is "+l1);
	boolean t=l1.contains("sudhir");
	int j=l1.size();
	
	l1.clear();
	System.out.println("final form of the list is "+l1);
	System.out.println("does the list contain sudhir "+t);
}
}
