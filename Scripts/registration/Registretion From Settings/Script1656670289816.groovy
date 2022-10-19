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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

CustomKeywords.'auth.Login.loginTDC'()

WebUI.click(findTestObject('Object Repository/Registration/Registration Settings Page/button_plus_circle'))

WebUI.click(findTestObject('Object Repository/Registration/Registration Settings Page/button_User'))

WebUI.setText(findTestObject('Object Repository/Registration/Registration Settings Page/input_Email'), 'user4@gmail.com')

WebUI.setText(findTestObject('Object Repository/Registration/Registration Settings Page/input_Last Name'), 'user1')

WebUI.setText(findTestObject('Object Repository/Registration/Registration Settings Page/input_First Name'), 'test')

WebUI.setText(findTestObject('Object Repository/Registration/Registration Settings Page/input_User Name'), 'user44test')

WebUI.selectOptionByValue(findTestObject('Object Repository/Registration/Registration Settings Page/select_Establishment'), 
    '1: Object', true)

WebUI.click(findTestObject('Object Repository/Registration/Registration Settings Page/radio_Profile'))

WebUI.click(findTestObject('Object Repository/Registration/Registration Settings Page/button_Add user'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Registration/Registration Settings Page/alert_Operation_Successfully_Completed'))

//WebUI.click(findTestObject('Object Repository/Registration/Registration Settings Page/button_Close'))
WebUI.closeBrowser()

