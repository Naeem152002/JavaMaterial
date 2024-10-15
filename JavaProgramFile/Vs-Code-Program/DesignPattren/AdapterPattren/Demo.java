public class Demo{
    public static void main(String[] args) {
        System.out.println("program Started");
        AppleCharger charger=new AdapterCharger(new DkCharger());
        Iphone i=new Iphone(charger);
        i.chargeIphone();
    }
}