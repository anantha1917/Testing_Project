package com.simple.Testing_sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Testng_sample {
	
	@Test
	public void testing() throws Exception
	{
		/*System.setProperty("webdriver.chrome.driver","D:\\Automation\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.seleniumeasy.com/");
		
		System.out.println("Webpage opened");

			Thread.sleep(5000);
					
		driver.findElement(By.xpath("//a[normalize-space()='Maven']")).click();
		Thread.sleep(3000);
		System.out.println("Demo home clicked");
		//driver.findElement(By.linkText(" Start Practising")).click();
		
		
		driver.close();
		
		System.out.println("restarting the topics"); */
		
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        // Add your test automation steps here
        driver.quit();
	}

}
