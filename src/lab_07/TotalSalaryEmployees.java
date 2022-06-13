package lab_07;

import java.util.List;

public class TotalSalaryEmployees {

    public int calTotalSalary (List<Employee> employeeList){
        int totalSalary = 0;
        for (Employee index : employeeList) {
            totalSalary = totalSalary + index.getSalary();
        }
        return totalSalary;
    }
}
