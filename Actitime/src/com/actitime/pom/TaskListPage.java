package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage 
{
	@FindBy(xpath="//div[.='Add New']")
	private WebElement AddNewBtn;
	
	@FindBy(xpath="//div[.='+ New Customer']")
	private WebElement NewCustomerOption;
	
	@FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement EnterCustomertbx;
	
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
	private WebElement EnterCustomerDescriptiontbx;
	
	@FindBy(xpath="(//div[.='- Select Customer -'])[2]")
	private WebElement SelectCustomerDrpDwn;
	
	@FindBy(xpath="//div[@class='itemRow cpItemRow '][4]")
	private WebElement OurCompanyOption;
		
	@FindBy(xpath="//div[.='Create Customer']")
	private WebElement CreateCustomerBtn;
	
	
	public TaskListPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}


	public WebElement getAddNewBtn() {
		return AddNewBtn;
	}


	public WebElement getNewCustomerOption() {
		return NewCustomerOption;
	}


	public WebElement getEnterCustomertbx() {
		return EnterCustomertbx;
	}


	public WebElement getEnterCustomerDescriptiontbx() {
		return EnterCustomerDescriptiontbx;
	}


	public WebElement getSelectCustomerDrpDwn() {
		return SelectCustomerDrpDwn;
	}


	public WebElement getOurCompanyOption() {
		return OurCompanyOption;
	}


	public WebElement getCreateCustomerBtn() {
		return CreateCustomerBtn;
	}
}
