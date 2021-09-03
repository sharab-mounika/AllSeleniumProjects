Feature: Application Login

Scenario: Homepage default login
Given User is on Netbanking landing page
When User login into application with username "mounika" and password "mona@12345"	
Then Homepage is populated
And cards are displayed


Scenario: invalid login
Given User is on Netbanking landing page
When User login into application with username "xyz" and password "124444"
Then Homepage is populated
And cards are not displayed
And testing "user"

# for understanding purpose given below example 

 Scenario Outline: Positive test validating login   // when we are giving scenarios outline that means we are going for paramaterization concept here, means executing single test with multiple diff data. when we give simple scenario that means simple scenario which will be exceuted only once 
Given Initialize the browser with chrome
And Navigate to "http://qaclickacademy.com" Site
And Click on Login link in home page to land on Secure sign in Page
When User enters <username> and <password> and logs in  // when there are <> that means data is driving from examples 
And close browsers

Examples:
|username			|password	|
|test99@gmail.com	|123456		|
|test123@gmail.com	|12345      |






