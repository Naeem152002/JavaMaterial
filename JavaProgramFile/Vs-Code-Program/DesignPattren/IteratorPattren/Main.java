public class Main{
    public static void main(String[] args) {
        
        UserManagement uman=new UserManagement();
uman.addUser(new User("durgesh","34"));
uman.addUser(new User("rhot","24"));
uman.addUser(new User("durgh","54"));
uman.addUser(new User("yogesh","33"));

              MyIterator i=uman.getIterator();
              while(i.hasNext()){
                User user=(User)i.next();
                System.out.println(user.getName());
              }


    }
}