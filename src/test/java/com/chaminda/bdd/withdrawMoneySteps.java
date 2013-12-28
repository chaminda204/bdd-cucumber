package com.chaminda.bdd;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class withdrawMoneySteps {

	private DepositAndWithdrawCommonSteps commonSteps;

	public withdrawMoneySteps(DepositAndWithdrawCommonSteps steps) {
		
		commonSteps = steps;
	}
	@Given("^OD limit is \\$(\\d+)$")
	public void OD_limit_is_$(double odLimit) throws Throwable {
	    commonSteps.getAccount().setOdLimit(odLimit);
	}
		
	@When("^I withdraw \\$(\\d+) from my account$")
	public void I_withdraw_$_from_my_account(double  amount) throws Throwable {
	   commonSteps.getAccount().withdraw(amount);
	}
	
	
}
