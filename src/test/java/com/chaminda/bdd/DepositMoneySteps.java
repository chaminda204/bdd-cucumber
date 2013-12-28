package com.chaminda.bdd;

import cucumber.api.java.en.When;

public class DepositMoneySteps {

	private DepositAndWithdrawCommonSteps commonSteps;

	public DepositMoneySteps(DepositAndWithdrawCommonSteps steps) {
		
		commonSteps = steps;
	}

	@When("^I deposit \\$(\\d+)$")
	public void I_deposit_$(double depositAmount) throws Throwable {
		commonSteps.getAccount().deposit(depositAmount);

	}

}
