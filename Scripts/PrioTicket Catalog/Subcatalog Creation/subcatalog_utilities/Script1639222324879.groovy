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

WebUI.setText(findTestObject('PrioTicket Catalog Objects/Subcatalog Creation Objects/create_subcatalog_catalog_name'), GlobalVariable.create_subcatalog_name)

WebUI.setText(findTestObject('PrioTicket Catalog Objects/Subcatalog Creation Objects/create_subcatalog_catalog_desc'), GlobalVariable.create_subcatalog_desc)

if(WebUI.verifyElementNotChecked(findTestObject('PrioTicket Catalog Objects/Subcatalog Creation Objects/product_content_description_toggle'), 10,FailureHandling.CONTINUE_ON_FAILURE)==true)
	
{
	WebUI.check(findTestObject('PrioTicket Catalog Objects/Subcatalog Creation Objects/product_content_description_toggle'))
	
	if (WebUI.verifyElementChecked(findTestObject('PrioTicket Catalog Objects/Subcatalog Creation Objects/product_content_description_toggle'), 10,FailureHandling.CONTINUE_ON_FAILURE)==true)
	{
		println("Product Content Description is Enabled")
	}
	
}

else
{
	println("Product Content Description is Enabled")
}