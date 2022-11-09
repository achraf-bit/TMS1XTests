package auth
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.google.common.collect.FilteredEntryMultimap$Keys
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.configuration.RunConfiguration

class Registration {


	@Keyword
	def roles(){
		//WebUI.comment(" current Test Case is ${GlobalVariable.currentTestCaseName}")
		if(GlobalVariable.currentTestCaseName == "Registration Shipper") {
			WebUI.click(findTestObject('Object Repository/Registration/Registration Page/radio_Shipper'))
		}
		if(GlobalVariable.currentTestCaseName == "Registration Carrier")
		{
			WebUI.click(findTestObject('Registration/Registration Page/radio_Service provider'))
			WebUI.check(findTestObject('Registration/Registration Page/input_Carrier'))

		}
		if(GlobalVariable.currentTestCaseName == "Registration Broker"){
			WebUI.click(findTestObject('Registration/Registration Page/radio_Service provider'))
			WebUI.check(findTestObject('Registration/Registration Page/input_Broker'))
		}
		if(GlobalVariable.currentTestCaseName == "Registration Carrier Broker"){
			WebUI.click(findTestObject('Registration/Registration Page/radio_Service provider'))
			WebUI.check(findTestObject('Registration/Registration Page/input_Carrier'))
			WebUI.check(findTestObject('Registration/Registration Page/input_Broker'))
		}




	}

	/**
	 * registration
	 */

	@Keyword
	def registration(){

		WebUI.openBrowser(GlobalVariable.UrlTMS)
		
		WebUI.waitForElementPresent(findTestObject('Object Repository/Registration/Registration Page/Signin_button'), 0)
		
		WebUI.click(findTestObject('Object Repository/Registration/Registration Page/Signin_button'))

		println('####### hello it passed ######')

		WebUI.setText(findTestObject('Object Repository/Registration/Registration Page/input_Last Name'), 'user4')
		
		WebUI.waitForElementPresent(findTestObject('Object Repository/Registration/Registration Page/Page_MyTower/input_First Name_prenom'), 0)
		
		WebUI.setText(findTestObject('Object Repository/Registration/Registration Page/Page_MyTower/input_First Name_prenom'), 'testA')

		roles();

		String ts = System.currentTimeMillis().toString()

		WebUI.setText(findTestObject('Object Repository/Registration/Registration Page/input_Email'), ts + "@test.com")


		WebUI.setText(findTestObject('Object Repository/Registration/Registration Page/input_Address'), 'add1')

		WebUI.setEncryptedText(findTestObject('Object Repository/Registration/Registration Page/input_Password'), 'ILo2o15e/q90fA2wuBQBEQ==')

		WebUI.setEncryptedText(findTestObject('Object Repository/Registration/Registration Page/input_Confirm Password'), 'ILo2o15e/q90fA2wuBQBEQ==')

		WebUI.click(findTestObject('Registration/Registration Page/button_Next1'))

		if(GlobalVariable.currentTestCaseName == "Registration Shipper") {

			WebUI.setText(findTestObject('Object Repository/Registration/Registration Page/input_SIREN'), '130000000')
		}
		else {

			WebUI.setText(findTestObject('Object Repository/Registration/Registration Page/input_SIREN'), '131000000')

		}


		if (findTestObject('Object Repository/Registration/Registration Page/input_Company_Code') == null) {
			WebUI.setText(findTestObject('Object Repository/Registration/Registration Page/input_Company_Code'), 'AT')

			WebUI.setText(findTestObject('Object Repository/Registration/Registration Page/input_Company_Name'), 'Automatisation de test')

			WebUI.setText(findTestObject('Object Repository/Registration/Registration Page/input_Group'), 'ATG')
		}

		WebUI.setText(findTestObject('Object Repository/Registration/Registration Page/input_NIC'), '13131')

		if (findTestObject('Object Repository/Registration/Registration Page/input_NIC') == null) {
			WebUI.setText(findTestObject('Object Repository/Registration/Registration Page/input_Establishment_Name'), 'Etab1')

			WebUI.selectOptionByValue(findTestObject('Object Repository/Registration/Registration Page/select_Country_Name'), '148: Object',
					true)

			WebUI.setText(findTestObject('Object Repository/Registration/Registration Page/input_City'), 'casablanca')

			WebUI.setText(findTestObject('Object Repository/Registration/Registration Page/textarea_Address'), 'add1')

			WebUI.setText(findTestObject('Object Repository/Registration/Registration Page/input_Phone2'), '0612345678')
		}

		WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ARROW_DOWN))

		WebUI.click(findTestObject('Registration/Registration Page/button_Next2'))

		WebUI.click(findTestObject('Registration/Registration Page/label_I agree'))

		WebUI.click(findTestObject('Registration/Registration Page/button_Next3'))

		WebUI.click(findTestObject('Object Repository/Registration/Registration Page/button_Finish'))

		WebUI.click(findTestObject('Object Repository/Registration/Registration Page/div_Congratulations Your MyTower account is created'))

		WebUI.click(findTestObject('Object Repository/Registration/Registration Page/div_Information'))

		WebUI.verifyElementVisible(findTestObject('Object Repository/Registration/Registration Page/div_Information'))

		WebUI.click(findTestObject('Object Repository/Registration/Registration Page/button_Ok'))




	}
}

