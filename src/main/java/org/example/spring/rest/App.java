package org.example.spring.rest;

import org.example.spring.rest.configuration.MyConfig;
import org.example.spring.rest.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Communication communication = context.getBean("communication", Communication.class);

//        List<Employee> allEmployees = communication.getAllEmployees();
//
//        System.out.println(allEmployees);

//        Employee employeeID = communication.getEmployee(6);
//        System.out.println(employeeID);

//        Employee employee = new Employee("Ilias", "Mustangov", "IT", 1700);
//        communication.saveEmployee(employee);
            communication.deleteEmployee(9);
    }
}
