package com.hashmap;

import java.util.*;
class HashMapTest
{
public static void main(String g[])
{
LinkedHashMap<String,String> hm=new LinkedHashMap<String,String>();
hm.put("003","mohan");
hm.put("001","ram");
hm.put("002","shyam");
//hm.put("003","mohan");//yaha value update ho jayegi
hm.put("002","ravi");

System.out.println(hm);

System.out.println(hm.size());
System.out.println(hm.isEmpty());
System.out.println(hm.containsKey("100"));
System.out.println(hm.containsKey("001"));
System.out.println(hm.containsValue("ram"));
System.out.println(hm.get("002"));

Set sk=hm.keySet();//map ki key ka set return krke dega 

Iterator ktr=sk.iterator();
System.out.println("*****keys r*******");
while(ktr.hasNext())
{
System.out.println(ktr.next());
}

Collection cl=hm.values();//map mainvalues jo hoti hain wo collection type ki hoti hain

Iterator vtr=cl.iterator();
System.out.println("*****values r*******");
while(vtr.hasNext())
{
System.out.println(vtr.next());
}



Set se=hm.entrySet();//map ka pura set return krke dega 

Iterator etr=se.iterator();
System.out.println("*****entries r*******");
while(etr.hasNext())
{
Map.Entry m=(Map.Entry)etr.next();//iska type hain map type ka hain

System.out.println(m);//ye pura map ka set de dega 
System.out.println("key:"+m.getKey());
System.out.println("value:"+m.getValue());
}}}
