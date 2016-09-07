package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class GooglePageObject {

    WebDriver driver;

    public GooglePageObject (WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    
   @FindBy(how=How.NAME, using="q")
	
	public WebElement googleSearchBox;

  
   //Google search Button
   
   @FindBy(how=How.NAME, using="btnG")
	
	public WebElement btnGoogleSearch;
   
   //Gmail link
   
   @FindBy(how=How.LINK_TEXT, using="Gmail")
	
	public WebElement lnkGmail;
   
   //Email text field
   
   @FindBy(how=How.ID, using="Email")
	
  	public WebElement txtEmail;
   
   //Sign-in button
   
   @FindBy(how=How.ID, using="next")
	
 	public WebElement btnSignIn;
   
   //Password filed
   
   @FindBy(how=How.NAME, using="Passwd")
	
	public WebElement txtPassword;
   
   //Second signin button
   
   @FindBy(how=How.ID, using="signIn")
	
	public WebElement btnGmailSignin;
   
   //error messahe
   
   @FindBy(how=How.XPATH, using=".//*[@id='errormsg_0_Passwd']")
	
	public WebElement errormessage;
   
   
   
   
   
   
   
   
   
   
   
   
	  
  
}


