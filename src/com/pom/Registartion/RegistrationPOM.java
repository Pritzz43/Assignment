package com.pom.Registartion;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPOM {

	public RegistrationPOM(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "input[name ='first_name']")
	private WebElement fname;

	@FindBy(css = "input[name = 'last_name']")
	private WebElement lname;

	@FindBy(xpath = "//input[@id='inlineRadioMale']")
	private WebElement gender;

	@FindBy(xpath = "//select[@class = 'form-control']")
	private WebElement hobbies;

	@FindBy(css = ("select[name='department']"))
	private WebElement depart;

	@FindBy(name = "user_name")
	private WebElement user_name;

	@FindBy(name = "user_password")
	private WebElement user_password;

	@FindBy(name = "confirm_password")
	private WebElement conf_pass;

	@FindBy(name = "email")
	private WebElement email;

	@FindBy(name = "contact_no")
	private WebElement cont_no;

	@FindBy(id = "exampleFormControlTextarea1")
	private WebElement TextArea;

	@FindBy(css = "button[type='submit']")
	private WebElement btn;

	public void EnterFirstName(String Name) {
		fname.sendKeys(Name);
	}

	public void EnterLastName(String LName) {
		lname.sendKeys(LName);
	}

	public void Gender() {
		gender.click();
	}

	public void Hobbies() {
		Select Hobbies = new Select(hobbies);
		Hobbies.selectByVisibleText("Jogging");

		WebElement ele1 = Hobbies.getFirstSelectedOption();
		System.out.println(ele1.getText());
	}

	public void Depart() {
		Select Dept = new Select(depart);
		Dept.selectByVisibleText("Department of Engineering");

		WebElement ele = Dept.getFirstSelectedOption();
		System.out.println(ele.getText());
	}

	public void enterUserName(String userName) {
		user_name.sendKeys(userName);
	}

	public void enterPassword(String Password) {
		user_password.sendKeys("Password");
	}

	public void confirmPass(String confPass) {
		conf_pass.sendKeys(confPass);
	}

	public void enterEmail(String Email) {
		email.sendKeys(Email);
	}

	public void contactNo(String contactNo) {
		cont_no.sendKeys(contactNo);
	}

	public void textArea(String Textarea) {
		TextArea.sendKeys(Textarea);
		System.out.println(TextArea.getAttribute(Textarea));
	}

	public void subBtn() {
		btn.click();
	}

}
