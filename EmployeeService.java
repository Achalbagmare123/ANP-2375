package org.mycopmpany.service;

import org.mycopmpany.model.Employee;

public class EmployeeService {
       int employeeId, employeeInitial, employeeSalary;
   	public int EmployeeId1(int id,char initial,int salary) {
		int id1;
		id1=1;
		return id1;
   	}
    public char EmployeeInitial(int id,char initial,int salary) {
    	char initial1;
    	initial1='A';
		return initial1;
    }
       public int calculateSalaryIncrement(int id,char initial,int salary){
    	   int increment;
    	   increment=((15000*25)/100);
		return increment;
       }
	public static void main(String[] args) {
		Employee employeeObj1;
		employeeObj1=new Employee();
		Employee employeeObj2=new Employee();
		Employee employeeObj3=new Employee(1,'A',15000);
		 char initial=employeeObj3.getEmployeeInitial();
		 System.out.println("employeeObj3"+initial);
		 System.out.println("employeeObj1 initial"+employeeObj1.getEmployeeInitial());
		 EmployeeService employeeServiceObj=new EmployeeService();
		 int increment=employeeServiceObj.calculateSalaryIncrement(1,'A',15000);
		 System.out.println("percentage increment is:"+increment);


	

	
	}

}
