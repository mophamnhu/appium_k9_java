package lab_07;

import java.util.ArrayList;
import java.util.List;

public class MainClass extends TotalSalaryEmployees{

    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();
        int salaryTotal = 0;

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

        TotalSalaryEmployees finalSalary = new TotalSalaryEmployees();
        System.out.println("total salary of 5 employees: "+ finalSalary.calTotalSalary(employeeList));
    }

}
