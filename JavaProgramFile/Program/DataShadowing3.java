class DataShadowing3
{
 
int x=10;

DataShadowing3()
{
System.out.println(this);
}

void show(int x)
{
System.out.println(this.x);
System.out.println(x);
System.out.println(this);

}

public static void main(String ss[])
{

DataShadowing3 t=new DataShadowing3();
t.show(23);
System.out.println(t);  

DataShadowing3 t1=new DataShadowing3();
t1.show(34);
System.out.println(t1);  

}

}