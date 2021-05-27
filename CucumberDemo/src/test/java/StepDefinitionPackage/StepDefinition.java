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

}