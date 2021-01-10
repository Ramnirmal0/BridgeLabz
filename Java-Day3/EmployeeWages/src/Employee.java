
public class Employee {
	public static final int fullTime = 1;
	public static final int partTime = 2;
	public static void main(String[] args) {
		int HrWages=20;
		int workingHour=0;
		double EmpWages;
		double TotalWages=0;
		int WorkingDays=0;
		int TotalWorkingDays=20;
		int TotalWorkingHours=100;
		System.out.println("Welcome to Employee Wage Computation\r\n" + 
				"Program on Master Branch\n\n");
		while(workingHour <=TotalWorkingHours && WorkingDays <=TotalWorkingDays) {
			
			int empID= (int) Math.floor(Math.random()*10)%3;
			switch (empID) {
				case fullTime :{
					workingHour+=8;
					WorkingDays++;
					break;
			}
				case partTime :{
					workingHour+=8;
					WorkingDays++;
					break;
			}
				default : {
					workingHour+=0;
				}
			}
			EmpWages = workingHour*HrWages*WorkingDays;
			TotalWages += EmpWages;
		}
		System.out.println("Total Monthly Wages of Employee : Rs "+ TotalWages);
	}
}
