import java.util.ArrayList;
import java.util.List;

public class CallCentre {
    public List<Employee> employeeList = new ArrayList<>();

    public void addEmployees(Employee employee1) {
        employeeList.add(employee1);
        System.out.println("employee is"+ employeeList);
    }

    public List<Employee> getEmployees() {
        return employeeList;
    }
}
