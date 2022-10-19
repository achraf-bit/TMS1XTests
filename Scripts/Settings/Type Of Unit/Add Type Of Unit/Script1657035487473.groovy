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

WebUI.click(findTestObject('Object Repository/Settings/Type Of Units Page/button_Hi, My Tower'))

WebUI.click(findTestObject('Object Repository/Settings/Type Of Units Page/a_Settings'))

WebUI.click(findTestObject('Object Repository/Settings/Type Of Units Page/div_Type of units'))

WebUI.click(findTestObject('Object Repository/Settings/Type Of Units Page/button_Add_Type of units'))

WebUI.setText(findTestObject('Object Repository/Settings/Type Of Units Page/input_Type name_libelle'), 'test')

WebUI.setText(findTestObject('Object Repository/Settings/Type Of Units Page/input_Code'), '123456')

WebUI.setText(findTestObject('Object Repository/Settings/Type Of Units Page/input_Weight (kg)'), '30')

WebUI.setText(findTestObject('Object Repository/Settings/Type Of Units Page/input_Length (cm)'), '30')

WebUI.setText(findTestObject('Object Repository/Settings/Type Of Units Page/input_Width (cm)'), '30')

WebUI.setText(findTestObject('Object Repository/Settings/Type Of Units Page/input_Height (cm)'), '30')

WebUI.setText(findTestObject('Object Repository/Settings/Type Of Units Page/input_Volume (m3)'), '30')

WebUI.click(findTestObject('Object Repository/Settings/Type Of Units Page/checkbox_Stackable'))

WebUI.click(findTestObject('Object Repository/Settings/Type Of Units Page/button_Save'))

WebUI.closeBrowser()

