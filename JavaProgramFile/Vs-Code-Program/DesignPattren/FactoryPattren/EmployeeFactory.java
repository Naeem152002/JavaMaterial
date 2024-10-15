public class EmployeeFactory {
    
    //get the employee
    public static Employee getEmployee(String empType){

        if(empType.trim().equalsIgnoreCase("ANDEROID DEVELOPER")){
            return new AndriodDevloper();
        }else  if(empType.trim().equalsIgnoreCase("WEB DEVELOPER")){
            return new WebDevloper();
        }else{
            return null;
        }
    }
}
