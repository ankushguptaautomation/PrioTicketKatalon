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

String create_direct_subcatalog=WebUI.getAttribute(findTestObject('PrioTicket Catalog Objects/Subcatalog Creation Objects/create_direct_subcatalog'), "data-type")
println("Direct SubCatalog Value="+create_direct_subcatalog)

String create_distributor_subcatalog=WebUI.getAttribute(findTestObject('PrioTicket Catalog Objects/Subcatalog Creation Objects/create_distributor_subcatalog'), "data-type")
println("Distributor SubCatalog Value="+create_distributor_subcatalog)

String create_reseller_subcatalog=WebUI.getAttribute(findTestObject('PrioTicket Catalog Objects/Subcatalog Creation Objects/create_reseller_subcatalog'), "data-type")
println("Reseller SubCatalog Value="+create_reseller_subcatalog)


if(create_direct_subcatalog == GlobalVariable.subcatalog_create_category)
	{
		WebUI.click(findTestObject('PrioTicket Catalog Objects/Subcatalog Creation Objects/create_direct_subcatalog'))
		
	}
	else if(create_distributor_subcatalog == GlobalVariable.subcatalog_create_category)
		{
			WebUI.click(findTestObject('PrioTicket Catalog Objects/Subcatalog Creation Objects/create_distributor_subcatalog'))

		}
		
	else if (create_reseller_subcatalog == GlobalVariable.subcatalog_create_category)
		{
			WebUI.click(findTestObject('PrioTicket Catalog Objects/Subcatalog Creation Objects/create_reseller_subcatalog'))
						
		}

else
{
	println("No such Catalogs Exist in Catalogs Module")
	
}