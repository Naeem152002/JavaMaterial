class DataShadowing 
{
 
int x=10;

void show(int x)
{
//int x=20;
System.out.println(x);
System.out.println(x);
}

public static void main(String ss[])
{

DataShadowing  t=new DataShadowing();
t.show(23);
  
}

}