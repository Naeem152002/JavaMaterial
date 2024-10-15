/*computer ke object main speaker ka refernce hain aur refrence main speaker ka object hide hain isliye yaha per object to object call ho raha hain*/
class Computer
{
Cpu c;
Ram r;
Speaker s;
Hdd h;

Computer()
{
c=new Cpu();
r=new Ram();
h=new Hdd();
s=new Speaker();
}

public static void main(String ss[])
{
Computer c=new Computer();
c.s.speaker();//OGNL-object graph neviagation langauge
 
}
}


class Cpu
{
Cpu()
{
System.out.println("Cpu is Strong....");
}


}

class Ram
{
Ram()
{
System.out.println("Ram is Strong....");

}


}

class Speaker
{

void speaker()
{
System.out.println("Speaker is Weaker....");

}

}


class Hdd
{

void hdd()
{
System.out.println("Hdd is Weak....");
}
}