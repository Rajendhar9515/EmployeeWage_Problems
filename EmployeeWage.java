package com.bridgelabz.employeewage;

public class EmployeeWage {
	public static void main(String[] args) {
		int isPartTime = 1;
		int isFullTime = 2;
		int empRatePerHr = 20;
		int empWage = 0;
		int empHrs = 0;
		double empCheck = Math.floor(Math.random() * 10) % 3;
		if (empCheck == isFullTime) {
			empHrs = 8;
		} else if (empCheck == isPartTime) {
			empHrs = 4;
		} else {
			empHrs = 0;
		}
		empWage = (empHrs * empRatePerHr);
		System.out.println("EmpWage :" + empWage);

	}

}
