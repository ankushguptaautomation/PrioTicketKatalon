import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

import org.openqa.selenium.By
import org.openqa.selenium.Keys

import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.webui.driver.DriverFactory
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.WebElement

WebUI.callTestCase(findTestCase('Marketplace Redirection Catalogs/marketplace_redirection_catalog'), null)

List<WebElement> listElement = WebUI.findWebElements(findTestObject('PrioTicket Catalog Objects/Catalog Active Inactive Objects/direct_catalog_click'),2)
int count=WebUI.findWebElements(findTestObject('PrioTicket Catalog Objects/Catalog Active Inactive Objects/direct_catalog_click'),2).size()
println("Number of elements:" +count);


for(int i=0;i<count;i++)
	
{
	String textdata=WebUI.findWebElements(findTestObject('PrioTicket Catalog Objects/Catalog Active Inactive Objects/direct_catalog_click'),2).get(i).getText();
	System.out.println(textdata)
	
	if(textdata=="Direct Sales")
	{
	println('Data Fetched')
	WebUI.findWebElements(findTestObject('PrioTicket Catalog Objects/Catalog Active Inactive Objects/direct_catalog_click'),2).get(i).click()
	break
	}
}

