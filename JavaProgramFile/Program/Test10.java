class Test
{

int x=10;
static int y=20;
void printMethod(){
disp();
show();
}
Test(){
disp();
System.out.println(y);
show();
System.out.println(x);
System.out.println(y);
}

void show()
{
disp();
System.out.println(y);
System.out.println(x);
System.out.println("show");
}

static void disp()
{
System.out.println(y);
System.out.println("disp");
}

public static void main (String args[]){
//non static D.M same class 
Test t=new Test();
System.out.println(new Test().x);
System.out.println(t.x);
System.out.println(y);

//non static M.F same class
new Test().show();
t.show();

//static D.M
System.out.println(new Test().y);
System.out.println(t.y);
System.out.println(Test.y);

// static M.F same class
new Test().disp();
t.disp();
Test.disp();
disp();

}
}
class B{
public static void main(String args[]){
//non static D.M other class 
Test t=new Test();
System.out.println(new Test().x);
System.out.println(t.x);

//non static M.F other class
new Test().show();
t.show();

//static D.M other class 
System.out.println(new Test().y);
System.out.println(t.y);
System.out.println(Test.y);

// static M.F same class
new Test().disp();
t.disp();
Test.disp();




}}
