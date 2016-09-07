package stepsDefinations;

import java.io.IOException;

import org.apache.commons.lang3.RandomStringUtils;
//import org.junit.Assert;
import org.testng.Assert;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import common.DriverSelector;
import common.Url;
import common.UserExtension;

//import com.nature.foxtrot.common.DriverSelector;
//import com.nature.foxtrot.common.Url;

import pageObjects.ConfirmUserPageObject;
import pageObjects.GooglePageObject;
import pageObjects.NewUserPageObject;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GoogleStepDefination {
	public String mainwinhandle;
	WebDriver driver;
	String url;
    String baseUrl;
    public GooglePageObject uigooglePageObject;
    NewUserPageObject newUserPageObject;
    ConfirmUserPageObject confirmUserPageObject;

	  DriverSelector webbrowser = new DriverSelector(System.getProperty("browser"));
	  
      Url domain = new Url(System.getProperty("env"));
     

  	
    @Before
    public void beforeScenario() {
    	driver = webbrowser.getBrowser();
        
    }
    
    
    @Given("^I am in google home page$")
    public void i_am_in_google_home_page() throws Throwable {
    	
    	driver.get(domain.host());
    	uigooglePageObject = new GooglePageObject(driver);
    }

    @When("^I search text in google search box$")
    public void i_search_text_in_google_search_box() throws Throwable {
    	uigooglePageObject = new GooglePageObject(driver);
    	
    	uigooglePageObject.googleSearchBox.sendKeys("Webdriver");
        
    }

    @Then("^I should able to see the searched result$")
    public void i_should_able_to_see_the_searched_result() throws Throwable {
    	uigooglePageObject.btnGoogleSearch.click();
        
    }

    

    @When("^I click on Gmail link$")
    public void i_click_on_Gmail_link() throws Throwable {
    	Thread.sleep(10000);
    	uigooglePageObject.lnkGmail.click();
    	
        
    }

    @When("^I have enter correct username and password in sign-in page$")
    public void i_have_enter_correct_username_and_password_in_sign_in_page() throws
    Throwable {
    	uigooglePageObject.txtEmail.sendKeys("kumarravinder4141@gmail.com");
    	uigooglePageObject.btnSignIn.click();
    	Thread.sleep(10000);
    	uigooglePageObject.txtPassword.sendKeys("qwer1234@");
    	uigooglePageObject.btnGmailSignin.click();
    	
    	
    	
        
    }

    @Then("^I should be able to logged-in successfully$")
    public void i_should_be_able_to_logged_in_successfully() throws Throwable {
        
    }

    @When("^I have enter incorrect username and password$")
    public void i_have_enter_incorrect_username_and_password() throws Throwable {
    	uigooglePageObject.txtEmail.sendKeys("kumarravinder4141@gmail.com");
    	uigooglePageObject.btnSignIn.click();
    	Thread.sleep(10000);
    	uigooglePageObject.txtPassword.sendKeys("qwer1we");
    	uigooglePageObject.btnGmailSignin.click();
    }

    @Then("^I should be able to see error message and not logged-in$")
    public void i_should_be_able_to_see_error_message_and_not_logged_in() throws Throwable {
    	String Errormessage=uigooglePageObject.errormessage.getText().trim();
    	Assert.assertEquals(Errormessage, "The email and password you entered don't");
    }
    
    
	
	@After
    public void afterScenario(Scenario scenario) {
        if (scenario.isFailed()) {
            scenario.embed(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES), "image/png");
        }
        driver.close();
        driver.quit();
	}
}
