package StepDefinitionPackage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObject.LandingPage;
import pageObject.LoginPage;
import resources.BrowserInvocation;

public class stepDefinition extends BrowserInvocation {
	@Given("^Initialize the browser with chrome$")
	public void initialize_the_browser_with_chrome() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver = initializeDriver();
	}

	@Given("^Navigate to \"([^\"]*)\" Site$")
	public void navigate_to_Site(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.get(arg1);
	}

	@Given("^Click on Login link in home page to land on Secure sign in Page$")
	public void click_on_Login_link_in_home_page_to_land_on_Secure_sign_in_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		LandingPage LP = new LandingPage(driver);
		if(LP.PopUpsize()>0) {
			LP.PopUpBtn().click();
		}LP.getLoginLink().click();
	}

	@When("^User enters test(\\d+)@gmail\\.com and (\\d+) and logs in$")
	public void user_enters_test_gmail_com_and_and_logs_in(String username, String password) throws Throwable {
	    LoginPage l = new LoginPage(driver);
		l.emailField().sendKeys(username);
		l.passwordFeild().sendKeys(password);
		l.submitBtn().click();
	    
	}

	

	@Then("^close browsers$")
	public void close_browsers() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   driver.quit();
	}



}
