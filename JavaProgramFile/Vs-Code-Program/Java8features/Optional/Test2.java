class Emp{
    private String email;

    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }

}
class Dao{
    public String getEmpInfo(int id){
        Emp e=new Emp();
        e.setEmail("naeem@gamil.com");
        return e.getEmail();
    }
}



public class Test2 {
    public static void main(String[] args) {

        Dao dao=new Dao();
        String email=dao.getEmpInfo(2);
        System.out.println(email);
        
    }
    
    
}
