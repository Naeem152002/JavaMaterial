abstract class MasterRemote
{

    abstract void changeVolume();
    abstract void changeColor();
    abstract void changeChannel();
}
class OnidaTv   extends MasterRemote
{
    void changeVolume()
    {
        System.out.println("OnidaTV volume changed");
    }
    void changeColor()
{
    System.out.println("OnidaTV color changed");
 }

    void changeChannel()
{
    System.out.println("OnidaTV channel changed");
 }




}
class LGTv   extends MasterRemote
{
    void changeVolume()
    {
        System.out.println("LGTV volume changed");
    }
    void changeColor()
    {
        System.out.println("LGTV color changed");
    }
    void changeChannel()
    {
        System.out.println("LGTV channel changed");
    }

}    



class WesternTv   extends MasterRemote
{
    void changeVolume()
    {
        System.out.println("WesternTV volume changed");
    }
    void changeColor()
    {
        System.out.println("WesternTV color changed");
    }
    void changeChannel()
    {
        System.out.println("WesternTV channel changed");
    }

}
class Abstract
{
      public static void main(String args[])
      { 
       try
        {
        Class c = Class.forName(args[0]);
        MasterRemote m = (MasterRemote)c.newInstance();
        m.changeVolume();
        m.changeColor();
        m.changeChannel();
       }
       catch(Exception e)
       {
          System.out.println(e);
          System.out.println("Please enter class name");
        }
      }

}


