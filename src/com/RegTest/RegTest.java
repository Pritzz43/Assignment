package com.RegTest;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.TestBase.TestBase;
import com.pom.Registartion.RegistrationPOM;

public class RegTest extends TestBase {

	
	@Test
	public void CurrentUrl() {

		String ActualUrl = "https://mytestingthoughts.com/Sample/home.html";
		String ExpectedUrl = driver.getCurrentUrl();
		Assert.assertEquals(ActualUrl, ExpectedUrl);

		System.out.println(ActualUrl);
	}

	@Test
	public void RegistrationTest() {
		RegistrationPOM reg = new RegistrationPOM(driver);

		reg.EnterFirstName("Pritam");
		Assert.assertEquals("Pritam", "Pritam");

		reg.EnterLastName("Shah");
		Assert.assertEquals("Shah", "Shah");

		reg.Gender();
		Assert.assertTrue(true);

		reg.Hobbies();
		Assert.assertEquals(true, true, "jogging");

		reg.Depart();
		Assert.assertEquals(true, true, "department");

		reg.enterUserName("Pritzz44");
		Assert.assertEquals("Pritzz44", "Pritzz44");

		reg.enterPassword("Pritzz@43");
		Assert.assertEquals("Pritzz@43", "Pritzz@43");

		reg.confirmPass("Pritzz@43");
		Assert.assertEquals("Pritzz@43", "Pritzz@43");

		reg.enterEmail("pritamshah@gmail.com");
		Assert.assertEquals("pritamshah@gmail.com", "pritamshah@gmail.com");

		reg.contactNo("976-227-2743");
		Assert.assertEquals(976 - 227 - 2743, 976 - 227 - 2743);

		reg.textArea("Tekdi Technologies pvt ltd");

		reg.subBtn();
		Assert.assertEquals(true, true, "Submitted");
	}
}
