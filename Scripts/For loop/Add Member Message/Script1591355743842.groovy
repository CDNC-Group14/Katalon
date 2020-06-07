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

WebUI.click(findTestObject('Page_ Town Square - huy123 Mattermost/span_'))

WebUI.click(findTestObject('Page_ Town Square - huy123 Mattermost/div_Search and add members'))

for (int row = 1; row <= findTestData('For loop/user').getRowNumbers(); row++) {
    WebUI.setText(findTestObject('Object Repository/Page_ Town Square - huy123 Mattermost/input_Search and add members_react-select-2-input'), 
        findTestData('For loop/user').getValue(1, row))

    WebUI.click(findTestObject('Object Repository/Page_ Town Square - huy123 Mattermost/i_user1gmailcom_fa fa-plus'))
}

WebUI.click(findTestObject('Object Repository/Page_ Town Square - huy123 Mattermost/span_Go'))

WebUI.setText(findTestObject('Object Repository/Page_ user1 user2 - huy123 Mattermost/textarea_Write to user1 user2_post_textbox'), 
    'chào')

WebUI.sendKeys(findTestObject('Object Repository/Page_ user1 user2 - huy123 Mattermost/textarea_Write to user1 user2_post_textbox'), 
    Keys.chord(Keys.ENTER))

Thread.sleep(1000)

WebUI.closeBrowser()

