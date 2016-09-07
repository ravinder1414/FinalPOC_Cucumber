package common;

import org.openqa.selenium.WebDriver;




public class Url {

	
	String hostChoice;
//	Boolean authChoice;
	
	
	 
	    WebDriver driver;

	    public Url(String host) {
	        hostChoice = host;
	    }

	    public String host() {
	    	//if(hostChoice != null){
				if(hostChoice.equalsIgnoreCase("google")){
					return "https://www.google.co.in/";
				}
	        
	    	
				 else if (hostChoice.equalsIgnoreCase("yahoo")){
					 return "https://in.yahoo.com/";
					
				}

				 else if (hostChoice.equalsIgnoreCase("timesnews")){
					 return "http://timesofindia.indiatimes.com/";
					
				 }
		/*	else {
	    	System.out.println("DEBUG: No environment was set for the Url so I am running against www-test.nature.com.  " +
	    			"Please ignore this if you are running in an IDE");
	    	return "www.";
	    }*/
	    return hostChoice;
	    
				 }   	
	    }








