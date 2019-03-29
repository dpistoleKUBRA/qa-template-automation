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
import com.kms.katalon.core.webui.driver.DriverFactory as DF
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.By as By
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger

KeywordLogger log = new KeywordLogger()

String commitNumber = CustomKeywords.'tools.TestDataGenerator.getRandomWords'(1, 2)

log.logInfo(commitNumber)

WebUI.callTestCase(findTestCase('Products/Cerberus/Login-Logout/TemplateLoginNCQATestUtility'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(4)

WebUI.click(findTestObject('Products/TemplateApp/Templates/Common/SelectTemplates'))

WebUI.delay(4)

WebUI.click(findTestObject('Products/TemplateApp/SelectEnvironment/DownCaret'))

WebUI.click(findTestObject('Products/TemplateApp/SelectEnvironment/SelectEnvironmentDevelop'))

WebUI.delay(2)

WebUI.click(findTestObject('Products/TemplateApp/Templates/SharedAssets/SelectShared'))

WebUI.delay(5)

WebUI.click(findTestObject('Products/TemplateApp/Templates/SharedAssets/GlobalYML/GlobalYMLForm'))

WebUI.delay(5)

WebUI.verifyElementText(findTestObject('Products/TemplateApp/Templates/Common/FormHeaderText'), 'GLOBAL.YML')

WebUI.delay(3)

WebUI.clearText(findTestObject('Products/TemplateApp/Templates/SharedAssets/GlobalYML/GSmsGreeting'))

WebUI.delay(1)

WebUI.setText(findTestObject('Products/TemplateApp/Templates/SharedAssets/GlobalYML/GSmsGreeting'), commitNumber)

/*WebUI.clearText(findTestObject('Products/TemplateApp/Templates/SharedAssets/GlobalYML/Title'))
WebUI.delay(1)

WebUI.setText(findTestObject('Products/TemplateApp/Templates/SharedAssets/GlobalYML/Title'), 'QA Utlity')*/
WebUI.clearText(findTestObject('Products/TemplateApp/Templates/SharedAssets/GlobalYML/GUnsubscribeLink'))

WebUI.setText(findTestObject('Products/TemplateApp/Templates/SharedAssets/GlobalYML/GUnsubscribeLink'), 'http://www.abc.com/alerts')

WebUI.clearText(findTestObject('Products/TemplateApp/Templates/SharedAssets/GlobalYML/GMyAccountLink'))

WebUI.setText(findTestObject('Products/TemplateApp/Templates/SharedAssets/GlobalYML/GMyAccountLink'), 'https://my.abc.com/myabc/AccountSummary')

WebUI.clearText(findTestObject('Products/TemplateApp/Templates/SharedAssets/GlobalYML/GResumeAlertsLink'))

WebUI.setText(findTestObject('Products/TemplateApp/Templates/SharedAssets/GlobalYML/GResumeAlertsLink'), 'http://www.abc.com/alerts/resumed')

WebUI.clearText(findTestObject('Products/TemplateApp/Templates/SharedAssets/GlobalYML/GMyUOC'))

WebUI.setText(findTestObject('Products/TemplateApp/Templates/SharedAssets/GlobalYML/GMyUOC'), 'abc.com')

WebUI.clearText(findTestObject('Products/TemplateApp/Templates/SharedAssets/GlobalYML/GPCNLink'))

WebUI.setText(findTestObject('Products/TemplateApp/Templates/SharedAssets/GlobalYML/GPCNLink'), 'www.aaa.com/pcn')

WebUI.clearText(findTestObject('Products/TemplateApp/Templates/SharedAssets/GlobalYML/GPCNLinkIVR'))

WebUI.setText(findTestObject('Products/TemplateApp/Templates/SharedAssets/GlobalYML/GPCNLinkIVR'), 'www.dot.com/pcn')

WebUI.clearText(findTestObject('Products/TemplateApp/Templates/SharedAssets/GlobalYML/GABCFAQLink'))

WebUI.setText(findTestObject('Products/TemplateApp/Templates/SharedAssets/GlobalYML/GABCFAQLink'), 'www.abc.com/faq')

WebUI.clearText(findTestObject('Products/TemplateApp/Templates/SharedAssets/GlobalYML/GABCContactUsLink'))

WebUI.setText(findTestObject('Products/TemplateApp/Templates/SharedAssets/GlobalYML/GABCContactUsLink'), 'www.aaa.com/contactus')

WebUI.clearText(findTestObject('Products/TemplateApp/Templates/SharedAssets/GlobalYML/GSMSContact'))

WebUI.setText(findTestObject('Products/TemplateApp/Templates/SharedAssets/GlobalYML/GSMSContact'), '78789')

WebUI.clearText(findTestObject('Products/TemplateApp/Templates/SharedAssets/GlobalYML/GCustomerServicePhoneOrlando'))

WebUI.setText(findTestObject('Products/TemplateApp/Templates/SharedAssets/GlobalYML/GCustomerServicePhoneOrlando'), '555-555-9018')

WebUI.clearText(findTestObject('Products/TemplateApp/Templates/SharedAssets/GlobalYML/GCustomerServicePhoneCloud'))

WebUI.setText(findTestObject('Products/TemplateApp/Templates/SharedAssets/GlobalYML/GCustomerServicePhoneCloud'), '555-555-7777')

WebUI.clearText(findTestObject('Products/TemplateApp/Templates/SharedAssets/GlobalYML/GRegistrationConfirmationURL'))

WebUI.setText(findTestObject('Products/TemplateApp/Templates/SharedAssets/GlobalYML/GRegistrationConfirmationURL'), 'http://www.aaa.com/alerts/email-confirmed')

WebUI.clearText(findTestObject('Products/TemplateApp/Templates/SharedAssets/GlobalYML/GABCCustLoginLink'))

WebUI.setText(findTestObject('Products/TemplateApp/Templates/SharedAssets/GlobalYML/GABCCustLoginLink'), 'bit.ly/2w')

WebUI.clearText(findTestObject('Products/TemplateApp/Templates/SharedAssets/GlobalYML/GABCMyprefsLink'))

WebUI.setText(findTestObject('Products/TemplateApp/Templates/SharedAssets/GlobalYML/GABCMyprefsLink'), 'bit.ly/2x')

WebUI.clearText(findTestObject('Products/TemplateApp/Templates/SharedAssets/GlobalYML/GPreferencesHomeLink'))

WebUI.setText(findTestObject('Products/TemplateApp/Templates/SharedAssets/GlobalYML/GPreferencesHomeLink'), 'https://my.abc.com/myabc/AlertsPreferences')

WebUI.clearText(findTestObject('Products/TemplateApp/Templates/SharedAssets/GlobalYML/GEmailContentLocation'))

WebUI.setText(findTestObject('Products/TemplateApp/Templates/SharedAssets/GlobalYML/GEmailContentLocation'), 'https://s3.amazonaws.com/')

WebUI.clearText(findTestObject('Products/TemplateApp/Templates/SharedAssets/GlobalYML/GOutMapLink'))

WebUI.setText(findTestObject('Products/TemplateApp/Templates/SharedAssets/GlobalYML/GOutMapLink'), 'https://outagemaptest.abc.com/external/default.html')

WebUI.clearText(findTestObject('Products/TemplateApp/Templates/SharedAssets/GlobalYML/GOutMapLinkTest'))

WebUI.setText(findTestObject('Products/TemplateApp/Templates/SharedAssets/GlobalYML/GOutMapLinkTest'), 'https://outagemaptest.abc.com/external')

WebUI.clearText(findTestObject('Products/TemplateApp/Templates/SharedAssets/GlobalYML/ProductName'))

WebUI.setText(findTestObject('Products/TemplateApp/Templates/SharedAssets/GlobalYML/ProductName'), 'Templates')

WebUI.clearText(findTestObject('Products/TemplateApp/Templates/SharedAssets/GlobalYML/FormalCompanyName'))

WebUI.setText(findTestObject('Products/TemplateApp/Templates/SharedAssets/GlobalYML/FormalCompanyName'), 'KUBRA')

WebUI.clearText(findTestObject('Products/TemplateApp/Templates/SharedAssets/GlobalYML/AddressLine1'))

WebUI.setText(findTestObject('Products/TemplateApp/Templates/SharedAssets/GlobalYML/AddressLine1'), '123 Fake Address')

WebUI.clearText(findTestObject('Products/TemplateApp/Templates/SharedAssets/GlobalYML/AddressLine2'))

WebUI.setText(findTestObject('Products/TemplateApp/Templates/SharedAssets/GlobalYML/AddressLine2'), 'Suit 100, Tempe')

WebUI.clearText(findTestObject('Products/TemplateApp/Templates/SharedAssets/GlobalYML/SupportEmail'))

WebUI.setText(findTestObject('Products/TemplateApp/Templates/SharedAssets/GlobalYML/SupportEmail'), 'support@kubra.com')

WebUI.clearText(findTestObject('Products/TemplateApp/Templates/SharedAssets/GlobalYML/SupportURL'))

WebUI.setText(findTestObject('Products/TemplateApp/Templates/SharedAssets/GlobalYML/SupportURL'), 'https://support.kubra.com')

WebUI.clearText(findTestObject('Products/TemplateApp/Templates/SharedAssets/GlobalYML/SenderName'))

WebUI.setText(findTestObject('Products/TemplateApp/Templates/SharedAssets/GlobalYML/SenderName'), 'Help')

WebUI.clearText(findTestObject('Products/TemplateApp/Templates/SharedAssets/GlobalYML/LiveChatURL'))

WebUI.setText(findTestObject('Products/TemplateApp/Templates/SharedAssets/GlobalYML/LiveChatURL'), 'https://kubra.com/chatbot')

WebUI.clearText(findTestObject('Products/TemplateApp/Templates/SharedAssets/GlobalYML/UseImages'))

WebUI.setText(findTestObject('Products/TemplateApp/Templates/SharedAssets/GlobalYML/UseImages'), 'reuse')

WebUI.clearText(findTestObject('Products/TemplateApp/Templates/SharedAssets/GlobalYML/ImagesURL'))

WebUI.setText(findTestObject('Products/TemplateApp/Templates/SharedAssets/GlobalYML/ImagesURL'), 'https://raw.githubusercontent.com/wildbit')

WebUI.clearText(findTestObject('Products/TemplateApp/Templates/SharedAssets/GlobalYML/LogoFile'))

WebUI.setText(findTestObject('Products/TemplateApp/Templates/SharedAssets/GlobalYML/LogoFile'), 'logo.png')

WebUI.clearText(findTestObject('Products/TemplateApp/Templates/SharedAssets/GlobalYML/FacebookURL'))

WebUI.setText(findTestObject('Products/TemplateApp/Templates/SharedAssets/GlobalYML/FacebookURL'), 'https://facebook.com/kubra')

WebUI.clearText(findTestObject('Products/TemplateApp/Templates/SharedAssets/GlobalYML/TwitterURL'))

WebUI.setText(findTestObject('Products/TemplateApp/Templates/SharedAssets/GlobalYML/TwitterURL'), 'https://twitter.com/KUBRA')

WebUI.clearText(findTestObject('Products/TemplateApp/Templates/SharedAssets/GlobalYML/InstagramURL'))

WebUI.setText(findTestObject('Products/TemplateApp/Templates/SharedAssets/GlobalYML/InstagramURL'), 'https://instagram.com/kubra1')

WebUI.clearText(findTestObject('Products/TemplateApp/Templates/SharedAssets/GlobalYML/YoutubeURL'))

WebUI.setText(findTestObject('Products/TemplateApp/Templates/SharedAssets/GlobalYML/YoutubeURL'), 'https://youtube.com/kubra1')

WebUI.clearText(findTestObject('Products/TemplateApp/Templates/SharedAssets/GlobalYML/PinterestURL'))

WebUI.setText(findTestObject('Products/TemplateApp/Templates/SharedAssets/GlobalYML/PinterestURL'), 'https://pintereset/kubra1')

WebUI.setText(findTestObject('Products/TemplateApp/Templates/SharedAssets/CommitMessage'), commitNumber)

WebUI.click(findTestObject('Products/TemplateApp/Templates/SharedAssets/SaveButton'))

WebUI.click(findTestObject('Products/TemplateApp/Templates/SharedAssets/GlobalYML/GlobalYMLForm'))

WebUI.delay(2)

WebUI.click(findTestObject('Products/TemplateApp/Templates/SharedAssets/SelectHistory'))

WebUI.delay(4)

WebUI.getText(findTestObject('Products/TemplateApp/Templates/SharedAssets/CommitMessageUnderHistory'))

WebUI.verifyElementText(findTestObject('Products/TemplateApp/Templates/SharedAssets/CommitMessageUnderHistory'), commitNumber)
WebUI.closeBrowser()

