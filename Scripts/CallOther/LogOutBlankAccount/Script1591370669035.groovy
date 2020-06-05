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

WebUI.callTestCase(findTestCase('OtherCases/Login_Blank_Account'), [:], FailureHandling.STOP_ON_FAILURE)

<<<<<<< HEAD:Scripts/If_Else_TestCase/New Test Case/Script1591366725686.groovy
WebUI.navigateToUrl('http://localhost:8065/login')

WebUI.click(findTestObject('Page_Mattermost/span_Create one now'))

WebUI.click(findTestObject('Object Repository/Page_Mattermost/span_Back'))
=======
WebUI.click(findTestObject('Page_Mattermost/span_Logout'))
>>>>>>> a308ca2b4ebe1dd3852573d7388379b1a494cea6:Scripts/CallOther/LogOutBlankAccount/Script1591370669035.groovy

