
class Jalebi{

    private static Jalebi jalebi=new Jalebi();//yaha per object pahle hi bana rakha hain 

    private Jalebi(){

    }
    //Eager way of creating single object-object pahle hi create krke rakha hain jab jaroorat ho to lelo 
    public static Jalebi getJalebi(){
        
return jalebi;
    }
}

public class Test1{
public static void main(String[] args) {
           Jalebi jalebi1=Jalebi.getJalebi();
           System.out.println(jalebi1.hashCode());
          
        
           Jalebi jalebi2=Jalebi.getJalebi();
           System.out.println(jalebi2.hashCode());
          
        
    }
}