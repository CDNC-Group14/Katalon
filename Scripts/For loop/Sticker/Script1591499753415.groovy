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

WebUI.callTestCase(findTestCase('OtherCases/LoginCase'), [:], FailureHandling.STOP_ON_FAILURE)

for (int row = 1; row < findTestData('For loop/sticker').getRowNumbers(); row++) {
	
WebUI.click(findTestObject('Object Repository/Page_Town Square - asdljfh Mattermost/button_Write to Town Square_emoji-picker__c_75e2dc'))
    WebUI.click(findTestObject('Object Repository/Page_Town Square - adfadsfasdfgf Mattermost/' + findTestData('For loop/sticker').getValue(
                1, row)))
}

WebUI.sendKeys(findTestObject('Object Repository/Page_Off-Topic - huy123 Mattermost/textarea_Write to Off-Topic_post_textbox'), 
    Keys.chord(Keys.ENTER))
//
//WebUI.click(findTestObject('Object Repository/Page_Town Square - asdljfh Mattermost/svg'))
//
//WebUI.click(findTestObject('Object Repository/Page_Town Square - asdljfh Mattermost/svg'))
//
//WebUI.click(findTestObject('Object Repository/Page_Town Square - asdljfh Mattermost/svg'))
//
//WebUI.click(findTestObject('Object Repository/Page_Town Square - asdljfh Mattermost/button_Write to Town Square_emoji-picker__c_75e2dc'))
//
//WebUI.click(findTestObject('Object Repository/Page_Town Square - asdljfh Mattermost/svg'))
//
//
//WebUI.click(findTestObject('Object Repository/Page_Town Square - asdljfh Mattermost/div'))
//
//WebUI.click(findTestObject('Object Repository/Page_Town Square - asdljfh Mattermost/svg'))

WebUI.closeBrowser()

