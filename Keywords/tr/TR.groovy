package tr

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class TR {

	@Keyword
	def TR_in_Process_waiting_For_Quote() {

		if(GlobalVariable.currentTestCaseName != "Order and Delivery") {

			WebUI.click(findTestObject('TR/New TR By TDC/button_Add'))

			WebUI.click(findTestObject('TR/New TR By TDC/button_Transport_Request'))

			WebUI.click(findTestObject('TR/New TR By Shipper/input_From_Address_For_Shipper'))

			WebUI.click(findTestObject('TR/New TR By Shipper/div_From_Address_for_Shipper'))

			WebUI.click(findTestObject('TR/New TR By Shipper/input_To_Address_For_Shipper'))

			WebUI.click(findTestObject('TR/New TR By Shipper/div_To_Address_For_Shipper'))
		}

		WebUI.click(findTestObject('TR/New TR By TDC/div_Road'))

		WebUI.delay(2)

		WebUI.click(findTestObject('TR/New TR By TDC/radio_Consolidation'))

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

		WebUI.click(findTestObject('TR/New TR By Shipper/input_Invoice_Currency_Shipper'))

		WebUI.click(findTestObject('TR/New TR By TDC/div_EUR - Euro'))

		WebUI.click(findTestObject('TR/New TR By TDC/button_Next'))

		WebUI.click(findTestObject('TR/New TR By TDC/button_Next2'))

		if((GlobalVariable.currentTestCaseName == "New TR Solicitation Of Shipper By Carriers")|| (GlobalVariable.currentTestCaseName == "Order and Delivery")) {

			WebUI.check(findTestObject('TR/New TR By Shipper/Checkbox_Pricing_Carrier'))
		}
		else {

			WebUI.check(findTestObject('TR/New TR By Shipper/Checkbox_Pricing_TDC'))
		}

		WebUI.click(findTestObject('TR/New TR By Shipper/button_Send_Request_From_Shipper'))

		WebUI.waitForElementVisible(findTestObject('TR/Add Quotation/notification'), 0)

		WebUI.click(findTestObject('TR/Add Quotation/button_Bell'))

		WebUI.verifyElementPresent(findTestObject('TR/Add Quotation/div_Alert'), 0)

		WebUI.delay(3)

		WebUI.closeBrowser()
	}


	@Keyword
	def TR_waiting_For_Confirmation() {

		WebUI.click(findTestObject('TR/Add Quotation/button_Bell'))

		WebUI.click(findTestObject('TR/Add Quotation/div_Alert'))

		WebUI.click(findTestObject('TR/Add Quotation/button_Bell'))

		if((GlobalVariable.currentTestCaseName == "New TR Solicitation Of Shipper By Carriers")|| (GlobalVariable.currentTestCaseName == "Order and Delivery")) {

			WebUI.click(findTestObject('TR/Add Quotation/button_Add quotation'))
		}
		else{

			WebUI.click(findTestObject('temp/test/button_Acknowledge'))

			WebUI.click(findTestObject('temp/test/button_Edit'))

			WebUI.doubleClick(findTestObject('TR/Add Quotation/button_Pricing'))

			//WebUI.click(findTestObject('TR/Add Quotation/button_Pricing'))

			WebUI.delay(2)

			WebUI.click(findTestObject('TR/Add Quotation/button_Pricing'))

			WebUI.setText(findTestObject('temp/test/input_Select_Carriers'), 'User')

			WebUI.waitForElementPresent(findTestObject('temp/test/div_User_Carrier'), 0)

			WebUI.click(findTestObject('temp/test/div_User_Carrier'))

			WebUI.click(findTestObject('temp/test/button_Add quotation'))
		}

		WebUI.setText(findTestObject('TR/Add Quotation/input_Total transit time'), 10)

		WebUI.setText(findTestObject('TR/Add Quotation/input_Total_Price'), 10000)

		WebUI.click(findTestObject('TR/Add Quotation/button_Submit_Quotation'))

		WebUI.delay(3)

		WebUI.waitForElementVisible(findTestObject('TR/Add Quotation/notification'), 0)

		WebUI.click(findTestObject('TR/Add Quotation/button_Bell'))

		WebUI.verifyElementPresent(findTestObject('TR/Add Quotation/div_Alert'), 0)

		WebUI.delay(2)

		WebUI.closeBrowser()
	}

	@Keyword
	def TR_confirmed() {

		WebUI.verifyElementVisible(findTestObject('TR/Add Quotation/notification'))

		WebUI.click(findTestObject('TR/Add Quotation/button_Bell'))

		WebUI.click(findTestObject('TR/Add Quotation/div_Alert'))

		WebUI.click(findTestObject('TR/Add Quotation/button_Bell'))

		WebUI.click(findTestObject('TR/Add Quotation/button_Pricing'))

		WebUI.delay(2)

		WebUI.click(findTestObject('TR/Add Quotation/button_Pricing'))

		WebUI.waitForElementVisible(findTestObject('TR/Add Quotation/button_Confirm choice'), 0)

		WebUI.click(findTestObject('TR/Add Quotation/button_Confirm choice'))

		WebUI.click(findTestObject('TR/Add Quotation/button_Yes'))

		WebUI.delay(3)

		WebUI.waitForElementVisible(findTestObject('TR/Add Quotation/notification'), 0)

		WebUI.click(findTestObject('TR/Add Quotation/button_Bell'))

		WebUI.verifyElementVisible(findTestObject('TR/Add Quotation/div_Alert'))

		WebUI.delay(4)
	}



	@Keyword
	def verify_freight_Audit() {

		WebUI.click(findTestObject('TR/Add Quotation/button_Module'))

		WebUI.click(findTestObject('Freight Audit/button_Freight_Audit'))

		WebUI.click(findTestObject('Freight Audit/button_Details'))

		WebUI.delay(3)

		WebUI.closeBrowser()
	}
	
	
}


