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

WebUI.click(findTestObject('Settings/References/Parametrable Fields/button_Settings'))

WebUI.click(findTestObject('Settings/References/Parametrable Fields/button_My company'))

WebUI.click(findTestObject('Settings/Flags Page/button_Flags'))

WebUI.setText(findTestObject('Settings/Flags Page/input_search'), 'R1')

WebUI.click(findTestObject('Settings/Flags Page/button_edit'))

WebUI.setText(findTestObject('Settings/Flags Page/input_Reference'), 'R2')

WebUI.setText(findTestObject('Settings/Flags Page/input_Name'), 'test2')

WebUI.click(findTestObject('Settings/Flags Page/button_Select_Icon_Edit'))

WebUI.click(findTestObject('Settings/Flags Page/icon'))

WebUI.click(findTestObject('Settings/Flags Page/input_Color'))

WebUI.click(findTestObject('Settings/Flags Page/div_Color'))

WebUI.click(findTestObject('Settings/Flags Page/div_settings_content'))

WebUI.click(findTestObject('Settings/Flags Page/button_Update'))

WebUI.refresh()

