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

//calling login function
WebUI.callTestCase(findTestCase('Test Cases/PrioTicket Login/PrioTicket Login'),null)

//Wating time
WebUI.delay(2)

//--?Webdriver to use selenium objects if needed (Optional)
WebDriver driver =DriverFactory.getWebDriver()

//Getting count of elements in left navigation
int count=WebUI.findWebElements(findTestObject('Marketplace Redirection Catalogs Objects/marketplace_redirection_catalogs'),2).size()
println("Number of elements:" +count);

//loop to check where the catalog resides
for(int i=0;i<count;i++)
	
{
	String textdata=WebUI.findWebElements(findTestObject('Marketplace Redirection Catalogs Objects/marketplace_redirection_catalogs'),2).get(i).getText();
	println(textdata)
	
	if(textdata==GlobalVariable.redirect_left_navigation)
	{	
	println('Successfully Clicked On :'+GlobalVariable.redirect_left_navigation)
	WebUI.findWebElements(findTestObject('Marketplace Redirection Catalogs Objects/marketplace_redirection_catalogs'),2).get(i).click()
	break
	}
}

//move to catalogs by clicking on catalogs
driver.findElement(By.linkText("Catalogs")).click()
println('Successfully Clicked On :'+"Catalogs")

