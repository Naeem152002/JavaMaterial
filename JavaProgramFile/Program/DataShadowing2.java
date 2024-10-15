class DataShadowing2
{
 
int x=10;

void show(int x)
{
//int x=20;
System.out.println(this.x);
System.out.println(x);
}

public static void main(String ss[])
{

DataShadowing2 t=new DataShadowing2();
t.show(23);
  
}

}