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

WebUI.click(findTestObject('Object Repository/Settings/Address Settings/a_Hi, My Tower'))

WebUI.click(findTestObject('Object Repository/Settings/Address Settings/a_Settings'))

WebUI.click(findTestObject('Settings/Exchange Rate/button_Exchange_Rates'))

WebUI.click(findTestObject('Settings/Exchange Rate/button_Add_Exchange_Rates'))

WebUI.click(findTestObject('Settings/Exchange Rate/input_Shipper'))

WebUI.click(findTestObject('Settings/Exchange Rate/div_Shipper'))

WebUI.click(findTestObject('Settings/Exchange Rate/input_Carrier'))

WebUI.click(findTestObject('Settings/Exchange Rate/div_Carrier'))

WebUI.click(findTestObject('Settings/Exchange Rate/input_From'))

WebUI.click(findTestObject('Settings/Exchange Rate/div_From'))

WebUI.click(findTestObject('Settings/Exchange Rate/input_To'))

WebUI.click(findTestObject('Settings/Exchange Rate/div_To'))

WebUI.setText(findTestObject('Settings/Exchange Rate/input_Exchange_Rate'), '0.1')

WebUI.click(findTestObject('Settings/Exchange Rate/input_Beginning_Date'))

WebUI.click(findTestObject('Settings/Exchange Rate/div_Beginning_Day'))

WebUI.click(findTestObject('Settings/Exchange Rate/input_End_Date'))

WebUI.click(findTestObject('Settings/Exchange Rate/div_End_Day'))

WebUI.click(findTestObject('Settings/Exchange Rate/button_Save'))

