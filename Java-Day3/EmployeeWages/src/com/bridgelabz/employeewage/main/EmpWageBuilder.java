package com.bridgelabz.employeewage.main;


public class EmpWageBuilder {
	public static final int fullTime = 1;
	public static final int partTime = 2;
	
	private  String company;
	private  int hrWages;
	private  int workingDays;
	private  int workingHours;
	static double EmpWages;
	
	public EmpWageBuilder(String company, int hrWages, int workingDays, int workingHours) {
		this.company=company;
		this.hrWages=hrWages;
		this.workingDays=workingDays;
		this.workingHours=workingHours;
	}

	
	private double CompanyEmpWage(){
		int TotalWorkingHours=0;
		int TotalWorkingDays=0;
		
		double TotalWages = 0;
		while(TotalWorkingHours<=workingHours && TotalWorkingDays <=workingDays ) {
			TotalWorkingDays++;
			int empID= (int) Math.floor(Math.random()*10)%3;
			switch (empID) {
				case fullTime :{
					TotalWorkingHours=+8;
					break;
			}
				case partTime :{
					TotalWorkingHours=+4;
					break;
			}
				default : {
					TotalWorkingHours=+0;
					
				}
			}
			EmpWages = TotalWorkingHours*hrWages*workingDays;
			TotalWages += EmpWages;
		}
		return TotalWages;
		
	}


	public static void main(String[] args) {
		
		System.out.println("Welcome to Employee Wage Computation\r\n" + 
				"Program on Master Branch\n\n");
		
		EmpWageBuilder DayMart = new EmpWageBuilder("DayMart",20,20,100);
		EmpWageBuilder YMall = new EmpWageBuilder("YMall",10,20,100);
		EmpWageBuilder LuluMall = new EmpWageBuilder("LuluMall",15,20,100);
		
		System.out.println("Total Monthly wages of "+DayMart.company+" is : Rs "+DayMart.CompanyEmpWage());
		System.out.println("Total Monthly wages of "+YMall.company+" is : Rs "+YMall.CompanyEmpWage());
		System.out.println("Total Monthly wages of "+LuluMall.company+" is : Rs "+LuluMall.CompanyEmpWage());



	}
}
