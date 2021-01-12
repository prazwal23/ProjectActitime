package com.actitime.testscripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.actitime.generics.BaseClass;
import com.actitime.generics.FileLib;
import com.actitime.pom.EnterTimeTrackPage;
import com.actitime.pom.TaskListPage;

public class CustomerModule extends BaseClass
{
	@Test
	public void testCreateCustomer() throws InterruptedException, EncryptedDocumentException, IOException
	{
		FileLib f =new FileLib();
		String CustomerName = f.getExcelValue("CreateCustomer", 1, 1);
		String CustomerDescripton = f.getExcelValue("CreateCustomer", 1, 2);
		
		EnterTimeTrackPage e = new EnterTimeTrackPage(driver);
		e.getTasktab().click(); 
		

		TaskListPage tl = new TaskListPage(driver);
		
		tl.getAddNewBtn().click();
		tl.getNewCustomerOption().click();
		tl.getEnterCustomertbx().sendKeys("HDFC_001");
		tl.getEnterCustomerDescriptiontbx().sendKeys("BankingProject");
		tl.getSelectCustomerDrpDwn().click();
		tl.getOurCompanyOption().click();
		tl.getCreateCustomerBtn().click();
		Thread.sleep(2000);

	}
}
