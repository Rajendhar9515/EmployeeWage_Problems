package com.bridgelabz.employeewage;

public class EmployeeWage {
	public static final int isPartTime = 1;
	public static final int isFullTime = 2;

	public static int computeEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
		int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
		while (totalEmpHrs <= maxHoursPerMonth && totalWorkingDays < numOfWorkingDays) {
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
			totalEmpHrs = totalEmpHrs + empHrs;
			System.out.println("Day#: " + totalWorkingDays + "EmpHr: " + empHrs);
		}
		int totalEmpWage = totalEmpHrs * empRatePerHour;
		System.out.println("Total Emp Wage for Company: " + company + " is: " + totalEmpWage);
		return totalEmpWage;
	}

	public static void main(String[] args) {
		computeEmpWage("DMart", 20, 2, 10);
		computeEmpWage("Reliance", 10, 4, 20);
	}
}
