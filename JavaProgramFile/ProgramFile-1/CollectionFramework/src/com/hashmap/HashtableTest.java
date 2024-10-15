package com.hashmap;

import java.util.*;
class HashtableTest
{
public static void main(String g[])
{
Hashtable hm=new Hashtable();
System.out.println(hm.put("001","ram"));
hm.put("002","shyam");
hm.put("003","mohan");
System.out.println(hm.put("002","ravi"));
System.out.println(hm.put("001","ram"));
System.out.println(hm);
}
}
