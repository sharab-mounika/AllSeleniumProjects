package StepDefinitionPackage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class StepDefinition {

    @Given("^User is on Netbanking landing page$")
    public void user_is_on_netbanking_landing_page() throws Throwable {
    	System.out.println("landing page");
        
    }

    
    @When("^User login into application with username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_login_into_application_with_username_and_password(String arg1, String arg2) throws Throwable {
    	System.out.println("user given username "+arg1+" and password " +arg2);
        
    }

    @Then("^Homepage is populated$")
    public void homepage_is_populated() throws Throwable {
    	System.out.println("home page is displayed");
        
    }

    @And("^cards are displayed$")
    public void cards_are_displayed() throws Throwable {
    	System.out.println("cards are displayed");
        
    }
    
    @Then("^cards are not displayed$")
    public void cards_are_not_displayed() throws Throwable {
        System.out.println("cards are not displyed for invalid login");
        
    }
    @Then("^testing \"([^\"]*)\"$")
    public void testing(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Given("^Initialize the browser with chrome$")
    public void initialize_the_browser_with_chrome() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Given("^Navigate to \"([^\"]*)\" Site$")
    public void navigate_to_Site(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Given("^Click on Login link in home page to land on Secure sign in Page$")
    public void click_on_Login_link_in_home_page_to_land_on_Secure_sign_in_Page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^User enters test(\\d+)@gmail\\.com and (\\d+) and logs in  // when there are <> that means data is driving from examples$")
    public void user_enters_test_gmail_com_and_and_logs_in_when_there_are_that_means_data_is_driving_from_examples(int arg1, int arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^close browsers$")
    public void close_browsers() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

}