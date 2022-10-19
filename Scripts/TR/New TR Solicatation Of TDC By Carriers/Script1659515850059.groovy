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

WebUI.click(findTestObject('TR/New TR By TDC/button_Add'))

WebUI.click(findTestObject('TR/New TR By TDC/button_Transport_Request'))

WebUI.setText(findTestObject('TR/New TR By TDC/input_Owner_Of_Request'), 'del')

WebUI.click(findTestObject('TR/New TR By TDC/button_Owner_Of_Request'))

WebUI.click(findTestObject('TR/New TR By TDC/input_From_Address'))

WebUI.click(findTestObject('TR/New TR By TDC/div_From_Address'))

WebUI.click(findTestObject('TR/New TR By TDC/input_To_Address'))

WebUI.click(findTestObject('TR/New TR By TDC/div_To_Address'))

WebUI.click(findTestObject('TR/New TR By TDC/div_Road'))

WebUI.click(findTestObject('TR/New TR By TDC/select_Flux_Transport'))

WebUI.click(findTestObject('TR/New TR By TDC/select_PSL_Schema'))

WebUI.click(findTestObject('TR/New TR By TDC/PSL_Schema'))

WebUI.click(findTestObject('TR/New TR By TDC/button_PSL'))

WebUI.click(findTestObject('TR/New TR By TDC/select_Incoterm'))

WebUI.click(findTestObject('TR/New TR By TDC/incoterm'))

WebUI.click(findTestObject('TR/New TR By TDC/input_Date_Of_Goods_Availability'))

WebUI.click(findTestObject('TR/New TR By TDC/date'))

WebUI.click(findTestObject('TR/New TR By TDC/button_Next'))

WebUI.click(findTestObject('TR/New TR By TDC/select_Service_Level'))

WebUI.click(findTestObject('TR/New TR By TDC/Element_Service_Level'))

WebUI.click(findTestObject('TR/New TR By TDC/input_Invoice_Currency'))

WebUI.click(findTestObject('TR/New TR By TDC/div_EUR - Euro'))

WebUI.click(findTestObject('TR/New TR By TDC/button_Next'))

WebUI.click(findTestObject('TR/New TR By TDC/button_Next2'))

WebUI.check(findTestObject('TR/New TR By TDC/checkbox_Pricing'))

WebUI.click(findTestObject('TR/New TR By TDC/button_Send_Request'))

