package com.chaminda.bdd;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class DepositAndWithdrawCommonSteps {
	
	private Account account;
	
	public DepositAndWithdrawCommonSteps(){
		account = new Account();
	}
	
	@Given("^the Accounts initial balance is \\$(-?\\d+)$")
	public void the_Accounts_initial_balance_is(double initialBalance) throws Throwable {
		account.setBalance(initialBalance);
		
	}
	

	
	@Then("^the balance should be \\$(-?\\d+)$")
	public void the_balance_should_be_$(double balance) throws Throwable {
		assertThat(account.getBalance(), is(balance));
	}

	public Account getAccount() {
		return account;
	}
	
	
}
