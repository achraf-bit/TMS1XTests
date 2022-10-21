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

		WebUI.openBrowser('')

		WebUI.navigateToUrl('https://tms.dev.mytower.fr/')

		WebUI.setText(findTestObject('Object Repository/Page_Sign in to MyTower/input_Forgotten your password_username'), 'mytower2018+soungsid+chargeur@gmail.com')

		WebUI.setEncryptedText(findTestObject('Object Repository/Page_Sign in to MyTower/input_Forgotten your password_password'),
				'cQlZAR1V2CaThNHrQfGK3Q==')

		WebUI.click(findTestObject('Object Repository/Page_Sign in to MyTower/input_Forgotten your password_submit pointer'))

	}
}

