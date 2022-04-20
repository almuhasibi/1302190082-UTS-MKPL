package lib;

public class TaxFunction {	

	public static int calculateTax(EmployeeSalary salary, int otherMonthlyIncome, int numberOfMonthWorking, int deductible, boolean isMarried, int numberOfChildren) {

		int tax = 0;
		if (numberOfMonthWorking > 12) {
			System.err.println("More than 12 month working per year");
		}
		
		if (numberOfChildren > 3) {
			numberOfChildren = 3;
		}
		
		if (isMarried) {
			tax = (int) Math.round(0.05 * (((otherMonthlyIncome) * numberOfMonthWorking) - deductible - (54000000 + 4500000 + (numberOfChildren * 1500000))));
		}else {
			tax = (int) Math.round(0.05 * (((otherMonthlyIncome) * numberOfMonthWorking) - deductible - 54000000));
		}
		
		if (tax < 0) {
			return 0;
		}else {
			return tax;
		}
			 
	}
	public static int sumIncome(Salary salary, int MonthWorking) {
		return ((salary.getMonthlySalary() + salary.getMonthlySalary()) * MonthWorking);
	}

	public static int amountOfTaxPay(int tax){
		if (tax < 0) {
			return 0;
		}else {
			return tax;
		}
	}
}
