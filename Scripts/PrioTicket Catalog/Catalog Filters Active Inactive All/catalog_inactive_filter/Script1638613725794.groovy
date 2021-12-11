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
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword as WebUIAbstractKeyword
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.By as By
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.chrome.ChromeDriver as ChromeDriver
import org.openqa.selenium.WebElement as WebElement

//Calling Case of Redirection from Marketplace
WebUI.callTestCase(findTestCase('Marketplace Redirection Catalogs/marketplace_redirection_catalog'), null)

//Calling Catalog Selection
WebUI.callTestCase(findTestCase('PrioTicket Catalog/Catalog Filters Active Inactive All/catalog_selection'), null)


WebUI.delay(5)

//Clicking on Inactive Filter
WebUI.click(findTestObject('PrioTicket Catalog Objects/Catalog Active Inactive Objects/catalog_inactive_button'))

//Count Inactive Products to verify if there is pagination and dropdown selector
int Inactive_products = WebUI.findWebElements(findTestObject('PrioTicket Catalog Objects/Catalog Active Inactive Objects/toggle_button_listing'), 
    2).size()

println('No.of Active Products:' + Inactive_products)

//Verify Dropdown selector and select the last selection of dropdown
if (Inactive_products >= 10) {
    WebUI.click(findTestObject('PrioTicket Catalog Objects/Catalog Active Inactive Objects/dropdown_pagination'))

    int paginationdropdown = WebUI.findWebElements(findTestObject('PrioTicket Catalog Objects/Catalog Active Inactive Objects/pagination_dropdown_limit_selector'), 
        2).size()

    println('Number of elements:' + paginationdropdown)

    for (int i = 0; i < paginationdropdown; i++) {
        String pageselect = WebUI.findWebElements(findTestObject('PrioTicket Catalog Objects/Catalog Active Inactive Objects/pagination_dropdown_limit_selector'), 
            2).get(i).getText()

        println('Page Selection Number:' + pageselect)

        if (pageselect == '50') {
            WebUI.delay(5)

            WebUI.findWebElements(findTestObject('PrioTicket Catalog Objects/Catalog Active Inactive Objects/pagination_dropdown_limit_selector'), 
                2).get(i).click()

            println('Pagination Clicked')

            break
        }
    }
}

//Current Page Inactive Products count
int Inactive_products1 = WebUI.findWebElements(findTestObject('PrioTicket Catalog Objects/Catalog Active Inactive Objects/toggle_button_listing'), 
    2).size()

println('No.of Active Products:' + Inactive_products1)

int total_Inactive_products = Inactive_products1

//Getting Pagination count
List<WebElement> pagination = WebUI.findWebElements(findTestObject('PrioTicket Catalog Objects/Catalog Active Inactive Objects/catalog_tile_click'), 
    2)

int paginationcount = WebUI.findWebElements(findTestObject('PrioTicket Catalog Objects/Catalog Active Inactive Objects/pagination_catalog_active'), 
    2).size()

println('Number of elements:' + paginationcount)

for (int i = 0; i < paginationcount; i++) {
    String textdata1 = WebUI.findWebElements(findTestObject('PrioTicket Catalog Objects/Catalog Active Inactive Objects/pagination_catalog_active'), 
        2).get(i).getText()

    System.out.println('PaginationNumber:' + textdata1)
}

//Initialiazing Parameters
int Inactive_products123 = 0

int Inactive_products12345

//Getting all product count for that particular Filter
for (int f = 1; f < paginationcount; f++) {
    WebUI.findWebElements(findTestObject('PrioTicket Catalog Objects/Catalog Active Inactive Objects/pagination_catalog_active'), 
        2).get(f).click()

    Inactive_products12345 = WebUI.findWebElements(findTestObject('PrioTicket Catalog Objects/Catalog Active Inactive Objects/toggle_button_listing'), 
        2).size()

    Inactive_products123 = (Inactive_products123 + Inactive_products12345)

    println('Number of elements:' + Inactive_products123)

    println('Pagination number:' + f)
}

int Totals = total_Inactive_products + Inactive_products123

println('Total No. of Active Products:' + Totals)

String sum = String.valueOf(Totals)

//Comparing Getting counts with pagination total product counts
String product_count = WebUI.findWebElement(findTestObject('PrioTicket Catalog Objects/Catalog Active Inactive Objects/product_count_on_catalogs'), 
    2).getText()

if (product_count.contains(sum)) {
    print(('Inactive Product count is Matched and Product Count=' + Totals) + '    ')
} else {
    println('Error in Inactive Product Filter')
}

WebUI.closeBrowser()