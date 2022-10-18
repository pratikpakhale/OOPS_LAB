package PersonalLoan;

import Loan.*;

public class PersonalLoan extends Loan{
	public PersonalLoan(int id, float amount, String t){
		super(id, amount, 2, t);
	}
}