package com.actitime.generics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class WebDriverCommonLib 
{
	/*
	 * Explicit wait for element is displayed or not
	 * @param driver
	 * @param element 
	 */
	public void waitForElement(WebDriver driver, WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	/*
	 * Implicit wait for element is present in gui
	 * @param driver
	 */
	public void waitForElementInGui(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	/*
	 * Custom wait for element is displayed or not
	 * @param driver
	 */
	public void customWait(WebElement element)
	{
		int i = 0;
		while(i < 100)
		{
			try
			{
				element.isDisplayed();
				break;
			}
			catch(NoSuchElementException e)
			{
				i++;
			}
		}
	}
	public void selectOption(WebElement element, String text)
	{
		Select s = new Select(element);
		s.selectByVisibleText(text);
	}
}
