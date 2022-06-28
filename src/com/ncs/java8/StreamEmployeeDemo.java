package com.ncs.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamEmployeeDemo {
    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(107,"mark", 55, "active", 3500));
        employeeList.add(new Employee(106,"john", 77, "active", 4500));
        employeeList.add(new Employee(105,"julia", 55, "inactive", 5500));
        employeeList.add(new Employee(104,"jonas", 88, "active", 6500));
        employeeList.add(new Employee(103,"maria", 99, "inactive", 2500));
        employeeList.add(new Employee(102,"raza", 77, "active", 7500));
        employeeList.add(new Employee(101,"carl", 99, "inactive", 8500));

        //display employee details based on their department

        Map<Integer, List<Employee>> employeesBaseOnDeptId =  employeeList.stream().collect(Collectors.groupingBy(Employee::deptId, Collectors.toList()));

        employeesBaseOnDeptId.entrySet().forEach( entry-> {
            System.out.println(entry.getKey() + " ==> "+ entry.getValue());
        });

        //display employees count working in each department
        Map<Integer, Long> empCountDept =  employeeList.stream().collect(Collectors.groupingBy(Employee::deptId, Collectors.counting()));
        empCountDept.entrySet().forEach(entry -> {
            System.out.println("dept: "+entry.getKey()+ " ==> "+ entry.getValue());
        });

        //active employees
       var activeCount =  employeeList.stream().filter(e -> "active".equals(e.status())).count();
       var inactiveCount =  employeeList.stream().filter(e -> "inactive".equals(e.status())).count();

        System.out.println("Active Employees Count : "+activeCount);
        System.out.println("Inactive Employees Count : "+inactiveCount);
    }
}
