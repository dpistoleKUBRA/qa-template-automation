import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger
import internal.GlobalVariable as GlobalVariable

KeywordLogger log = new KeywordLogger()

WebUI.comment('Open browser and Login')

WebUI.openBrowser(GlobalVariable.G_DefaultSiteURL)

WebUI.waitForPageLoad(GlobalVariable.G_ShortTimeout)

WebUI.maximizeWindow()

log.logWarning('--- Begin Login ---')

log.logWarning('Logging in to environment - ' + GlobalVariable.G_DefaultSiteURL)

WebUI.waitForElementClickable(findTestObject('Products/Cerberus/LoginLogout/LogInWithGoogle'), 15)

WebUiBuiltInKeywords.delay(2)

WebUI.click(findTestObject('Products/Cerberus/LoginLogout/LogInWithGoogle'))

WebUI.waitForElementVisible(findTestObject('Products/Cerberus/LoginLogout/UserName'), 15)

WebUI.setMaskedText(findTestObject('Products/Cerberus/LoginLogout/UserName'), 'tempeqa@kubra.com')

WebUI.waitForElementVisible(findTestObject('Products/Cerberus/LoginLogout/UserNameNextButton'), 15)

WebUI.click(findTestObject('Products/Cerberus/LoginLogout/UserNameNextButton'))

WebUI.waitForElementVisible(findTestObject('Products/Cerberus/LoginLogout/Password'), 15)

WebUI.setMaskedText(findTestObject('Products/Cerberus/LoginLogout/Password'), 'qAisgr8!@')

WebUI.waitForElementClickable(findTestObject('Products/Cerberus/LoginLogout/PasswordNextButton'), 15)

WebUI.click(findTestObject('Products/Cerberus/LoginLogout/PasswordNextButton'))

WebUiBuiltInKeywords.delay(5)

'For DEV/QA Environment Testing'
WebUI.waitForElementClickable(findTestObject('Products/Cerberus/LoginLogout/TenantQATestUtilityCompany'), 15)

WebUI.click(findTestObject('Products/Cerberus/LoginLogout/TenantQATestUtilityCompany'))

WebUI.verifyElementText(findTestObject('Products/Cerberus/LoginLogout/TenantQATestUtilityCompany'), 'QA Test Utility Company')

WebUI.waitForElementClickable(findTestObject('Products/Cerberus/LoginLogout/TenantSubmitButton'), 15)

WebUI.click(findTestObject('Products/Cerberus/LoginLogout/TenantSubmitButton'))

WebUiBuiltInKeywords.waitForElementClickable(findTestObject('Products/Cerberus/LoginLogout/ChooseApp-Templates'), 
    15)

WebUiBuiltInKeywords.click(findTestObject('Products/Cerberus/LoginLogout/ChooseApp-Templates'))

WebUiBuiltInKeywords.waitForElementClickable(findTestObject('Products/Cerberus/LoginLogout/SubmitButton_ChooseApp'), 
    15)

WebUiBuiltInKeywords.click(findTestObject('Products/Cerberus/LoginLogout/SubmitButton_ChooseApp'))

WebUI.delay(1)

WebUiBuiltInKeywords.verifyTextPresent('Latest Activity', false)

log.logWarning('--- End Login ---')

