package org.testing;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page1 extends BaseClass
{
 public Page1() {
	PageFactory.initElements(driver,this);
}
 @FindBy(id="email")
 private WebElement txtusername;
 @FindBy(id="pass")
 private WebElement txtpass;
 @FindBy(name="login")
 private WebElement btnlogin;
public WebElement getTxtusername() {
	return txtusername;
}
public WebElement getTxtpass() {
	return txtpass;
}
public WebElement getBtnlogin() {
	return btnlogin;
}
}
