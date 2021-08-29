package myapp;

class Accounting{
	
	public  double valueOfsupply ;
	public  double vatRate ;
	public  double expenseRate ;
	
	public  void print() {
		System.out.println("Value of supply : " +valueOfsupply);
		System.out.println("VAT : " + getVAT() );
		System.out.println("Total  : " + getTotal() );
		System.out.println("Expense  : " + getExpense() );
		System.out.println("Income  : " + getIncome() );
		System.out.println("Dividend 1 : " + getDividend1());	
		System.out.println("Dividend 2 : " + getDividend2());
		System.out.println("Dividend 3 : " + getDividend3() );
	}

	public  double getDividend1() {
		return getIncome() * 0.5;
	}
	
	public  double getDividend2() {
		return getIncome() * 0.3;
	}
	
	public  double getDividend3() {
		return getIncome() * 0.2;
	}

	public  double getIncome() {
		return valueOfsupply - getExpense();
		
	}

	public  double getExpense() {
		return valueOfsupply*expenseRate;
	}

	public  double getTotal() {
		return valueOfsupply + getVAT();
	}

	public  double getVAT() {
		return valueOfsupply*vatRate;
	}

}

public class AccountingClassApp {

	
	
	public static void main(String[] args) {
		// instance
		
		Accounting a1 = new Accounting();
		a1.valueOfsupply = 5000.0;
		a1.print();
		
		Accounting a2 = new Accounting();
		a2.valueOfsupply = 4000.0;
		a2.print();
	}

	
}
