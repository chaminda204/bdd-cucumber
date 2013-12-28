Feature: deposit money into the bank account

  Scenario Outline: Depositing money into bank account when the balance is zero
    Given the Accounts initial balance is $<initial>
    When I deposit $<deposit>
    Then the balance should be $<end>
    
    Examples:
    | initial | deposit | end |
	| 0		  | 100     | 100 |
	| 100	  | 100     | 200 |
	| -50	  | 100     | 50  |
	| -50	  | 50      | 0   |

   
