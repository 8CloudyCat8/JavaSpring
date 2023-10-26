package com.zaurtregulov.spring.rest;

import com.zaurtregulov.spring.rest.congiguration.MyConfig;
import com.zaurtregulov.spring.rest.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        Communication communication = context.getBean("communication", Communication.class);
//        List<Employee> allEmployees = communication.getAllEmployees();
//        System.out.println(allEmployees);

//        Employee empByID = communication.getEmployee(1);
//        System.out.println(empByID);

//        Employee emp = new Employee("Sveta", "Sokolova", "IT", 1200);
//        emp.setId(18);
//        communication.saveEmployee(emp);

        communication.deleteEmployee(18);


    }
}
