
/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */

import java.lang.String

import com.kms.katalon.core.testobject.TestObject

import java.lang.Integer

import org.openqa.selenium.By

import org.openqa.selenium.WebElement

import java.util.List


def static "tools.pdfReader.ReadPDF"(
    	String PDFURL	) {
    (new tools.pdfReader()).ReadPDF(
        	PDFURL)
}

def static "tools.DatabaseUtils.connectDB"(
    	String url	
     , 	String port	
     , 	String dbname	
     , 	String username	
     , 	String password	) {
    (new tools.DatabaseUtils()).connectDB(
        	url
         , 	port
         , 	dbname
         , 	username
         , 	password)
}

def static "tools.DatabaseUtils.executeQuery"(
    	String queryString	) {
    (new tools.DatabaseUtils()).executeQuery(
        	queryString)
}

def static "tools.DatabaseUtils.closeDatabaseConnection"() {
    (new tools.DatabaseUtils()).closeDatabaseConnection()
}

def static "tools.DatabaseUtils.execute"(
    	String queryString	) {
    (new tools.DatabaseUtils()).execute(
        	queryString)
}

def static "tools.WebApiCustomKeywords.createBasicAuthProperty"(
    	String usernameAdmin	
     , 	String password	) {
    (new tools.WebApiCustomKeywords()).createBasicAuthProperty(
        	usernameAdmin
         , 	password)
}

def static "tools.WebApiCustomKeywords.updateHttpBody"(
    	String password	
     , 	String emailAddress	
     , 	String displayName	
     , 	String notification	) {
    (new tools.WebApiCustomKeywords()).updateHttpBody(
        	password
         , 	emailAddress
         , 	displayName
         , 	notification)
}

def static "tools.WebApiCustomKeywords.newHttpBody"(
    	String username	
     , 	String password	
     , 	String emailAddress	
     , 	String displayName	
     , 	String notification	) {
    (new tools.WebApiCustomKeywords()).newHttpBody(
        	username
         , 	password
         , 	emailAddress
         , 	displayName
         , 	notification)
}

def static "tools.WebApiCustomKeywords.verifyStatusCode"(
    	TestObject request	
     , 	int expectedStatusCode	) {
    (new tools.WebApiCustomKeywords()).verifyStatusCode(
        	request
         , 	expectedStatusCode)
}

def static "tools.WebApiCustomKeywords.addBasicAuthorizationProperty"(
    	TestObject request	
     , 	String username	
     , 	String password	) {
    (new tools.WebApiCustomKeywords()).addBasicAuthorizationProperty(
        	request
         , 	username
         , 	password)
}

def static "tools.TestDataGenerator.getRandomWords"(
    	int a	
     , 	int b	) {
    (new tools.TestDataGenerator()).getRandomWords(
        	a
         , 	b)
}

def static "tools.TestDataGenerator.getRandomParagraphs"(
    	int a	
     , 	int b	) {
    (new tools.TestDataGenerator()).getRandomParagraphs(
        	a
         , 	b)
}

def static "tools.TestDataGenerator.getRandomName"(
    	int a	
     , 	int b	) {
    (new tools.TestDataGenerator()).getRandomName(
        	a
         , 	b)
}

def static "tools.TestDataGenerator.getRandomFemaleName"() {
    (new tools.TestDataGenerator()).getRandomFemaleName()
}

def static "tools.TestDataGenerator.getRandomMaleName"() {
    (new tools.TestDataGenerator()).getRandomMaleName()
}

def static "tools.TestDataGenerator.getRandomFirstName"() {
    (new tools.TestDataGenerator()).getRandomFirstName()
}

def static "tools.TestDataGenerator.getRandomLastName"() {
    (new tools.TestDataGenerator()).getRandomLastName()
}

def static "tools.TestDataGenerator.getRandomCity"() {
    (new tools.TestDataGenerator()).getRandomCity()
}

def static "tools.TestDataGenerator.getRandomStateFull"() {
    (new tools.TestDataGenerator()).getRandomStateFull()
}

def static "tools.TestDataGenerator.getRandomStateAbbr"() {
    (new tools.TestDataGenerator()).getRandomStateAbbr()
}

def static "tools.TestDataGenerator.getRandomCountry"() {
    (new tools.TestDataGenerator()).getRandomCountry()
}

def static "tools.TestDataGenerator.getRandomZipCode"() {
    (new tools.TestDataGenerator()).getRandomZipCode()
}

def static "tools.TestDataGenerator.getRandomPhone"() {
    (new tools.TestDataGenerator()).getRandomPhone()
}

def static "tools.TestDataGenerator.getRandomHeading"(
    	int numberofWords	) {
    (new tools.TestDataGenerator()).getRandomHeading(
        	numberofWords)
}

def static "tools.TestDataGenerator.getRandomHeading_two"(
    	int Wordsfrom	
     , 	int wordstwo	) {
    (new tools.TestDataGenerator()).getRandomHeading_two(
        	Wordsfrom
         , 	wordstwo)
}

def static "tools.TestDataGenerator.getRandomEmail"() {
    (new tools.TestDataGenerator()).getRandomEmail()
}

def static "tools.TestDataGenerator.set_RandomNumber"(
    	long len	) {
    (new tools.TestDataGenerator()).set_RandomNumber(
        	len)
}

def static "tools.TestDataGenerator.set_RandomNumberWithText"(
    	int length	) {
    (new tools.TestDataGenerator()).set_RandomNumberWithText(
        	length)
}

def static "tools.TestDataGenerator.getTodaysDate"() {
    (new tools.TestDataGenerator()).getTodaysDate()
}

def static "tools.WebUICustomKeywords.fileUploader"(
    	TestObject to	
     , 	String filePath	) {
    (new tools.WebUICustomKeywords()).fileUploader(
        	to
         , 	filePath)
}

