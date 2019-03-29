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
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger

KeywordLogger log = new KeywordLogger()

String randomValue = CustomKeywords.'tools.TestDataGenerator.getRandomWords'(1, 2)

log.logInfo(randomValue)

WebUI.callTestCase(findTestCase('Products/TemplateApp/Templates/SMS/EditPostingHelpForm'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(4)

WebUI.click(findTestObject('Products/TemplateApp/Submit/SelectSubmit'))

WebUI.delay(2)

WebUI.click(findTestObject('Products/TemplateApp/Submit/CreatePullRequest'))

WebUI.click(findTestObject('Products/TemplateApp/SelectEnvironment/DownCaret'))

WebUI.click(findTestObject('Products/TemplateApp/SelectEnvironment/SelectEnvironmentDevelop'))

WebUI.delay(2)

WebUI.setText(findTestObject('Products/TemplateApp/Submit/TitleField'), randomValue)

WebUI.setText(findTestObject('Products/TemplateApp/Submit/BodyField'), randomValue)

WebUI.click(findTestObject('Products/TemplateApp/Submit/SelectDestinationDropDown'))

WebUI.click(findTestObject('Products/TemplateApp/Submit/SelectDestination'))

WebUI.delay(2)

WebUI.click(findTestObject('Products/TemplateApp/Submit/SaveButton'))

WebUI.click(findTestObject('Products/TemplateApp/Submit/button_OK'))

WebUI.delay(3)

WebUI.click(findTestObject('Products/TemplateApp/Submit/button_OK'))

WebUI.delay(3)

WebUI.click(findTestObject('Products/TemplateApp/Submit/button_OK'))

WebUI.delay(3)

WebUI.getText(findTestObject('Products/TemplateApp/Submit/PRTitle'))

randomValue = randomValue.toUpperCase()

//WebUI.verifyMatch(Title, randomValue, false)
WebUI.verifyElementText(findTestObject('Products/TemplateApp/Submit/PRTitle'), randomValue)

WebUI.delay(3)

WebUI.getText(findTestObject('Products/TemplateApp/Submit/PRStatus'))

WebUI.delay(3)

WebUI.click(findTestObject('Products/TemplateApp/Submit/MergeButton'))

WebUI.delay(3)

WebUI.click(findTestObject('Products/TemplateApp/Submit/button_OK'))

WebUI.delay(3)

WebUI.getText(findTestObject('Products/TemplateApp/Submit/PRStatus'))

WebUI.verifyElementText(findTestObject('Products/TemplateApp/Submit/PRStatus'), 'CLOSED')

WebUI.closeBrowser()

