package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class NewLeadCreationPageObjects {
	WebDriver driver;
	

	//Home tab
	  @FindBy(how=How.XPATH, using= ".//*[@id='hdr']/div[2]/ul/li[1]/a")
	  public WebElement lnkMyaccount;
	  
	  
	//Home tab
	  @FindBy(how=How.XPATH, using= ".//*[@id='extranav']/div[2]/p[3]/a")
	  public WebElement lnkRegister;
	  
	  
	  






//Admissions Tab
@FindBy(how=How.XPATH, using= ".//td[text()='Admissions']")
public WebElement tabAdmissions;

//Admission Manager link

@FindBy(how=How.LINK_TEXT, using= "Admissions Manager")
public WebElement lnkAdmissionManager;

//Link Add New Lead/Referral
@FindBy(how=How.XPATH, using= ".//*[@id='tabnavi_TabRow']/td[20]/a/img")
public WebElement lnkAddNewLeadReferral;

//Info Call Radio Button

@FindBy(how=How.XPATH, using= ".//*[@id='CtlApplyForm1_RadCheck_0']")
public WebElement rbnInfoCall;

//Referral Radio Button

@FindBy(how=How.XPATH, using= ".//*[@id='CtlApplyForm1_RadCheck_1']")
public WebElement rbnReferral;

//Live Chat Radio Button

@FindBy(how=How.XPATH, using= ".//*[@id='CtlApplyForm1_RadCheck_2']")
public WebElement rbnLiveChat;

//Radio Warm Transfer

@FindBy(how=How.XPATH, using= ".//*[@id='CtlApplyForm1_RadCheck_3']")
public WebElement rbnWarmTransfer;

//First Name text field

@FindBy(how=How.ID, using= "CtlApplyForm1_XMLRFname")
public WebElement txtFirstName;

//Last Name text field

@FindBy(how=How.ID, using= "CtlApplyForm1_XMLRLname")
public WebElement txtLastName;

//Email Required Field

@FindBy(how=How.ID, using= "CtlApplyForm1_XMLREmail")
public WebElement txtEmail;


//Home Phone  Text Field


@FindBy(how=How.ID, using= "CtlApplyForm1_XMLNHPhone")
public WebElement txtHomePhone;


//Day Time Phone Text Field

@FindBy(how=How.ID, using= "CtlApplyForm1_XMLRWPhone")
public WebElement txtDayTimePhone;


//City Text Field

@FindBy(how=How.ID, using= "CtlApplyForm1_XMLNCity")
public WebElement txtCity;

//State Text Field

@FindBy(how=How.ID, using= "CtlApplyForm1_XMLNState")
public WebElement txtState;


//ZIP Code Text Field

@FindBy(how=How.ID, using= "CtlApplyForm1_XMLRZip")
public WebElement txtZIPCode;


//Country Text Field

@FindBy(how=How.ID, using= "CtlApplyForm1_XMLNCountry")
public WebElement dropDownCountry;


//TCPA Disclosure Radio Button Yes

@FindBy(how=How.ID, using= "CtlApplyForm1_XMLRTCPA_Disc_0")
public WebElement rbtnTCPA_Yes;



//TCPA Disclosure Radio Button No

@FindBy(how=How.ID, using= "CtlApplyForm1_XMLRTCPA_Disc_1")
public WebElement rbtnTCPA_No;
	

//Spouse Military Radio Button Yes

@FindBy(how=How.ID, using= "CtlApplyForm1_XMLRMilitary_0")
public WebElement rbtnMilitary_Yes;
	

//Spouse Military Radio Button No

@FindBy(how=How.ID, using= "CtlApplyForm1_XMLRMilitary_1")
public WebElement rbtnMilitary_No;


//Highest Education Text Field

@FindBy(how=How.ID, using= "CtlApplyForm1_XMLNHighestEducation")
public WebElement dropDownHighestEducation;

//Drop Down Military Type Field

@FindBy(how=How.ID, using= "CtlApplyForm1_XMLNMilitary2")
public WebElement DropDownMilitaryType;

// Button Add New Lead

 @FindBy(how=How.ID, using= "CtlApplyForm1_btnAddLead")
 public WebElement btnAddLead;
 
 @FindBy(linkText = "New User")
  WebElement newUserLink;
 
 //Link text in first table
 
 @FindBy(how=How.XPATH, using="//tr[2]/td[4]/a")
	
  public WebElement lnkFirstLeadInTable;
 
 
 //Error message
 @FindBy(how=How.XPATH, using=".//*[@id='CtlApplyForm1_lblErrorMessage']")
	
  public WebElement txtErrorMessage;
 
 
    
    //Admission Tab
    
    public WebElement tabAdmission() {
    return driver.findElement(By.xpath(".//*[@id='_ctl1_TopNavRow']/td[2]"));
   
    }
    
    //Admission Manager Link
    
       public WebElement lnkAdmissionsManager() {
    	
        return driver.findElement(By.linkText("Admissions Manager"));
    }
       
       //Link Add New Lead/Referral
       
       public WebElement lnkAddNewLeadReferral() {
       	
           return driver.findElement(By.xpath(".//*[@id='tabnavi_TabRow']/td[20]/a/img"));
       }
       
       //Info Call Radio Button
       
       public WebElement rbInfocall() {
          	
           return driver.findElement(By.xpath(".//*[@id='CtlApplyForm1_RadCheck_0']"));
       }
       
       //Referral Radio Button
       
       public WebElement rbReferral() {
         	
           return driver.findElement(By.xpath(".//*[@id='CtlApplyForm1_RadCheck_1']"));
       }
       
       //Live Chat Radio Button
       
       public WebElement rbLivechat() {
        	
           return driver.findElement(By.xpath(".//*[@id='CtlApplyForm1_RadCheck_2']"));
       }
       
       //Radio WarmTransfer
       
       public WebElement rbWarmTransfer() {
       	
           return driver.findElement(By.xpath(".//*[@id='CtlApplyForm1_RadCheck_3']"));
       }
       
       //First Name Text Field
       
       public WebElement txtFName() {
          	
           return driver.findElement(By.id("CtlApplyForm1_XMLRFname"));
       }
       
       
  //Last Name Text Field
       
       public WebElement txtLName() {
          	
           return driver.findElement(By.id("CtlApplyForm1_XMLRLname"));
       }
       
       
       //Email Text Field
       
       public WebElement txtEmail() {
          	
           return driver.findElement(By.id("CtlApplyForm1_XMLREmail"));
       }
       
       
       //Home Phone  Text Field
       
       public WebElement txtHomePhone() {
          	
           return driver.findElement(By.id("CtlApplyForm1_XMLNHPhone"));
       }
       
       //Day Time Phone Text Field
       
       public WebElement txtDayTimePhone() {
          	
           return driver.findElement(By.id("CtlApplyForm1_XMLRWPhone"));
       }
       
    //City Text Field
       
       public WebElement txtCity() {
          	
           return driver.findElement(By.id("CtlApplyForm1_XMLNCity"));
       }
   //State Text Field
       
       public WebElement txtState() {
          	
           return driver.findElement(By.id("CtlApplyForm1_XMLNState"));
       }
       
    //ZIP Code Text Field
       
       public WebElement txtZipCode() {
          	
           return driver.findElement(By.id("CtlApplyForm1_XMLRZip"));
       }
       
//Country Text Field
       
       public WebElement dropDownCountry() {
          	
           return driver.findElement(By.id("CtlApplyForm1_XMLNCountry"));
       }
       
//TCPA Disclosure Radio Button Yes
       
       public WebElement rbtnTCPA_Yes() {
          	
           return driver.findElement(By.id("CtlApplyForm1_XMLRTCPA_Disc_0"));
       }
       
//TCPA Disclosure Radio Button No
       
       public WebElement rbtnTCPA_No() {
          	
           return driver.findElement(By.id("CtlApplyForm1_XMLRTCPA_Disc_1"));
       }
       
//Spouse Military Radio Button Yes
       
       public WebElement rbtnMilitary_Yes() {
          	
           return driver.findElement(By.id("CtlApplyForm1_XMLRMilitary_0"));
       }
       
       
      //Spouse Military Radio Button No
       
       public WebElement rbtnMilitary_No() {
          	
           return driver.findElement(By.id("CtlApplyForm1_XMLRMilitary_1"));
       }
       
       
       
      //Highest Education Text Field
       
       public WebElement dropDownHighestEducation() {
          	
           return driver.findElement(By.id("CtlApplyForm1_XMLNHighestEducation"));
       }
       
    //Drop Down Military Type Field
       
       public WebElement DropDownMilitaryType() {
          	
           return driver.findElement(By.id("CtlApplyForm1_XMLNMilitary2"));
       }
       
      // Button Add New Lead
       
       public WebElement btnAddLead() {
         	
           return driver.findElement(By.id("CtlApplyForm1_btnAddLead"));
       }
       
       public WebElement lnkgmail() {
   	 	
           //return driver.findElement(By.className("gb_ma"));
    	   
    	   return driver.findElement(By.linkText("Gmail"));
       
       }

}