def static "tools.WebUICustomKeywords.clickLocation"(
    	Integer xCord	
     , 	Integer yCord	) {
    (new tools.WebUICustomKeywords()).clickLocation(
        	xCord
         , 	yCord)
}

def static "tools.WebUICustomKeywords.clickObject"(
    	TestObject to1	
     , 	Integer xCord	
     , 	Integer yCord	) {
    (new tools.WebUICustomKeywords()).clickObject(
        	to1
         , 	xCord
         , 	yCord)
}

def static "tools.WebUICustomKeywords.highlightElement"(
    	TestObject to	) {
    (new tools.WebUICustomKeywords()).highlightElement(
        	to)
}

def static "tools.WebUICustomKeywords.clickUsingJS"(
    	TestObject to	
     , 	int timeout	) {
    (new tools.WebUICustomKeywords()).clickUsingJS(
        	to
         , 	timeout)
}

def static "tools.WebUICustomKeywords.enterUsingJS"(
    	TestObject to	
     , 	int timeout	) {
    (new tools.WebUICustomKeywords()).enterUsingJS(
        	to
         , 	timeout)
}

def static "tools.WebUICustomKeywords.ClearTextField"(
    	TestObject to	) {
    (new tools.WebUICustomKeywords()).ClearTextField(
        	to)
}

def static "tools.WebUICustomKeywords.zoomBrowser"(
    	int zoomLevel	) {
    (new tools.WebUICustomKeywords()).zoomBrowser(
        	zoomLevel)
}

def static "tools.WebUICustomKeywords.compareImage"(
    	String imgOriginal	
     , 	String imgToCompareWithOriginal	
     , 	String imgOutputDifferences	) {
    (new tools.WebUICustomKeywords()).compareImage(
        	imgOriginal
         , 	imgToCompareWithOriginal
         , 	imgOutputDifferences)
}

def static "tools.WebUICustomKeywords.compareImageNotEqual"(
    	String imgOriginal	
     , 	String imgToCompareWithOriginal	
     , 	String imgOutputDifferences	) {
    (new tools.WebUICustomKeywords()).compareImageNotEqual(
        	imgOriginal
         , 	imgToCompareWithOriginal
         , 	imgOutputDifferences)
}

def static "tools.WebUICustomKeywords.waitForElementScrollandClick"(
    	TestObject to	) {
    (new tools.WebUICustomKeywords()).waitForElementScrollandClick(
        	to)
}

def static "tools.WebUICustomKeywords.resizeBrowser"(
    	Integer xCord	
     , 	Integer yCord	) {
    (new tools.WebUICustomKeywords()).resizeBrowser(
        	xCord
         , 	yCord)
}

def static "tools.WebUICustomKeywords.setBrowser"(
    	Integer xCord	
     , 	Integer yCord	) {
    (new tools.WebUICustomKeywords()).setBrowser(
        	xCord
         , 	yCord)
}

def static "tools.WebUICustomKeywords.Sleep"(
    	int time	) {
    (new tools.WebUICustomKeywords()).Sleep(
        	time)
}

def static "tools.WebUICustomKeywords.verifyPartialElementText"(
    	TestObject to	
     , 	String text	) {
    (new tools.WebUICustomKeywords()).verifyPartialElementText(
        	to
         , 	text)
}

def static "tools.WebUICustomKeywords.isElementPresent"(
    	TestObject to	
     , 	int timeout	) {
    (new tools.WebUICustomKeywords()).isElementPresent(
        	to
         , 	timeout)
}

def static "tools.WebUICustomKeywords.byLocator"(
    	By locator	) {
    (new tools.WebUICustomKeywords()).byLocator(
        	locator)
}

def static "tools.WebUICustomKeywords.getEmail"(
    	String suffix	
     , 	String prefix	) {
    (new tools.WebUICustomKeywords()).getEmail(
        	suffix
         , 	prefix)
}

def static "tools.WebUICustomKeywords.generateNumber"(
    	String a	) {
    (new tools.WebUICustomKeywords()).generateNumber(
        	a)
}

def static "tools.WebUICustomKeywords.killProcess"() {
    (new tools.WebUICustomKeywords()).killProcess()
}

def static "tools.WebUICustomKeywords.getHtmlTableRows"(
    	TestObject table	
     , 	String outerTagName	) {
    (new tools.WebUICustomKeywords()).getHtmlTableRows(
        	table
         , 	outerTagName)
}

def static "tools.WebUICustomKeywords.getHtmlTableColumns"(
    	WebElement row	
     , 	String tagName	) {
    (new tools.WebUICustomKeywords()).getHtmlTableColumns(
        	row
         , 	tagName)
}

def static "tools.WebUICustomKeywords.getCellText"(
    	TestObject table	
     , 	int rowIndex	
     , 	int columnIndex	) {
    (new tools.WebUICustomKeywords()).getCellText(
        	table
         , 	rowIndex
         , 	columnIndex)
}

def static "tools.WebUICustomKeywords.verifyOptionsInDropdownInAphabeticalOrder"(
    	Object element	) {
    (new tools.WebUICustomKeywords()).verifyOptionsInDropdownInAphabeticalOrder(
        	element)
}

def static "tools.WebUICustomKeywords.VerifyExpectedAndActual"(
    	TestObject objectto	
     , 	java.util.List<String> listOfOptions	) {
    (new tools.WebUICustomKeywords()).VerifyExpectedAndActual(
        	objectto
         , 	listOfOptions)
}

def static "tools.DragAndDropHelper.dragAndDrop"(
    	TestObject sourceObject	
     , 	TestObject destinationObject	) {
    (new tools.DragAndDropHelper()).dragAndDrop(
        	sourceObject
         , 	destinationObject)
}
