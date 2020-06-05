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

WebUI.navigateToUrl('https://hcmus-mattermost-webapp.herokuapp.com/signup_email')

WebUI.setText(findTestObject('Page_Mattermost/input_concat(What  s your email address)_email'), email)

WebUI.setText(findTestObject('Page_Mattermost/input_Choose your username_name'), username)

WebUI.setEncryptedText(findTestObject('Page_Mattermost/input_Choose your password_password'), password)

WebUI.click(findTestObject('Page_Mattermost/span_Create Account'))

WebUI.click(findTestObject('Page_Mattermost/span_Create a team'))

WebUI.setText(findTestObject('Page_Mattermost/input_Team Name_teamNameInput'), namechat)

WebUI.click(findTestObject('Page_Mattermost/span_Next'))

WebUI.click(findTestObject('Page_Mattermost/span_Finish'))

WebUI.closeBrowser()

