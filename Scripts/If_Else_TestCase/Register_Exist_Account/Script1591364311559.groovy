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

WebUI.navigateToUrl('http://hcmus-mattermost-webapp.herokuapp.com/signup_email')

WebUI.setEncryptedText(findTestObject('Page_Mattermost/input_Choose your password_password'), 'kqakvKzNv1OoS06P96fXXQ==')

WebUI.setText(findTestObject('Page_Mattermost/input_Choose your username_name'), 'queocute')
WebUI.setText(findTestObject('Page_Mattermost/input_concat(What  s your email address)_email'),"huycong2798@gmail.com")
WebUI.click(findTestObject('Page_Mattermost/span_Create Account'))
if(WebUI.verifyTextPresent('An account with that email already exists.', false))
{
	WebUI.click(findTestObject('Page_Mattermost/span_Back'))
}


