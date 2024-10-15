class DataShadowing1
{
 
int x=10;

void show(int x,DataShadowing1 t1)
{
//int x=20;
System.out.println(t1.x);
System.out.println(x);
}

public static void main(String ss[])
{

 DataShadowing1 t=new  DataShadowing1();
t.show(23,t);
  
}

}

 
