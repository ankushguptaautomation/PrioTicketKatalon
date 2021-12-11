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

WebUI.callTestCase(findTestCase('Marketplace Redirection Catalogs/marketplace_redirection_catalog'), null)

int direct_distributor_catalogs=WebUI.findWebElements(findTestObject('PrioTicket Catalog Objects/Catalog HomePage Objects/count_direct_distributor_catalogs'),2).size()
println("Number of Direct catalog and Distributor Catalogs including Subcatalogs:" +direct_distributor_catalogs);

int reseller_catalogs=WebUI.findWebElements(findTestObject('PrioTicket Catalog Objects/Catalog HomePage Objects/count_reseller_catalogs'),2).size()
println("Number of Reseller Catalogs including Subcatalogs:" +reseller_catalogs);

int partner_catalogs=WebUI.findWebElements(findTestObject('PrioTicket Catalog Objects/Catalog HomePage Objects/count_partner_catalogs'),2).size()
println("Number of Partner Catalogs:" +partner_catalogs);

int totals=direct_distributor_catalogs+reseller_catalogs+partner_catalogs
println("Total Number of Catalogs:"+totals)


String catalog_count=WebUI.findWebElement(findTestObject('PrioTicket Catalog Objects/Catalog HomePage Objects/total_catalog_count'),2).getText()

String string = catalog_count
String[] parts = string.split(" ", 2)
String part1 = parts[0]
String part11 = parts[0]
String part2 = parts[1]
println(part1)
println(part2)

String s=String.valueOf(totals);




if(WebUI.verifyMatch(part1, s, false, FailureHandling.CONTINUE_ON_FAILURE))
{
	
		println('Count Matched')
}



