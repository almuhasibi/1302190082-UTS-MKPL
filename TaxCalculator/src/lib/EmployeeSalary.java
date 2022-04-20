package lib;

public class EmployeeSalary extends Employee{

    private int monthSalary;
	private int otherMonthlyIncome;
	private int annualDeductible;

    public EmployeeSalary(Employee worker){
        super(worker.getFirstName(), worker.getLastName(), worker.getEmployeeId(), 
        worker.getAddress(), worker.getForeigner());
    }

    public void setmonthSalary(int grade) {	
		if (grade == 1) {
			monthSalary = 3000000;
			foreignerSalary(monthSalary);
		}else if (grade == 2) {
			monthSalary = 5000000;
			foreignerSalary(monthSalary);
		}else if (grade == 3) {
			monthSalary = 7000000;
			foreignerSalary(monthSalary);
		}
        
	}
    public int getMonthSalary(){ 
        return monthSalary;
    }
 
    public void foreignerSalary(int monthSalary){  
    }
	
	public void setAnnualDeductible(int deductible) { 
		this.annualDeductible = deductible;
	}
	
	public void setAdditionalIncome(int income) {	 
		this.otherMonthlyIncome = income;
	}

    public int getAnnualDeductible(){ 
        return annualDeductible;
    }

    public int getAddtionalIncome(){ 
        return otherMonthlyIncome;
    }
}
