import java.util.Optional;

class Emp1 {
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}

class Dao1 {
    public Optional<String> getEmpInfo(int id) {
        Emp1 e = new Emp1();
      // e.setEmail("rahul@gamil.com");
        return Optional.ofNullable(e.getEmail());
        
    }
}

public class Test3 {
    public static void main(String[] args) {

        Dao1 dao = new Dao1();
        Optional<String> email = dao.getEmpInfo(2);
       // System.out.println(email.get());
        System.out.println(email.orElseThrow());

    }

}
