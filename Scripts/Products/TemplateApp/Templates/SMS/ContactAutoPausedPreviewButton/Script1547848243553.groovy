import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('Products/Cerberus/Login-Logout/TemplateLoginNCQATestUtility'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(4)

WebUI.click(findTestObject('Products/TemplateApp/Templates/Common/SelectTemplates'))

WebUI.delay(2)

WebUI.click(findTestObject('Products/TemplateApp/SelectEnvironment/downCaret'))

WebUI.click(findTestObject('Products/TemplateApp/SelectEnvironment/SelectEnvironmentDevelop'))

WebUI.delay(2)

WebUI.click(findTestObject('Products/TemplateApp/Templates/SMS/SelectSMS'))

WebUI.click(findTestObject('Products/TemplateApp/Templates/Email/ContactAutoPausedForm'))

WebUI.verifyElementText(findTestObject('Products/TemplateApp/Templates/Common/FormHeaderText'), 'CONTACT_AUTO_PAUSED.NJK')

WebUI.waitForElementClickable(findTestObject('Products/TemplateApp/Templates/Common/PreviewButton'), 10)

WebUI.click(findTestObject('Products/TemplateApp/Templates/Common/PreviewButton'))

WebUI.delay(5)

WebUI.verifyElementText(findTestObject('Products/TemplateApp/Templates/Common/PreviewHeader'), 'PREVIEW')

WebUI.click(findTestObject('Products/TemplateApp/Templates/Common/ClosePreview'))

WebUI.verifyElementPresent(findTestObject('Products/TemplateApp/Templates/Common/FormHeaderText'), 2)

WebUI.closeBrowser()

