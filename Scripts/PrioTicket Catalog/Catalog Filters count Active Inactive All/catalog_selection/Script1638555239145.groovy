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

//Getting Count of Catalogs Direct and Distributor Catalogs including Subcatalogs
int catalog_count=WebUI.findWebElements(findTestObject('PrioTicket Catalog Objects/Catalog Active Inactive Objects/direct_catalog_click'),2).size()
println("No.of Direct catalog and Distributor Catalogs including Subcatalogs:" +catalog_count);



//Fetching Selected Catalogs
for(int i=0;i<catalog_count;i++)
	
{
	String catalogs_name=WebUI.findWebElements(findTestObject('PrioTicket Catalog Objects/Catalog Active Inactive Objects/direct_catalog_click'),2).get(i).getText();
	println("Catalogs Headings:"+catalogs_name)
	
	if(catalogs_name==GlobalVariable.catalogname)
	{
	println('Selected Catalog Verified')
	WebUI.findWebElements(findTestObject('PrioTicket Catalog Objects/Catalog Active Inactive Objects/direct_catalog_click'),2).get(i).click()
	println('Catalog Clicked')
	break
	}
}