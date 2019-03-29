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

WebUI.comment('Open browser to User Management App. and Create User')

WebUI.callTestCase(findTestCase('Products/Cerberus/Login-Logout/UserMgmtLoginNC'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(GlobalVariable.G_ShortTimeout)

WebUI.comment('Create User')

WebUiBuiltInKeywords.verifyTextPresent('User Management Dashboard', false)

WebUI.waitForElementClickable(findTestObject('Products/UserManagement/ManageUsers'), 15)

WebUI.click(findTestObject('Products/UserManagement/ManageUsers'))

WebUI.verifyTextPresent('Select a username below to edit contact information', false)

WebUI.waitForElementClickable(findTestObject('Products/UserManagement/01-qa-user-99DeleteButton'), 
    15)

WebUI.click(findTestObject('Products/UserManagement/01-qa-user-99DeleteButton'))

WebUI.verifyTextPresent('01qauser99@kubra.com', false)

WebUI.click(findTestObject('Products/UserManagement/ConfirmDeleteButton'))

WebUI.waitForElementClickable(findTestObject('Products/UserManagement/01-qa-user-99DeleteButton'), 
    15)
WebUI.verifyTextPresent('Manage Users', false)

WebUI.verifyTextNotPresent('01qauser99@kubra.com', false)

WebUI.closeBrowser()

WebUI.delay(4)

