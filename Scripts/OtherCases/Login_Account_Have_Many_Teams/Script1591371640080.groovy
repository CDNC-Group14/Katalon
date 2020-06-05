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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://hcmus-mattermost-webapp.herokuapp.com/')

WebUI.setText(findTestObject('Page_Mattermost/input_All team communication in one place s_703ef5'), 'huy2@gmail.com')

WebUI.setEncryptedText(findTestObject('Page_Mattermost/input_All team communication in one place s_2f2733'), 'aeHFOx8jV/A=')

<<<<<<< HEAD:Scripts/CallOther/LogOut/Script1591368967199.groovy
WebUI.setEncryptedText(findTestObject('Page_Mattermost/input_Choose your password_password'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Page_Mattermost/button_Create Account'))

WebUI.click(findTestObject('Object Repository/Page_Mattermost/span_Logout'))

WebUI.navigateToUrl('http://localhost:8065/login')
=======
WebUI.click(findTestObject('Page_Mattermost/button_Sign in'))
>>>>>>> a308ca2b4ebe1dd3852573d7388379b1a494cea6:Scripts/OtherCases/Login_Account_Have_Many_Teams/Script1591371640080.groovy

