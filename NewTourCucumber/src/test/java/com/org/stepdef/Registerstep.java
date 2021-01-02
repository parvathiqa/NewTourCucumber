package com.org.stepdef;

import org.junit.Assert;

import com.org.pages.RegisterPage;
import com.org.utility.Propretyfile;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Registerstep extends Propretyfile{
	
	static Propretyfile prop;
	RegisterPage reg;
	
	@Given("^user is on http://newtours\\.demoaut\\.com/mercuryregister\\.php$")
	public void user_is_on_http_newtours_demoaut_com_mercuryregister_php() throws Throwable {
	  driver=prop.getdriver("chrome");  
	}
	@Given("^click the signon link$")
	public void click_the_signon_link() throws Throwable {
		reg= new RegisterPage();
		button(reg.getClickRegisterbtn()); 
	}
	@When("^user enter the firstname$")
	public void user_enter_the_firstname() throws Throwable {
		//reg= new RegisterPage();
		reg.setTextfirstname("ezhil");
		Assert.assertEquals("ezhil", reg.getTextfirstname());
	}

	@When("^user enter the lastname$")
	public void user_enter_the_lastname() throws Throwable {
		//reg= new RegisterPage();
		reg.setTextlastname("R");
		Assert.assertEquals("R", reg.getTextlastname());  
	}

	@When("^user enter the phone number$")
	public void user_enter_the_phone_number() throws Throwable {
	    reg.setTextphonenumber("9843219233");
	    Assert.assertEquals("9843219233", reg.getTextphonenumber());
	}

	@When("^user enter the email$")
	public void user_enter_the_email() throws Throwable {
	  reg.setTextemail("ezhilr62@gmail.com");
	  Assert.assertEquals("ezhilr62@gmail.com", reg.getTextemail());
	}

	@When("^user enter the address$")
	public void user_enter_the_address() throws Throwable {
	    reg.setTextaddressfield1("33 g2");
	    Assert.assertEquals("33 g2", reg.getTextaddressfield1());
	    reg.setTextaddressfield2("mmnagar");
	    Assert.assertEquals("mmnagar", reg.getTextaddressfield2());
	}

	@When("^user enter the city$")
	public void user_enter_the_city() throws Throwable {
	 reg.setTextcity("chennai");   
	 Assert.assertEquals("chennai", reg.getTextcity());
	}

	@When("^user enter the state and province$")
	public void user_enter_the_state_and_province() throws Throwable {
	  reg.setTextstate("tamilnadu");
	  Assert.assertEquals("tamilnadu", reg.getTextstate());
	 
	}

	@When("^user enter the postal code$")
	public void user_enter_the_postal_code() throws Throwable {
	    reg.setTextpostalcode("603209");
	    Assert.assertEquals("603209", reg.getTextpostalcode());
	}

	@When("^user select the country$")
	public void user_select_the_country() throws Throwable {
	   // select(reg.getDropdowncountry(), null);
	     select(reg.getDropdowncountry(),"INDIA ");
	}

	@When("^user enter the username$")
	public void user_enter_the_username() throws Throwable {
	    reg.setTextusername("ezhilr62@gmail.com");
	}

	@When("^user enter the password$")
	public void user_enter_the_password() throws Throwable {
	    reg.setTextpassword("9843219233");
	}

	@When("^user enter the conforim password$")
	public void user_enter_the_conforim_password() throws Throwable {
	    reg.setTextconfirmPassword("9843219233");
	}

	@Then("^click the register button$")
	public void click_the_register_button() throws Throwable {
	  reg.getButtonclickregister().click();
	}
	@Then("^close the application$")
	public void close_the_application() throws Throwable {
		 //driver.quit(); 
	}
}
