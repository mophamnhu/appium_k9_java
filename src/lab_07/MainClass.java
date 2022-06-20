package lab_07;

import java.util.ArrayList;
import java.util.List;
public class MainClass{
    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();
        int employeeId = 1;

        Employee new_Employee_1 = new FullTimeEmployee();
        Employee new_Employee_2 = new FullTimeEmployee();
        Employee new_Employee_3 = new FullTimeEmployee();
        Employee new_Employee_4 = new ContractEmployee();
        Employee new_Employee_5 = new ContractEmployee();

        employeeList.add(new_Employee_1 );
        employeeList.add(new_Employee_2 );
        employeeList.add(new_Employee_3 );
        employeeList.add(new_Employee_4 );
        employeeList.add(new_Employee_5 );

        System.out.println("Salary of employees:");
        for (Employee employee : employeeList) {
            System.out.println("Employee: " + employeeId + "  " +  "$" + employee.getSalary());
            ++employeeId ;
        }
        System.out.println("Total salary of employee in the list is:  $" + MainClass.CalTotalSalary(employeeList));
    }
    public static int CalTotalSalary (List<Employee> employeeList) {
        int totalSalary = 0;
        for (Employee index : employeeList) {
            totalSalary = totalSalary + index.getSalary();
        }
        return totalSalary;
    }
}
