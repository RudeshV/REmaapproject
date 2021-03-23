package org.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utilities.BaseClass;

public class LoginPojo extends BaseClass{
public LoginPojo() {
PageFactory.initElements(driver, this);
}

@FindBy(id="txtUserNameEditingInput")
private WebElement txtUserName;
@FindBy(id="txtPasswordEditingInput")
private WebElement txtPassword;
public WebElement getTxtUserName() {
	return txtUserName;
}
public WebElement getTxtPassword() {
	return txtPassword;
}
@FindBy(id="btnLogin")
private WebElement btnLoginn;
public WebElement getBtnLoginn() {
	return btnLoginn;
}
@FindBy(xpath="//input[@id='1616257685534EditingInput']")
private WebElement searchProject;
@FindBy(xpath="//input[@id='400179']")
private WebElement selectProject;
public WebElement getSearchProject() {
	return searchProject;
}
public WebElement getSelectProject() {
	return selectProject;
}
public WebElement getClickProject() {
	return clickProject;
}
@FindBy(xpath="//a[text()='Support ']")
private WebElement clickProject;
}

