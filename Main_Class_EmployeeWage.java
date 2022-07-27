package com.bridgelabz.employeewage;

public class Main_Class_EmployeeWage {
	public static void main(String[] args) {
		System.out.println("WELCOME TO EMPLOYEE WAGE COMPUTATION PROGRAM.\n");

		// creating object of employeeWage class.
		interface_companyEmpWage obj = new EmployeeWage();

		// adding companies into an array
		obj.addCompanyEmpWage("BridgeLabz", 30, 100, 50);
		obj.addCompanyEmpWage("Tech-Mahindra", 25, 80, 40);
		obj.addCompanyEmpWage("Infosys", 35, 90, 45);

		obj.computationOfEmpWage(); // calling method for computation.

		// get total wage when queried by company
		obj.getTotalWage("BridgeLabz");
	}
}
