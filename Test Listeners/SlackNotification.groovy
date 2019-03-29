import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.AfterTestCase
import com.kms.katalon.core.annotation.AfterTestSuite
import com.kms.katalon.core.annotation.BeforeTestSuite
import com.kms.katalon.core.context.TestCaseContext
import com.kms.katalon.core.context.TestSuiteContext
import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS

import internal.GlobalVariable as GlobalVariable

/**
class Slack {

private RequestObject slackMessage = findTestObject('Object Repository/Slack')
private String testCaseStatus = "ERROR"
private String testSuiteStatus = "PASSED"
private void postToSlack() {
if (GlobalVariable.integrateSlack) {
WS.sendRequest(slackMessage)
}
}
 */
	
/**
 * Executes before every test suite starts.
 * @param testSuiteContext: related information of the executed test suite.
 */
 @BeforeTestSuite
 def notifyBeforeTestSuite(TestSuiteContext testSuiteContext) {
 //slackMessage.setHttpBody('{"text": "' + testSuiteContext.getTestSuiteId() + ': Started"}"')
 //slackMessage.setHttpBody('{"attachments": [{"text": "' + testSuiteContext.getTestSuiteId() + ': ' + "Started" + '", "title": "Title"}]}')
 slackMessage.setHttpBody('{"attachments": [{"text": "' + testSuiteContext.getTestSuiteId() + ': ' + "Started" + '", "title": "Test Suite Started"}]}')
  postToSlack()
 }
 

/**
* Executes after every test case ends.
* @param testSuiteContext: related information of the executed test suite.
*/
@AfterTestCase
def notifyAfterTestCase(TestCaseContext testCaseContext) {
testCaseStatus = testCaseContext.getTestCaseStatus()
Map variables = testCaseContext.getTestCaseVariables()

if (!testCaseStatus.equals("PASSED")) { 
//slackMessage.setHttpBody('{"text": "' + testCaseContext.getTestCaseId() + ': ' + testCaseStatus + '"}')
slackMessage.setHttpBody('{"attachments": [{"text": "' + testCaseContext.getTestCaseId() + ': ' + testCaseStatus + '", "color": "#d10007"}]}')

	
		
postToSlack()}
if (!testCaseStatus.equals("PASSED")) testSuiteStatus = "FAILED"
}


/**
* Executes after every test suite ends.
* @param testSuiteContext: related information of the executed test suite.
*/
@AfterTestSuite
def notifyAfterTestSuite(TestSuiteContext testSuiteContext) {

if (testSuiteStatus.equals("PASSED")){
	slackMessage.setHttpBody('{"attachments": [{"text": "' + testSuiteContext.getTestSuiteId() + ': ' + testSuiteStatus + '", "color": "#02d906"}]}')
	postToSlack()
} else {

slackMessage.setHttpBody('{"attachments": [{"text": "' + testSuiteContext.getTestSuiteId() + ': ' + testSuiteStatus + '", "color": "#d10007"}]}')
postToSlack()
}
}
//}