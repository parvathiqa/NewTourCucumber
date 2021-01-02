package com.org.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.org.utility.Propretyfile;

public class RegisterPage extends Propretyfile{
@FindBy(xpath="//a[text()='REGISTER']")
private WebElement clickRegisterbtn;
@FindBy(name="firstName")
private WebElement textfirstname;
@FindBy(name="lastName")
private WebElement textlastname;
@FindBy(name="phone")
private WebElement textphonenumber;
@FindBy(name="userName")
private WebElement textemail;
@FindBy(name="address1")
private WebElement textaddressfield1;
@FindBy(name="address2")
private WebElement textaddressfield2;
@FindBy(name="city")
private WebElement textcity;
@FindBy(name="state")
private WebElement textstate;
@FindBy(name="postalCode")
private WebElement textpostalcode;
@FindBy(name="country")
private WebElement dropdowncountry;

@FindBy(name="email")
private WebElement textusername;
@FindBy(name="password")
private WebElement textpassword;
@FindBy(name="confirmPassword")
private WebElement textconfirmPassword;
@FindBy(name="register")
private WebElement buttonclickregister;

public WebElement getClickRegisterbtn() {
	return clickRegisterbtn;
}
public void setClickRegisterbtn(WebElement clickRegisterbtn) {
	this.clickRegisterbtn = clickRegisterbtn;
}

public String getTextfirstname() {
	return textfirstname.getAttribute("value");
}
public String getTextlastname() {
	return textlastname.getAttribute("value");
}
public String getTextphonenumber() {
	return textphonenumber.getAttribute("value");
}
public String getTextemail() {
	return textemail.getAttribute("value");
}
public String getTextaddressfield1() {
	return textaddressfield1.getAttribute("value");
}
public String getTextaddressfield2() {
	return textaddressfield2.getAttribute("value");
}
public String getTextcity() {
	return textcity.getAttribute("value");
}
public String getTextstate() {
	return textstate.getAttribute("value");
}
public String getTextpostalcode() {
	return textpostalcode.getAttribute("value");
}
public WebElement getDropdowncountry() {
	return dropdowncountry;
}
public WebElement getTextusername() {
	return textusername;
}
public WebElement getTextpassword() {
	return textpassword;
}
public WebElement getTextconfirmPassword() {
	return textconfirmPassword;
}
public WebElement getButtonclickregister() {
	return buttonclickregister;
}
public void setTextfirstname(String textfirstname) {
	this.textfirstname.sendKeys(textfirstname);
}
public void setTextlastname(String textlastname) {
	this.textlastname.sendKeys(textlastname);
}
public void setTextphonenumber(String textphonenumber) {
	this.textphonenumber.sendKeys(textphonenumber);
}
public void setTextemail(String textemail) {
	this.textemail.sendKeys(textemail);
}
public void setTextaddressfield1(String textaddressfield1) {
	this.textaddressfield1.sendKeys(textaddressfield1);
}
public void setTextaddressfield2(String textaddressfield2) {
	this.textaddressfield2.sendKeys(textaddressfield2);
}
public void setTextcity(String textcity) {
	this.textcity.sendKeys(textcity);
}
public void setTextstate(String textstate) {
	this.textstate.sendKeys(textstate);
}
public void setTextpostalcode(String textpostalcode) {
	this.textpostalcode.sendKeys(textpostalcode);
}
public void setDropdowncountry(WebElement dropdowncountry) {
	this.dropdowncountry = dropdowncountry;
}
public void setTextusername(String textusername) {
	this.textusername.sendKeys(textusername);
}
public void setTextpassword(String textpassword) {
	this.textpassword.sendKeys(textpassword);
}
public void setTextconfirmPassword(String textconfirmPassword) {
	this.textconfirmPassword.sendKeys(textconfirmPassword);
}
public void setButtonclickregister(WebElement buttonclickregister) {
	this.buttonclickregister = buttonclickregister;
}
public RegisterPage(){
	PageFactory.initElements(driver, this);
}
}
