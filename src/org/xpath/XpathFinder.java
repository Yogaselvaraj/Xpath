package org.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathFinder {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "H:\\Eclipse Workspace\\DifferentXpath\\driver\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("home");
		
		System.out.println("QA");
	}

}
