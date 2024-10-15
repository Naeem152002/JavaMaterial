package com.linkedlist;


import java.util.*;	
class LinkedlistTest
{
public static void main(String g[]) 
{

	LinkedList l=new LinkedList();
        System.out.println(l);
	l.add("one");
	l.add("two");
	l.add("three");
	l.add("four");
        System.out.println(l);

System.out.println("****Traversal by Iterator:****");
	
	Iterator itr=l.iterator();
        System.out.println(itr);
	
	while(itr.hasNext())
	{
	System.out.println(itr.next());
	}



System.out.println("**Traversal by ListIterator:****");

	ListIterator ltr=l.listIterator();
	while(ltr.hasNext())
	{
	System.out.println(ltr.next());
	}

System.out.println("****Reverse Traversal by ListIterator:****");

	while(ltr.hasPrevious())
	{
	System.out.println(ltr.previous());

	}


System.out.println("existance of one:"+l.contains("one"));

System.out.println("****LinkedList as a deque****");

	LinkedList lq=new LinkedList(l);
	lq.add("five");
	lq.add("six");
	lq.add("seven");
	System.out.println(lq);
	lq.addFirst("first");
	
	lq.add(2,"Java");
	lq.addLast("last");
	System.out.println(lq);
	System.out.println(lq.getFirst());
	System.out.println(lq.getLast());
	lq.removeFirst();
	lq.removeLast();
	System.out.println(lq);



System.out.println("****LinkedList as a Stack****");

	LinkedList ls=new LinkedList();
	
	ls.push("one");
	ls.push("two");
	ls.push("three");
	ls.push("four");

	System.out.println(ls.pop());
        System.out.println(ls.pop());
	
        System.out.println(ls.pop());	
        System.out.println(ls.peek());	
  
System.out.println(ls.pop());
	System.out.println(ls.peek());

}
}

