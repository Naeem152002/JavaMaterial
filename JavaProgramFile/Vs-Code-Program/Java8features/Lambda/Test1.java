
@FunctionalInterface
interface SumInter{

    int sum(int a,int b);  

}
@FunctionalInterface
interface Length{

    int sum(String str);  

}

public class Test1 {
    public static void main(String[] args) {
        

//first method 
    // SumInter i=(int a ,int b)->{
    //     return a+b;
    // };

//one statement 
    SumInter i=(a ,b) ->
     a+b;
  
  
     System.out.println (i.sum(4,7));


     Length l=str -> str.length();
    
}
}