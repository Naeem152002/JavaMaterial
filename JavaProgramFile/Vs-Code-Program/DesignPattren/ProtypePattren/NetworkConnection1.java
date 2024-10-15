import java.util.ArrayList;
import java.util.List;

public class NetworkConnection1 implements Cloneable {
    private String ip;
    private String importantData;
    private List<String> domains = new ArrayList<>();

    public String getIp() {
        return ip;
    }

    public List<String> getDomains() {
        return domains;
    }

    public void setDomains(List<String> domains) {
        this.domains = domains;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {


        //logic for clonning
        NetworkConnection1 n = new NetworkConnection1();
        n.setIp(this.getIp());
        n.setImportantData(this.getImportantData());

        for(String d:this.getDomains()){
            n.getDomains().add(d);
        }
        return n;
    }

    @Override
    public String toString() {
        return "NetworkConnection [ip=" + ip + ", importantData=" + importantData + ", domains=" + domains + "]";
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getImportantData() {
        return importantData;
    }

    public void setImportantData(String importantData) {
        this.importantData = importantData;
    }

    public void loadVeryImportantData() throws InterruptedException {
        this.importantData = "very very important data";
        domains.add("www.google.com");
        domains.add("www.youtube.com");
        domains.add("www.whatsapp.com");
        domains.add("www.skype.com");
        // Thread.sleep(2000);

    }
}