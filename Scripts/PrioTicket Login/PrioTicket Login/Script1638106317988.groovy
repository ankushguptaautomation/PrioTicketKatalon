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
import org.openqa.selenium.Keys as Keys

import org.openqa.selenium.By
import org.openqa.selenium.Keys

import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.webui.driver.DriverFactory
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.WebElement

//Open Browser
WebUI.openBrowser(GlobalVariable.urlLogin)

//To maximize the window of the browser
WebUI.maximizeWindow()

//Waiting time
WebUI.delay(1)

//Username of the user who is login with Prioticket
WebUI.sendKeys(findTestObject('PrioTicket Login Objects/Username'), Keys.chord(GlobalVariable.username, Keys.TAB))

//Password of the user who is login with Prioticket
WebUI.setText(findTestObject('PrioTicket Login Objects/Password'), GlobalVariable.password)

//Need to check the Domain as Priohub using Terms and Conditions 
String text=WebUI.getAttribute(findTestObject('PrioTicket Login Objects/domain_verify'), "src")

if(text.contains("phub"))
{
	WebUI.check(findTestObject('PrioTicket Login Objects/Terms_condition_checkbox'))
	WebUI.click(findTestObject('PrioTicket Login Objects/SignIn_Button'))
	println('Successfully Login With '+"Priohub")
	
}
 else 
	 
WebUI.click(findTestObject('PrioTicket Login Objects/SignIn_Button'))
println('Successfully Login With '+"PrioTicket")
