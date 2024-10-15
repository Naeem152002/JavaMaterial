public class AderiodDevFactory extends EmployeeAbstractFactory {

    @Override
    public Employee createEmployee() {
       return new WebDevloper();
    }



    
}
