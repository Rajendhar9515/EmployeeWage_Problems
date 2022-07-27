package com.bridgelabz.employeewage;

public class EmployeeWage {
	public static final int isPartTime = 1;
	public static final int isFullTime = 2;
	public static final int empRatePerHr = 20;
	public static final int numOfWorkingDays = 1;
	public static final int maxHrsInMonth = 10;

	public static void main(String[] args) {
		int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
		while (totalEmpHrs <= maxHrsInMonth && totalWorkingDays < numOfWorkingDays) {
			totalWorkingDays++;
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;
			switch (empCheck) {
			case isPartTime:
				empHrs = 4;
				break;
			case isFullTime:
				empHrs = 8;
				break;
			default:
				empHrs = 0;
			}
			totalEmpHrs += empHrs;
			System.out.println("Day#: " + totalWorkingDays + " empHr:" + empHrs);
		}
		int totalempWage = totalEmpHrs + empRatePerHr;
		System.out.println("Total empWage: " + totalempWage);
	}
}
