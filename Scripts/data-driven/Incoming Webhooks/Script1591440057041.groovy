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

WebUI.click(findTestObject('Object Repository/Page_Town Square - huy123 Mattermost/span'))

WebUI.click(findTestObject('Object Repository/Page_Town Square - huy123 Mattermost/span_Integrations'))

WebUI.click(findTestObject('Object Repository/Page_Integrations - huy123 Mattermost/a_Incoming WebhooksIncoming webhooks allow _f6560d'))

WebUI.click(findTestObject('Object Repository/Page_Integrations - huy123 Mattermost/span_Add Incoming Webhook'))

WebUI.click(findTestObject('Object Repository/Page_Integrations - asd Mattermost/input_Title_displayName'))

WebUI.setText(findTestObject('Object Repository/Page_Integrations - asd Mattermost/input_Title_displayName'), title)

WebUI.click(findTestObject('Object Repository/Page_Integrations - asd Mattermost/input_Description_description'))

WebUI.setText(findTestObject('Object Repository/Page_Integrations - asd Mattermost/input_Description_description'), description)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Integrations - asdljfh Mattermost/select_--- Select a channel ---Off-TopicTow_96892b'), 
    'he1dhisc37rxxrnmeryz7ff83y', true)

WebUI.click(findTestObject('Object Repository/Page_Integrations - asdljfh Mattermost/input_Lock to this channel_channelLocked'))

WebUI.click(findTestObject('Object Repository/Page_Integrations - asdljfh Mattermost/span_Save'))

WebUI.click(findTestObject('Object Repository/Page_Integrations - asdljfh Mattermost/span_Done'))

WebUI.closeBrowser()

