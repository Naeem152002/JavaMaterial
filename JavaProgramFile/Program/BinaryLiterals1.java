public class BinaryLiterals1 {  
    public static void main(String[] args) {  

        byte b1 = 5;  
        byte b2 = 0b101;    
        byte b3 = -0b101;   
        byte b4 = 0b101_00_1;  
        System.out.println("b1 = "+b1);  
        System.out.println("b2 = "+b2);  
        System.out.println("b3 = "+b3);  
        System.out.println("b4 = "+b4);  
    
        System.out.println("is b1 and b2 equal: "+(b1==b2));  
        
        System.out.println("b2 + 1 = "+(b2+1));  
        System.out.println("b3 + 1 = "+(b3+1));  
        System.out.println("b4 x 2 = "+(b4*2));  
    }  
}  