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

WebUI.setText(findTestObject('Object Repository/Page_Mattermost/input_All team communication in one place s_703ef5'), 'user2')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Mattermost/input_All team communication in one place s_2f2733'), 
    'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/Page_Mattermost/button_Sign in'))

WebUI.click(findTestObject('Page_Town Square - ahjgdjhg Mattermost/h1_ahjgdjhg'))

WebUI.click(findTestObject('Object Repository/Page_ Town Square - ex02 Mattermost/span_Account Settings'))

WebUI.click(findTestObject('Object Repository/Page_ Town Square - ex02 Mattermost/button_Security'))

WebUI.click(findTestObject('Object Repository/Page_ Town Square - ex02 Mattermost/div_PasswordEdit'))

WebUI.setEncryptedText(findTestObject('Page_ Town Square - ex02 Mattermost/input_Current Password_currentPassword'), pass)

WebUI.setEncryptedText(findTestObject('Page_ Town Square - ex02 Mattermost/input_New Password_newPassword'), newPass)

WebUI.setEncryptedText(findTestObject('Page_ Town Square - ex02 Mattermost/input_Retype New Password_confirmPassword'), 
    confirm)

WebUI.click(findTestObject('Object Repository/Page_ Town Square - ex02 Mattermost/span_Save'))

WebUI.closeBrowser()

