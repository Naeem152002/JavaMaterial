class Bulb{
int watt;
float price;
String color;
boolean state;

static int counter;
static String cname;

static {
counter=0;
cname="surya";
}
Bulb(){
watt=5;
price=12.5f;
color="yellow";
state=true;
}
Bulb(int a,float f,String s,boolean b){
watt=a;
price=f;
color=s;
state=b;
}


//Behaviour:-
void showDetails()
{
System.out.println("Watt="+watt);
System.out.println("Price="+price);
System.out.println("Color="+color);
System.out.println("State="+state);
System.out.println("company name="+cname);
}
{
counter++;
}
void changeState()
{
if(state==true){
state=false;
}else{
state=true;
}
}

static void countBulb()
{
System.out.println("Total bulb is counter="+counter);
}

 void changeCompanayName(String cn)
{
cname=cn;
}
public static void main(String args[]){
Bulb.countBulb();
System.out.println("*********same type of Bulb*********");
Bulb b1=new Bulb();
b1.showDetails();
Bulb b2=new Bulb();
b2.changeState();
b2.showDetails();
Bulb b3=new Bulb();
b3.showDetails();
System.out.println("*********different type of Bulb*********");
Bulb b4=new Bulb(6,13.5f,"white",true);
b4.showDetails();
Bulb b5=new Bulb(7,14.5f,"green",true);
b5.showDetails();
Bulb b6=new Bulb(8,15.5f,"pink",true);
b6.changeCompanayName("Osram");
b6.showDetails();
countBulb();

}
}