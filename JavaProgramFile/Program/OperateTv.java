class MasterRemote
{

void channelChange()
{}

void colorChange()
{}

void volumneChange()
{}

}

class OnidaTv extends MasterRemote
{
void channelChange()
{
System.out.println("channelChange of Onida Tv");
}

void colorChange()
{
System.out.println("colorChange of Onida Tv");
}

void volumneChange()
{
System.out.println("volumneChange of Onida Tv");
}
}

class LgTv extends MasterRemote
{
void channelChange()
{
System.out.println("channelChange of LgTv Tv");
}

void colorChange()
{
System.out.println("colorChange of LgTv Tv");
}

void volumneChange()
{
System.out.println("volumneChange of LgTv Tv");
}
}

class SamsungTv extends MasterRemote
{
void channelChange()
{
System.out.println("channelChange of SamsungTv Tv");
}

void colorChange()
{
System.out.println("colorChange of SamsungTv Tv");
}

void volumneChange()
{
System.out.println("volumneChange of SamsungTv Tv");
}
}

public class OperateTv
{

public static void main(String ss[])
{

try
{
Class c=Class.forName(ss[0]); 
MasterRemote m=(MasterRemote)c.newInstance();
m.channelChange();
m.colorChange();
m.volumneChange();
}
catch(Exception e)
{
System.out.println("Eneter the Name of TV....");
}
}

}
