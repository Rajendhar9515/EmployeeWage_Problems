package com.bridgelabz.employeewage;

public class CompanyEmpWage {
	final String companyName;
	final int totalWorkingDays;
	final int maxHrsPerMonth;
	final int empRatePerHr;

	int totalEmpWage;

	// initialising constructors
	public CompanyEmpWage(String companyName, int totalWorkingDays, int maxHrsPerMonth, int empRatePerHr) {
		super();
		this.companyName = companyName;
		this.totalWorkingDays = totalWorkingDays;
		this.maxHrsPerMonth = maxHrsPerMonth;
		this.empRatePerHr = empRatePerHr;
	}

	// initialising getter and setter for totalEmpWage variable
	public int getTotalEmpWage() {
		return totalEmpWage;
	}

	public void setTotalEmpWage(int totalEmpWage) {
		this.totalEmpWage = totalEmpWage;
	}

	// overriding toString method to return in required string format.
	@Override
	public String toString() {
		return companyName + " employee total wage :- " + totalEmpWage;
	}

}
