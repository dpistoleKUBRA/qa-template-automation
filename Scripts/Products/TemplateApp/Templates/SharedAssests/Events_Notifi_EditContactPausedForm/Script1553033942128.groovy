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
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.driver.DriverFactory as DF
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.By as By
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger

KeywordLogger log = new KeywordLogger()

String commitValue = CustomKeywords.'tools.TestDataGenerator.getRandomWords'(1, 2)

log.logInfo(commitValue)

WebUI.callTestCase(findTestCase('Products/Cerberus/Login-Logout/TemplateLoginNCQATestUtility'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(4)

WebUI.click(findTestObject('Products/TemplateApp/Templates/Common/SelectTemplates'))

WebUI.delay(4)

WebUI.click(findTestObject('Products/TemplateApp/SelectEnvironment/DownCaret'))

WebUI.click(findTestObject('Products/TemplateApp/SelectEnvironment/SelectEnvironmentDevelop'))

WebUI.delay(2)

WebUI.click(findTestObject('Products/TemplateApp/Templates/SharedAssets/SelectShared'))

WebUI.delay(5)

WebUI.click(findTestObject('Products/TemplateApp/Templates/SharedAssets/Events_NotifiYML/span_EVENTS'))

WebUI.delay(3)

WebUI.click(findTestObject('Products/TemplateApp/Templates/SharedAssets/Events_NotifiYML/span_NOTIFI'))

WebUI.delay(2)

WebUI.click(findTestObject('Products/TemplateApp/Templates/SharedAssets/Events_NotifiYML/ContactPausedYML'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('Products/TemplateApp/Templates/Common/FormHeaderText'), 'CONTACT_PAUSED.YML')

WebUI.delay(1)

WebUI.clearText(findTestObject('Products/TemplateApp/Templates/SharedAssets/Events_NotifiYML/EventType'))

WebUI.setText(findTestObject('Products/TemplateApp/Templates/SharedAssets/Events_NotifiYML/EventType'), commitValue)

WebUI.delay(1)

WebUI.clearText(findTestObject('Products/TemplateApp/Templates/SharedAssets/Events_NotifiYML/PausedUntil'))

WebUI.setText(findTestObject('Products/TemplateApp/Templates/SharedAssets/Events_NotifiYML/PausedUntil'), '2019-08-25T16:02:57.800')

WebUI.delay(1)

WebUI.clearText(findTestObject('Products/TemplateApp/Templates/SharedAssets/Events_NotifiYML/SubmittedEventId'))

WebUI.setText(findTestObject('Products/TemplateApp/Templates/SharedAssets/Events_NotifiYML/SubmittedEventId'), '1333-555')

/*WebUI.delay(3)

WebUI.clearText(findTestObject('Products/TemplateApp/Templates/SharedAssets/Events_NotifiYML/SubscriptionsArticleIds'))

WebUI.setText(findTestObject('Products/TemplateApp/Templates/SharedAssets/Events_NotifiYML/SubscriptionsArticleIds'), '30')*/
WebUI.delay(1)

WebUI.clearText(findTestObject('Products/TemplateApp/Templates/SharedAssets/Events_NotifiYML/SubscriptionsContactEnabled'))

WebUI.setText(findTestObject('Products/TemplateApp/Templates/SharedAssets/Events_NotifiYML/SubscriptionsContactEnabled'), 
    'true')

WebUI.delay(1)

WebUI.clearText(findTestObject('Products/TemplateApp/Templates/SharedAssets/Events_NotifiYML/SubscriptionsContactId'))

WebUI.setText(findTestObject('Products/TemplateApp/Templates/SharedAssets/Events_NotifiYML/SubscriptionsContactId'), '44')

WebUI.delay(1)

WebUI.clearText(findTestObject('Products/TemplateApp/Templates/SharedAssets/Events_NotifiYML/SubscriptionsContactValid'))

WebUI.setText(findTestObject('Products/TemplateApp/Templates/SharedAssets/Events_NotifiYML/SubscriptionsContactValid'), 
    'true')

/*WebUI.delay(3)

WebUI.clearText(findTestObject('Products/TemplateApp/Templates/SharedAssets/Events_NotifiYML/SubscriptionsDNDs'))

WebUI.setText(findTestObject('Products/TemplateApp/Templates/SharedAssets/Events_NotifiYML/SubscriptionsDNDs'), 'bcd')*/

WebUI.delay(1)

WebUI.clearText(findTestObject('Products/TemplateApp/Templates/SharedAssets/Events_NotifiYML/SubscriptionIgnoreDNDForOutage'))

WebUI.setText(findTestObject('Products/TemplateApp/Templates/SharedAssets/Events_NotifiYML/SubscriptionIgnoreDNDForOutage'), 'false')

WebUI.delay(1)

WebUI.clearText(findTestObject('Products/TemplateApp/Templates/SharedAssets/Events_NotifiYML/ArticleNumber'))

WebUI.setText(findTestObject('Products/TemplateApp/Templates/SharedAssets/Events_NotifiYML/ArticleNumber'), '3333333')

WebUI.delay(1)

WebUI.clearText(findTestObject('Products/TemplateApp/Templates/SharedAssets/Events_NotifiYML/ArticleQualifier'))

WebUI.setText(findTestObject('Products/TemplateApp/Templates/SharedAssets/Events_NotifiYML/ArticleQualifier'), 'qualify')

WebUI.delay(1)

WebUI.clearText(findTestObject('Products/TemplateApp/Templates/SharedAssets/Events_NotifiYML/ArticleType'))

WebUI.setText(findTestObject('Products/TemplateApp/Templates/SharedAssets/Events_NotifiYML/ArticleType'), 'Account')

WebUI.delay(1)

WebUI.clearText(findTestObject('Products/TemplateApp/Templates/SharedAssets/Events_NotifiYML/ContactContactId'))

WebUI.setText(findTestObject('Products/TemplateApp/Templates/SharedAssets/Events_NotifiYML/ContactContactId'), '43')

WebUI.delay(1)

WebUI.clearText(findTestObject('Products/TemplateApp/Templates/SharedAssets/Events_NotifiYML/ContactLocale'))

WebUI.setText(findTestObject('Products/TemplateApp/Templates/SharedAssets/Events_NotifiYML/ContactLocale'), 'en_US')

WebUI.delay(1)

WebUI.clearText(findTestObject('Products/TemplateApp/Templates/SharedAssets/Events_NotifiYML/ContactChannel'))

WebUI.setText(findTestObject('Products/TemplateApp/Templates/SharedAssets/Events_NotifiYML/ContactChannel'), 'E-MAIL')

WebUI.delay(1)

WebUI.clearText(findTestObject('Products/TemplateApp/Templates/SharedAssets/Events_NotifiYML/ContactContact'))

WebUI.setText(findTestObject('Products/TemplateApp/Templates/SharedAssets/Events_NotifiYML/ContactContact'), 'Testexample@abc.com')

WebUI.delay(1)

WebUI.clearText(findTestObject('Products/TemplateApp/Templates/SharedAssets/Events_NotifiYML/TargetEventType'))

WebUI.setText(findTestObject('Products/TemplateApp/Templates/SharedAssets/Events_NotifiYML/TargetEventType'), 'Contact_Paused')

WebUI.delay(1)

WebUI.clearText(findTestObject('Products/TemplateApp/Templates/SharedAssets/Events_NotifiYML/TemplateName'))

WebUI.setText(findTestObject('Products/TemplateApp/Templates/SharedAssets/Events_NotifiYML/TemplateName'), 'Contact_Paused')

WebUI.delay(1)

WebUI.setText(findTestObject('Products/TemplateApp/Templates/SharedAssets/CommitMessage'), commitValue)

WebUI.click(findTestObject('Products/TemplateApp/Templates/SharedAssets/SaveButton'))

WebUI.delay(2)

WebUI.click(findTestObject('Products/TemplateApp/Templates/SharedAssets/Events_NotifiYML/ContactPausedYML'))

WebUI.delay(2)

WebUI.click(findTestObject('Products/TemplateApp/Templates/SharedAssets/SelectHistory'))

WebUI.delay(4)

WebUI.getText(findTestObject('Products/TemplateApp/Templates/SharedAssets/CommitMessageUnderHistory'))

WebUI.verifyElementText(findTestObject('Products/TemplateApp/Templates/SharedAssets/CommitMessageUnderHistory'), commitValue)
WebUI.closeBrowser()

