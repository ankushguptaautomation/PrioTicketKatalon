import java.sql.Driver

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



WebUI.callTestCase(findTestCase('PrioTicket Catalog/Subcatalog Creation/calling_create_subcatalog'), null)

WebUI.callTestCase(findTestCase('PrioTicket Catalog/Subcatalog Creation/subcatalog_utilities'), null)

WebUI.click(findTestObject('PrioTicket Catalog Objects/Subcatalog Creation Objects/discard_button'))

WebUI.callTestCase(findTestCase('PrioTicket Catalog/Subcatalog Creation/subcatalog_selection'), null)

WebUI.callTestCase(findTestCase('PrioTicket Catalog/Subcatalog Creation/subcatalog_utilities'), null)

WebUI.click(findTestObject('PrioTicket Catalog Objects/Subcatalog Creation Objects/subcatalog_close_button'))

WebUI.callTestCase(findTestCase('PrioTicket Catalog/Subcatalog Creation/subcatalog_selection'), null)

WebUI.callTestCase(findTestCase('PrioTicket Catalog/Subcatalog Creation/subcatalog_utilities'), null)

WebUI.click(findTestObject('PrioTicket Catalog Objects/Subcatalog Creation Objects/create_catalog_button'))

int catalog_count=WebUI.findWebElements(findTestObject('PrioTicket Catalog Objects/Subcatalog Creation Objects/get_catalog_name'),2).size()
println("No.of Catalogs including Subcatalogs:" +catalog_count);




for(int i=0;i<catalog_count;i++)
	
{
	String catalogs_name=WebUI.findWebElements(findTestObject('PrioTicket Catalog Objects/Subcatalog Creation Objects/get_catalog_name'),2).get(i).getText();
	println("Catalogs Headings:"+catalogs_name)
	
	if(catalogs_name==GlobalVariable.create_subcatalog_name)
	{
	println('Subcatalog Created Successfully')
	break
	}
}