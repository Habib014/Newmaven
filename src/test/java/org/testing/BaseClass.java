package org.testing;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	public static WebDriver driver;
	
	
	public static WebDriver openBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hsbib\\eclipse-workspace\\Seleniu\\drivers\\chromedriver.exe");
	    driver=new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}
	public static void getUrls(String url) {
		driver.get(url);

	}
	public static void findElementKeys(WebElement w, String s) {
		w.sendKeys(s);
	}
	public static void findElementClick(WebElement w) {
	    w.click();
	}
	public static String getTexts(WebElement e) {
		return e.getText();
	}
	public static String getAttributes(WebElement e) {
		return e.getAttribute("value");
	}
	public static void moveToEle(WebElement w) {
		Actions a=new Actions(driver);
	    a.moveToElement(w);
	}
	public static void dragAndDro(WebElement src,WebElement des) {
		Actions a=new Actions(driver);
		a.dragAndDrop(src, des);

	}
	public static void contextClic(WebElement x) {
		Actions a=new Actions(driver);
		a.contextClick(x);
	 
	}
	public static  void doCli(WebElement z) {
		Actions a=new Actions(driver);
        a.doubleClick(z);
	}
	public static  void simAlert() {
     driver.switchTo().alert().accept();
	}
	public static void confirmaler() {
      driver.switchTo().alert().dismiss();
	}
	public static void promptAlert(String s) {
       Alert alert = driver.switchTo().alert();
       alert.sendKeys(s);
       alert.accept();
       }
	public static void selectByInd(WebElement w,int ind) {
		Select s=new Select(w);
      s.selectByIndex(ind);
      
	}
	public static void selectByval(WebElement w,String val) {
		Select s=new Select(w);
      s.selectByValue(val);
      
	}
	public static void selectByVisi(WebElement w,String vis) {
		Select s=new Select(w);
        s.selectByVisibleText(vis);
      
	}
	public static boolean mulisele(WebElement w) {
		Select s=new Select(w);
		boolean multiple = s.isMultiple();
        return multiple;
	}
	public static String forselopt(WebElement w) {
		Select s=new Select(w);
		String text=null;
		List<WebElement> options = s.getOptions();
		for (int i = 0; i < options.size(); i++) {
			WebElement k = options.get(i);
			 text = k.getText();
			
		}
		return text;

	}
	
	
	
	
	
	

}
