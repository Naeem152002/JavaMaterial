public class Main {
    public static void main(String[] args) throws InterruptedException {

       NetworkConnection n= new NetworkConnection();
       n.setIp("192.168.4.4");
       n.loadVeryImportantData();

       System.out.println(n);

       //we want new objec t of network connection
//shallow copy
        try {
            NetworkConnection n2=(NetworkConnection) n.clone();
            n2.getDomains().remove(0);
            System.out.println(n2);
            NetworkConnection n3=(NetworkConnection) n.clone();
            System.out.println(n3);
        } catch (CloneNotSupportedException e) {
            
            e.printStackTrace();
        }
    }
}
