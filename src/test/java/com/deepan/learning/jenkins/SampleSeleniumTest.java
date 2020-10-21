package com.deepan.learning.jenkins;

import org.testng.annotations.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.AssertJUnit;

public class SampleSeleniumTest {

	WebDriver driver;

	@BeforeClass
	public void startBrowser() {
		System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver.exe");
		ChromeOptions chromOptions = new ChromeOptions();
		chromOptions.addArguments("--start-maximized");
		driver = new ChromeDriver(chromOptions);
	}

	@Test
	public void validateGoogleId() throws Exception {
		System.out.println("Opening Browser");
		driver.get("http://google.com");
		System.out.println("Clicking Gmail Link");
		driver.findElement(By.xpath("//*[@id=\"gbw\"]/div/div/div[1]/div[1]/a")).click();
		System.out.println("Clicking SingIn link");
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[4]/ul[1]/li[2]/a")).click();
		/*
		 * System.out.println("Entering UserName or phone");
		 * driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("deepan50"
		 * ); System.out.println("Click Next Button");
		 * driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/div[2]"))
		 * .click();
		 */
		Thread.sleep(5000);
		boolean textFound = driver.getPageSource().contains("Experience Gmail on any device");
		System.out.println("Text found: " + textFound);
		AssertJUnit.assertTrue(textFound);
	}

	@AfterClass
	public void closeBrowsr() {
		driver.quit();
	}
}
