package com.bridgelabz.employeewage;

import java.util.ArrayList;

public class EmployeeWage implements interface_companyEmpWage {
	/* Constant Variables. */
	final int isFullTime = 2;
	final int isPartTime = 1;

	// initializing array
	static ArrayList<CompanyEmpWage> companyEmpWageArray = new ArrayList<CompanyEmpWage>();

	// adding company details into an array
	public void addCompanyEmpWage(String companyName, int totalWorkingDays, int maxHrsPerMonth, int empRatePerHr) {

		CompanyEmpWage CompanyEmpWage = new CompanyEmpWage(companyName, totalWorkingDays, maxHrsPerMonth, empRatePerHr);
		companyEmpWageArray.add(CompanyEmpWage);
	}

	// setting total employee wage in an array for multiple companies.
	public void computationOfEmpWage() {
		for (int i = 0; i < companyEmpWageArray.size(); i++) {
			CompanyEmpWage companyEmpWage = companyEmpWageArray.get(i);
			companyEmpWage.setTotalEmpWage(this.computationOfEmpWage(companyEmpWage));
			System.out.println(companyEmpWage);
		}
	}

	// calculation of total employee wage
	public int computationOfEmpWage(CompanyEmpWage companyEmpWage) {

		/* Temporary Variables */
		int empHrs = 0;
		int empWage = 0;

		int totalEmpHrs = 0;
		int numOfDays = 0;

		/* Finding employee is present or absent */
		while (totalEmpHrs <= companyEmpWage.maxHrsPerMonth && numOfDays < companyEmpWage.totalWorkingDays) {
			numOfDays++;
			int empCheck = (int) Math.floor(Math.random() * 3);
			switch (empCheck) {
			case isFullTime:
				empHrs = 8;
				break;
			case isPartTime:
				empHrs = 4;
				break;
			default:
				empHrs = 0;
			}
			/* Calculate employee total wage */
			totalEmpHrs += empHrs;
			empWage = totalEmpHrs * companyEmpWage.empRatePerHr;
			companyEmpWage.totalEmpWage = companyEmpWage.totalEmpWage + empWage;

			// storing daily wage along with total wage.
			System.out.println(companyEmpWage.companyName + " DAY-" + numOfDays + " wage:- " + empWage
					+ " and employee hours :- " + empHrs);
		}
		return companyEmpWage.totalEmpWage; // returning total employee wage
	}

	// Ability to get total wage when queried by company.
	public void getTotalWage(String companyName) {
		for (int i = 0; i < companyEmpWageArray.size(); i++) {
			String name = companyEmpWageArray.get(i).companyName;
			if (name.equals(companyName)) {
				int totalWage = companyEmpWageArray.get(i).totalEmpWage;
				System.out.println(companyName + " employee total wage :- " + totalWage);
				break;
			} else {
				continue;
			}
		}
	}
}