package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnterTimeTrackPage 
{
	@FindBy(id="logoutLink")
	private WebElement lgoutlink;
	
	@FindBy(id="container_tasks")
	private WebElement tasktab;

	public WebElement getLgoutlink() {
		return lgoutlink;
	}

	public void setLgoutlink(WebElement lgoutlink) {
		this.lgoutlink = lgoutlink;
	}

	public WebElement getTasktab() {
		return tasktab;
	}

	public EnterTimeTrackPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
