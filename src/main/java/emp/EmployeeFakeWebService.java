package emp;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by synerzip on 5/7/17.
 */
public class EmployeeFakeWebService {
    private List<Employee> employees = new ArrayList<Employee>();
    private static EmployeeFakeWebService employeeFakeWebService = null;

    private static int id = 6;

    private EmployeeFakeWebService(){
        this.employees.addAll(getDefaultEmployees());
    }
    public static EmployeeFakeWebService getInstance(){
        if (employeeFakeWebService == null){
            employeeFakeWebService = new EmployeeFakeWebService();
        }
        return employeeFakeWebService;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    private List<Employee> getDefaultEmployees(){
        List<Employee> employees = new ArrayList<Employee>();
        Employee employee1 = new Employee(1, "Amit Patel", "Manager");
        Employee employee2 = new Employee(2, "Kumar Gaurav", "Software Developer");
        Employee employee3 = new Employee(3, "Vijith Vijayan", "Software Developer");
        Employee employee4 = new Employee(4, "Awadhoot Lele ", "Software Developer");
        Employee employee5 = new Employee(5, "Yogesh Chinchanikar", "Tester");
        Employee employee6 = new Employee(6, "Dhanashree Tannirwar", "Tester");
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(employee5);
        employees.add(employee6);
        return employees;
    }


    public Employee get(int id) {
        for (Employee employee : employees) {
             if(employee.getId() == id){
                 return employee;
             }
        }
        return null;
    }

    public boolean delete(int id) {
        for (Employee employee : employees) {
            if(employee.getId() == id){
                return employees.remove(employee);
            }
        }
        return false;
    }

    public Employee add(Employee employee){
        employee.setId(++id);
        employees.add(employee);
        return employee;
    }

    public  Employee update(Employee updatedEmployee){
        int index;
        for (Employee employee : employees) {
            if(employee.getId() == employee.getId()){
                index = employees.indexOf(employee);
                employees.set(index, updatedEmployee);
                return updatedEmployee;
            }
        }
        return null;
    }

}
