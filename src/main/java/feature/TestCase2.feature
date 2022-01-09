
Feature: Your Logo Application test case 2

  
  Scenario: Test case2: Add to cart
    Given Opening the browser
    And Enter email
    Given Enter password
    When Click login
    Then Mouse hover on women and click T-shirts
    Then Scroll to product Faded Short Sleeve T-shirts mouse hover and add to cart
    And Verify the message Product successfully added to your shopping cart
    Then Click Proceed to checkout
    Then Validate the product Faded Short Sleeve T-shirts in SHOPPING-CART SUMMARY
  	Then Click Proceed to checkout in summary
    Then Click Proceed to checkout in address
    Then Check Terms of service and click Proceed to checkout in shipping
    Then Click SignOut
    Then Quite Browser

 


     
     