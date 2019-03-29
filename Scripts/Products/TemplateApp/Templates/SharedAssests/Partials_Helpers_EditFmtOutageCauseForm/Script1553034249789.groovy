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

WebUI.click(findTestObject('Products/TemplateApp/Templates/SharedAssets/PartialsYML/span_PARTIALS'))

WebUI.delay(3)

WebUI.click(findTestObject('Products/TemplateApp/Templates/SharedAssets/PartialsYML/span_HELPERS'))

WebUI.delay(2)

WebUI.click(findTestObject('Products/TemplateApp/Templates/SharedAssets/PartialsYML/FmtOutageCausedNJK'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('Products/TemplateApp/Templates/Common/FormHeaderText'), 'FMTOUTAGECAUSE.NJK')

WebUI.delay(1)

WebUI.click(findTestObject('Products/TemplateApp/Templates/Common/SelectTextareaSpan'))

WebUI.sendKeys(findTestObject('Products/TemplateApp/Templates/Common/Textarea'), Keys.chord(Keys.DELETE))

CustomKeywords.'tools.WebUICustomKeywords.enterUsingJS'(findTestObject('Products/TemplateApp/Templates/Common/Textarea'),
	10)


WebUI.delay(4)

WebUI.setText(findTestObject('Products/TemplateApp/Templates/Common/CommitMessageField'), commitValue)

WebUI.click(findTestObject('Products/TemplateApp/Templates/Common/SaveButton'))

WebUI.click(findTestObject('Products/TemplateApp/Templates/SharedAssets/PartialsYML/FmtOutageCausedNJK'))

WebUI.click(findTestObject('Products/TemplateApp/Templates/Common/SelectHistory'))

WebUI.click(findTestObject('Products/TemplateApp/Templates/Common/ExpandHistory'))

WebUI.delay(4)

WebUI.getText(findTestObject('Products/TemplateApp/Templates/Common/VerifyCommitMessageField'))

WebUI.verifyElementText(findTestObject('Products/TemplateApp/Templates/Common/VerifyCommitMessageField'), commitValue)

WebUI.closeBrowser()

