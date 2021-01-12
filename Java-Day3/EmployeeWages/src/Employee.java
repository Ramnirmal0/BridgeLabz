
public class Employee {
	public static final int fullTime = 1;
	public static final int partTime = 2;
	
	private  String company;
	private  int hrWages;
	private  int workingDays;
	private  int workingHours;
	static double EmpWages;
	
	public Employee(String string, int i, int j, int k) {
		this.company=string;
		this.hrWages=i;
		this.workingDays=j;
		this.workingHours=k;
	}


	public static void main(String[] args) {
		
		System.out.println("Welcome to Employee Wage Computation\r\n" + 
				"Program on Master Branch\n\n");
		
		Employee Dmart = new Employee("D-mart",20,20,100);
		int TotalWorkingHours=0;
		int TotalWorkingDays=0;
		
		double TotalWages = 0;
		while(TotalWorkingHours<=Dmart.workingHours && TotalWorkingDays <=Dmart.workingDays ) {
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
			EmpWages = TotalWorkingHours*Dmart.hrWages*Dmart.workingDays;
			TotalWages += EmpWages;
		}
		System.out.println("Total Monthly Wages of "+Dmart.company +" Employee : Rs "+ TotalWages);
	}
}
