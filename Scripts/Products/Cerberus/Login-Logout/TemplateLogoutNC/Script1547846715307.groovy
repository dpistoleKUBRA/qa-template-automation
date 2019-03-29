import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.comment('Open browser, login and logout')

WebUI.openBrowser(GlobalVariable.G_DefaultSiteURL)

WebUI.waitForPageLoad(GlobalVariable.G_ShortTimeout)

WebUI.maximizeWindow()

WebUiBuiltInKeywords.delay(1)

WebUI.click(findTestObject('Products/Cerberus/LoginLogout/LogInWithGoogle'))

WebUiBuiltInKeywords.delay(2)

WebUI.setMaskedText(findTestObject('Products/Cerberus/LoginLogout/UserName'), 'tempeqa@kubra.com')

WebUiBuiltInKeywords.delay(1)

WebUI.click(findTestObject('Products/Cerberus/LoginLogout/UserNameNextButton'))

WebUiBuiltInKeywords.delay(3)

WebUI.waitForElementVisible(findTestObject('Products/Cerberus/LoginLogout/Password'), 0)

WebUI.setMaskedText(findTestObject('Products/Cerberus/LoginLogout/Password'), 'qAisgr8!@')

WebUI.click(findTestObject('Products/Cerberus/LoginLogout/PasswordNextButton'))

'For Dev Environment Testing'
WebUI.click(findTestObject('Products/Cerberus/LoginLogout/TenantABCUtilityCompany'))

WebUI.verifyElementText(findTestObject('Products/Cerberus/LoginLogout/TenantABCUtilityCompany'), 'ABC Utility Company')

WebUI.waitForElementClickable(findTestObject('Products/Cerberus/LoginLogout/TenantSubmitButton'), 15)

WebUI.click(findTestObject('Products/Cerberus/LoginLogout/TenantSubmitButton'))

WebUiBuiltInKeywords.waitForElementClickable(findTestObject('Products/Cerberus/LoginLogout/ChooseApp-Templates'), 
    15)

WebUiBuiltInKeywords.click(findTestObject('Products/Cerberus/LoginLogout/ChooseApp-Templates'))

WebUiBuiltInKeywords.waitForElementClickable(findTestObject('Products/Cerberus/LoginLogout/SubmitButton_ChooseApp'), 
    15)

WebUiBuiltInKeywords.click(findTestObject('Products/Cerberus/LoginLogout/SubmitButton_ChooseApp'))

WebUI.delay(1)

WebUI.delay(5)

WebUiBuiltInKeywords.click(findTestObject('Products/Cerberus/LoginLogout/LogoutButton'))

WebUiBuiltInKeywords.delay(4)

WebUiBuiltInKeywords.verifyTextPresent('Log In', false)

WebUI.closeBrowser()

