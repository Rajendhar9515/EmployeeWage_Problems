package com.bridgelabz.employeewage;

public class Main_Class_EmployeeWage {
	public static void main(String[] args) {
		System.out.println("WELCOME TO EMPLOYEE WAGE COMPUTATION PROGRAM.\n");

		// creating object of employeeWage class.
		EmployeeWage obj = new EmployeeWage();

		// adding companies into an array
		obj.addCompanyEmpWage("BridgeLabz", 20, 100, 40);
		obj.addCompanyEmpWage("Tech-Mahindra", 22, 90, 30);
		obj.addCompanyEmpWage("Infosys", 25, 80, 20);

		obj.computationOfEmpWage(); // calling method for computation.

	}
}
