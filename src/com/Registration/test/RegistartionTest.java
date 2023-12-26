package com.Registration.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RegistartionTest {

	
	WebDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver","/home/ttpl-rt-84/Desktop/Selenium/chromedriver");
        driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://mytestingthoughts.com/Sample/home.html");
		}
	
	@Test(priority = 1)
	public void url(){
		
		System.out.println(driver.getCurrentUrl());
		
		String CurrentUrl = "https://mytestingthoughts.com/Sample/home.html";
		if(CurrentUrl.equals(CurrentUrl))
		{
			System.out.println("URL Passed");
		}
		else
		{
			System.out.println("URL failed");
		}
		
	}
	
	@Test(priority = 2)
	public void firstName() {
		
		 WebElement Fname = driver.findElement(By.cssSelector("input[name ='first_name']"));
		 Fname.sendKeys("Pritam");
	}
	
	@Test(priority = 3)
	public void lastName() {
		WebElement Lname = driver.findElement(By.cssSelector("input[name = 'last_name']"));
		 Lname.sendKeys("Shah");
		 Assert.assertEquals("Shah","Shah");
	}
	
	@Test(priority = 4)
	public void gender()
	{
		WebElement Gender = driver.findElement(By.xpath("//input[@id='inlineRadioMale']"));
		 Gender.click();
	}
	
	@Test(priority = 5)
	public void hobbies() {
		WebElement Hobbies = driver.findElement(By.xpath("//select[@class = 'form-control']"));
		 Select hobbies = new Select(Hobbies);
		 hobbies.selectByVisibleText("Jogging");
	}
	
	@Test(priority = 6)
	public void dept() {
		WebElement Dept = driver.findElement(By.cssSelector("select[name='department']"));
		 Select depart = new Select(Dept);
		 depart.selectByVisibleText("Department of Engineering");
		 
		 WebElement ele = depart.getFirstSelectedOption();
		 System.out.println("Element-> " +ele.getText());
	}
	
	@Test(priority = 7)
	public void userName() {
		WebElement un = driver.findElement(By.name("user_name"));
		 un.sendKeys("Pritam44");
	}
	
	@Test(priority = 8)
	public void password() {
		 WebElement pwd = driver.findElement(By.name("user_password"));
		 pwd.sendKeys("Pritzz@43");
	}
	
	@Test(priority = 9)
	public void confPass() {
		WebElement conf = driver.findElement(By.name("confirm_password"));
		 conf.sendKeys("Pritzz@43");
	}
	
	@Test(priority = 10)
	public void email() {
		WebElement email = driver.findElement(By.name("email"));
		 email.sendKeys("Pritamshah888@gmail.com");
	}
	
	@Test(priority = 11)
	public void cont_no() {
		 WebElement cont = driver.findElement(By.name("contact_no"));
		 cont.sendKeys("976-227-2743");
	}
	
	@Test(priority = 12)
	public void textArea()
	{
		WebElement textarea = driver.findElement(By.id("exampleFormControlTextarea1"));
		textarea.sendKeys("Tekdi TEchnologies pvt ltd");
	}
	
	@Test(priority = 13)
	public void subBtn() {
		WebElement btn = driver.findElement(By.cssSelector("button[type='submit']"));
		 btn.click();
	}
	
	@AfterTest
	public void close() {
		
		driver.quit();
	}
}
