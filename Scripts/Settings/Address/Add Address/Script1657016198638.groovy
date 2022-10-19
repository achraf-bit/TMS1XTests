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

WebUI.click(findTestObject('Object Repository/Settings/Address Settings/div_Address'))

WebUI.click(findTestObject('Object Repository/Settings/Address Settings/button_Add_Address'))

WebUI.setText(findTestObject('Object Repository/Settings/Address Settings/input_Reference'), '1234')

WebUI.setText(findTestObject('Object Repository/Settings/Address Settings/input_City'), 'Shanghai')

WebUI.click(findTestObject('Settings/Address Settings/input_Country'))

WebUI.click(findTestObject('Settings/Address Settings/div_Country'))

WebUI.setText(findTestObject('Settings/Address Settings/input_Email'), 'emailAddress@gmail.co')

WebUI.click(findTestObject('Settings/Address Settings/input_Etablishment'))

WebUI.click(findTestObject('Settings/Address Settings/div_Etablishment'))

WebUI.setText(findTestObject('Settings/Address Settings/input_Address_street'), 'Xi Da Zhi Jie 72hao Ha Er Bin Tie Lu Gong An Chu Ji Tong Ke')

WebUI.click(findTestObject('Settings/Address Settings/button_Add'))

