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

WebUI.navigateToUrl('http://localhost:8065/login')

WebUI.setText(findTestObject('Page_Mattermost/input_All team communication in one place s_703ef5'), 'huy123')

WebUI.setEncryptedText(findTestObject('Page_Mattermost/input_All team communication in one place s_2f2733'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Page_Mattermost/span_Sign in'))

WebUI.click(findTestObject('Page_Town Square - cdnc Mattermost/span_'))

WebUI.setText(findTestObject('Page_Town Square - cdnc Mattermost/input_Name_newChannelName'), nameChannel)

WebUI.setText(findTestObject('Page_Town Square - cdnc Mattermost/textarea_(optional)_newChannelPurpose'), purpose)

WebUI.setText(findTestObject('Page_Town Square - cdnc Mattermost/textarea_(optional)_newChannelHeader'), header)

WebUI.click(findTestObject('Page_Town Square - cdnc Mattermost/span_Create Channel'))

WebUI.setText(findTestObject('Object Repository/Page_asd - cdnc Mattermost/textarea_Write to asd_post_textbox'), 'xin chào')

WebUI.closeBrowser()

