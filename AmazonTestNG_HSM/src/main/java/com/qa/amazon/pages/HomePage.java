package com.qa.amazon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.amazon.base.BasePage;
import com.qa.amazon.util.ElementUtil;


public class HomePage  extends BasePage{
	
	WebDriver driver;
	ElementUtil elementUtil;
	
By helloSignIn = By.id("nav-link-accountList") ;
By yourAcount  =By.xpath("//span[text()='Your Account']");


}
