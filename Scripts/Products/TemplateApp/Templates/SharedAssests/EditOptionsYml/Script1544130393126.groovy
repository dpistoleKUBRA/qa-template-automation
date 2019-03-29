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

WebUI.delay(4)

WebUI.click(findTestObject('Products/TemplateApp/SelectEnvironment/downCaret'))

WebUI.click(findTestObject('Products/TemplateApp/SelectEnvironment/SelectEnvironmentDevelop'))

WebUI.delay(2)

WebUI.click(findTestObject('Products/TemplateApp/Templates/SharedAssets/OptionYML/SelectSharedAssests'))

WebUI.click(findTestObject('Products/TemplateApp/Templates/SharedAssets/OptionYML/OptionYMLForm'))

WebUI.clearText(findTestObject('Products/TemplateApp/Templates/SharedAssets/OptionYML/StrictField'))

WebUI.setText(findTestObject('Products/TemplateApp/Templates/SharedAssets/OptionYML/StrictField'), 'Hello')

WebUI.clearText(findTestObject('Products/TemplateApp/Templates/SharedAssets/OptionYML/CollapseWhitespaceField'))

WebUI.setText(findTestObject('Products/TemplateApp/Templates/SharedAssets/OptionYML/CollapseWhitespaceField'), 'Test')

WebUI.clearText(findTestObject('Products/TemplateApp/Templates/SharedAssets/OptionYML/RemoveCommentsField'))

WebUI.setText(findTestObject('Products/TemplateApp/Templates/SharedAssets/OptionYML/RemoveCommentsField'), 'Test')

WebUI.clearText(findTestObject('Products/TemplateApp/Templates/SharedAssets/OptionYML/PreserveMediaQueries'))

WebUI.setText(findTestObject('Products/TemplateApp/Templates/SharedAssets/OptionYML/PreserveMediaQueries'), 'Test')

WebUI.clearText(findTestObject('Products/TemplateApp/Templates/SharedAssets/OptionYML/ApplyArrtibutesTableElements'))

WebUI.setText(findTestObject('Products/TemplateApp/Templates/SharedAssets/OptionYML/ApplyArrtibutesTableElements'), 'Test')

WebUI.clearText(findTestObject('Products/TemplateApp/Templates/SharedAssets/OptionYML/ApplyWithArrtibutesField'))

WebUI.setText(findTestObject('Products/TemplateApp/Templates/SharedAssets/OptionYML/ApplyWithArrtibutesField'), 'Test')

WebUI.clearText(findTestObject('Products/TemplateApp/Templates/SharedAssets/OptionYML/PreserveImportantField'))

WebUI.setText(findTestObject('Products/TemplateApp/Templates/SharedAssets/OptionYML/PreserveImportantField'), 'Test')

WebUI.clearText(findTestObject('Products/TemplateApp/Templates/SharedAssets/OptionYML/PreserveFontFacesField'))

WebUI.setText(findTestObject('Products/TemplateApp/Templates/SharedAssets/OptionYML/PreserveFontFacesField'), 'Test')

WebUI.clearText(findTestObject('Products/TemplateApp/Templates/SharedAssets/OptionYML/ImagesField'))

WebUI.setText(findTestObject('Products/TemplateApp/Templates/SharedAssets/OptionYML/ImagesField'), 'alss')

WebUI.clearText(findTestObject('Products/TemplateApp/Templates/SharedAssets/CommitMessage'))

WebUI.setText(findTestObject('Products/TemplateApp/Templates/SharedAssets/CommitMessage'), 'commit12345')

WebUI.click(findTestObject('Products/TemplateApp/Templates/SharedAssets/SaveButton'))

WebUI.click(findTestObject('Products/TemplateApp/Templates/SharedAssets/OptionYML/OptionYMLForm'))

WebUI.click(findTestObject('Products/TemplateApp/Templates/SharedAssets/SelectHistory'))

WebUI.verifyElementText(findTestObject('Products/TemplateApp/Templates/SharedAssets/HistoryMessage'), 'commit12345')

WebUI.closeBrowser()

