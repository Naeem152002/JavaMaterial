public class Main1 {
    public static void main(String[] args) throws InterruptedException {

        NetworkConnection1 n = new NetworkConnection1();
        n.setIp("192.168.4.4");
        n.loadVeryImportantData();

        System.out.println(n);

        // we want new objec t of network connection
        // shallow copy
        try {
            NetworkConnection1 n2 = (NetworkConnection1) n.clone();
            n2.getDomains().remove(0);
            System.out.println(n2);
            NetworkConnection1 n3 = (NetworkConnection1) n.clone();
            System.out.println(n3);
        } catch (CloneNotSupportedException e) {

            e.printStackTrace();
        }
    }
}
