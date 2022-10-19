package order_and_delivery

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

public class Order {

	@Keyword
	def new_order() {

		WebUI.click(findTestObject('TR/New TR By TDC/button_Add'))

		WebUI.click(findTestObject('Order And Delivery/Order/button_Purchase_Order'))

		WebUI.click(findTestObject('Order And Delivery/Order/input_From'))

		WebUI.click(findTestObject('Order And Delivery/Order/div_From'))

		WebUI.click(findTestObject('Order And Delivery/Order/input_To_form-control'))

		WebUI.click(findTestObject('Order And Delivery/Order/div_To'))
		
		WebUI.delay(2)

		WebUI.click(findTestObject('Order And Delivery/Order/input_Sold_To'))
		
		WebUI.delay(2)
		
		WebUI.click(findTestObject('Order And Delivery/Order/div_To'))

		WebUI.click(findTestObject('Order And Delivery/Order/button_Next'))

		String ts = System.currentTimeMillis().toString()

		WebUI.setText(findTestObject('Order And Delivery/Order/input_Customer_Order_Reference'), "ref"+ ts)

		WebUI.click(findTestObject('Order And Delivery/Order/button_Next2'))

		WebUI.setText(findTestObject('Order And Delivery/Order/input_Item_Number'), '12453')

		WebUI.click(findTestObject('Order And Delivery/Order/button_Create_Order'))
	}

	@Keyword
	def confirm_order() {
		WebUI.click(findTestObject('Order And Delivery/Order/td_Owner_Of_The_Request'))

		WebUI.click(findTestObject('Order And Delivery/Order/button_Confirm_Order'))
	}
}
