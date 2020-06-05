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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://hcmus-mattermost-webapp.herokuapp.com/login')

WebUI.setText(findTestObject('Page_Mattermost/input_All team communication in one place s_703ef5'), 'huy123')

WebUI.setEncryptedText(findTestObject('Page_Mattermost/input_All team communication in one place s_2f2733'), 'aeHFOx8jV/A=')

WebUI.sendKeys(findTestObject('Page_Mattermost/input_All team communication in one place s_2f2733'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Page_ Town Square - huy123 Mattermost/h1_huy123'))

WebUI.click(findTestObject('Page_ Town Square - huy123 Mattermost/span_Invite People'))

WebUI.click(findTestObject('Page_ Town Square - huy123 Mattermost/div_Add members'))


for ( int row = 1; row <= findTestData("For loop/user").getRowNumbers(); row++) {
	WebUI.setText(findTestObject('Page_ Town Square - huy123 Mattermost/input_Add members_react-select-2-input'), findTestData("For loop/user").getValue(1,row))
	
	WebUI.click(findTestObject('Page_ Town Square - huy123 Mattermost/'+findTestData("For loop/user").getValue(2,row)))
}


WebUI.click(findTestObject('Page_ Town Square - huy123 Mattermost/span_Invite Members'))

Thread.sleep(3000)

WebUI.closeBrowser()

