Feature: withdraw money from bank account

  Scenario Outline: Withdrawing money from bank account when there is sufficient funds
    Given the Accounts initial balance is $<initial>
    And OD limit is $<overdraft>
    When I withdraw $<money> from my account
    Then the balance should be $<end>
    
        Examples:
    | initial | overdraft | money | end  |
    | 200	  | 0         | 100   | 100  |
	| 0		  | 100       | 100   | -100 |
	| 100	  | 100       | 100   | 0    |
	| 100	  | 0         | 100   | 0    | 
	| -50	  | 100       | 50    | -100 |
	
	

   
     
