package com.org.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Propretyfile {
	protected static WebDriver driver;
	static Select sel;
	protected static WebElement element;
	
	static String  path ="D:/drivers/chromedriver.exe";
	static String  url ="http://newtours.demoaut.com/";

	public static WebDriver getdriver(String Browser){
		if(Browser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", path);
			driver= new ChromeDriver();
		}else if(Browser.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver", path);
			driver= new FirefoxDriver();
		}else{
			System.out.println("pass the currect browser");
		}
		driver.get(url);
		driver.manage().window().maximize();
		return driver;
	}
	public void button(WebElement element){
		element.click();	
	}
	public void select(WebElement element,String name){
		Select s= new Select(element);
		s.selectByVisibleText(name);
		/*List<WebElement> options = s.getOptions();
		for (WebElement web : options) {
		System.out.println(web.getText());	
		}*/
		
	}
}
