package org.mycopmpany.view;

import org.mycopmpany.service.EmployeeService;

public class EmployeeView {
	static int employeeId;
	int employeeInitial;
	int employeeSalary;
		
    	
    
	public static void main(String[] args) {
		EmployeeService employeeServiceObj=new EmployeeService();
		int id1=employeeServiceObj.EmployeeId1(1,'A',15000);
		int employeeId = 1;
		System.out.println("EmployeeId:"+employeeId);
		EmployeeService employeeServiceObj1=new EmployeeService();
		char initial1=employeeServiceObj1.EmployeeInitial(1,'A',15000);
		char employeeInitial = 'A';
		System.out.println("EmployeeInitial:"+employeeInitial);
		EmployeeService employeeServiceObj11=new EmployeeService();
		int increment=employeeServiceObj11.calculateSalaryIncrement(1,'A',15000);
		System.out.println("enter updated salary");
		System.out.println(increment);
		

	}

}
