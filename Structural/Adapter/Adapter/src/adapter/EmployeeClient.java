/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Stephen
 */
class EmployeeClient {
    public List<Employee> getEmployeeList(){
        List<Employee> employees = new ArrayList<>();
        
        Employee employeeFromDB = new EmployeeDB("1234","John","Wick","john@wick.com");
        
        employees.add(employeeFromDB);
        
        EmployeeLdap employeeFromLdap = new EmployeeLdap("chewie", "Solo", "Han", "Han@so.com");
        
        employees.add(new EmployeeAdapterLdap(employeeFromLdap));
        
        EmployeeCSV employeeFromCSV = new EmployeeCSV("567, Sherlock, Holmes, sherlock@holmes.com");
        
        employees.add(new EmployeeAdapterCSV(employeeFromCSV));
        
        return employees;
    }
}
