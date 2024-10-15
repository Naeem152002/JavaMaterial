public class Main {
    public static void main(String[] args) {
         User user=new User.UserBuilder().setEmailId("naeemkuraishi00786").setUserId("Naeem3838").setUserName("Naeem").build();
    System.out.println(user);
    
    
   User user2= User.UserBuilder.builder().
   setEmailId("naeemkaishi00786").
   setUserId("Naeem38").
   setUserName("Naem").build();
    System.out.println(user2);
}
}