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
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable

import org.openqa.selenium.By
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.webui.driver.DriverFactory
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.WebElement

WebUI.callTestCase(findTestCase('Test Cases/PrioTicket Login/PrioTicket Login'),null)
WebUI.delay(6)
WebDriver driver =DriverFactory.getWebDriver()


List<WebElement> text = WebUI.findWebElements(findTestObject('Marketplace Redirection Catalogs Objects/marketplace_redirection_catalogs'),2)
int count=WebUI.findWebElements(findTestObject('Marketplace Redirection Catalogs Objects/marketplace_redirection_catalogs'),2).size()
println("Number of elements:" +count);

for(int i=0;i<count;i++)
	
{
	String textdata=WebUI.findWebElements(findTestObject('Marketplace Redirection Catalogs Objects/marketplace_redirection_catalogs'),2).get(i).getText();
	println(textdata)
	
	if(textdata=="Channels")
	{	
	println('Data Fetched')
	WebUI.findWebElements(findTestObject('Marketplace Redirection Catalogs Objects/marketplace_redirection_catalogs'),2).get(i).click()
	break
	}
}

driver.findElement(By.linkText("Catalogs")).click()

