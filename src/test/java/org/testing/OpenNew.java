package org.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class OpenNew extends BaseClass {
	public static void main(String[] args) {
		openBrowser();
		getUrls("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		WebElement h = driver.findElement(By.id("multi-select"));
		boolean mu = mulisele(h);
		System.out.println(mu);
		
	}

}

