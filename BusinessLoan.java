package BusinessLoan;

import Loan.*;

public class BusinessLoan extends Loan{
	public BusinessLoan(int id, float amount, String t){
		super(id, amount, 1, t);
	}
}