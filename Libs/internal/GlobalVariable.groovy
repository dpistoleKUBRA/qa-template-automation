package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p>Profile default : Dev</p>
     */
    public static Object G_DevSiteURL
     
    /**
     * <p>Profile default : QA</p>
     */
    public static Object G_QASiteURL
     
    /**
     * <p>Profile default : Test</p>
     */
    public static Object G_TestSiteURL
     
    /**
     * <p>Profile default : Local</p>
     */
    public static Object G_LocalSiteURL
     
    /**
     * <p>Profile default : Default
Profile Dev : Dev URL
Profile Prod : QA URL
Profile QA : QA URL</p>
     */
    public static Object G_DefaultSiteURL
     
    /**
     * <p></p>
     */
    public static Object G_ShortTimeout
     
    /**
     * <p></p>
     */
    public static Object G_MediumTimeout
     
    /**
     * <p></p>
     */
    public static Object G_LongTimeout
     
    /**
     * <p>Profile default : Map - English
Profile Prod : Map - 01-TestView - English
Profile QA : Map - 01-TestView - English</p>
     */
    public static Object G_QAMap_EN
     
    /**
     * <p>Profile default : Map-Spanish
Profile Prod : Map - 01-TestView - Spanish
Profile QA : Map - 01-TestView - Spanish</p>
     */
    public static Object G_QAMap_ES
     
    /**
     * <p></p>
     */
    public static Object ZipReportID
     
    /**
     * <p></p>
     */
    public static Object CountyReportID
     
    /**
     * <p></p>
     */
    public static Object AreaViewID
     
    /**
     * <p></p>
     */
    public static Object G_LoginBrowserDefault
     
    /**
     * <p></p>
     */
    public static Object G_LoginBrowserIE
     
    /**
     * <p></p>
     */
    public static Object G_LoginBrowserChromeFF
     
    /**
     * <p></p>
     */
    public static Object G_ShortDelayTime
     
    /**
     * <p></p>
     */
    public static Object G_MediumDelayTime
     
    /**
     * <p></p>
     */
    public static Object G_LongDelayTime
     
    /**
     * <p>Profile default : No Check Zoom for Clustering Map tests
Profile Prod : 02-NoCheckZoom for Clustering Map tests
Profile QA : 02-NoCheckZoom for Clustering Map tests</p>
     */
    public static Object G_QAClusterMap_EN
     
    /**
     * <p>Profile default : Prod</p>
     */
    public static Object G_ProdTenant
     
    /**
     * <p>Profile Prod : 02-NoCheckZoom
Profile QA : 02-NoCheckZoom</p>
     */
    public static Object AreaViewIDNoZoom
     
    /**
     * <p></p>
     */
    public static Object integrateSlack
     
    /**
     * <p>Profile default : Dev - Data Feeds App</p>
     */
    public static Object G_DevDataFeedApp
     
    /**
     * <p></p>
     */
    public static Object G_QADataFeedApp
     
    /**
     * <p>Profile Dev : QA Test Utility Company
Profile Prod : QA Test Utility Company
Profile QA : QA Test Utility Company</p>
     */
    public static Object G_Tenant_QATestUtilityCo
     
    /**
     * <p>Profile Dev : ABC Utility Company
Profile Prod : ABC Utility Company
Profile QA : ABC Utility Company</p>
     */
    public static Object G_Tenant_ABCUtilityCo
     
    /**
     * <p>Profile Dev : Test Environment</p>
     */
    public static Object SelectEnvironment
     
    /**
     * <p>Profile Prod : Dev - Data Feeds App
Profile QA : Dev - Data Feeds App</p>
     */
    public static Object G_DefaultDataFeedAppURL
     
    /**
     * <p>Profile QA : React Map - English</p>
     */
    public static Object G_QAReactMap_EN
     
    /**
     * <p>Profile QA : React Map - Spanish</p>
     */
    public static Object G_QAReactMap_ES
     
    /**
     * <p></p>
     */
    public static Object G_QAReactClusterMap_EN
     
    /**
     * <p></p>
     */
    public static Object DesktopResX
     
    /**
     * <p></p>
     */
    public static Object DesktopResY
     
    /**
     * <p></p>
     */
    public static Object MobileResX
     
    /**
     * <p></p>
     */
    public static Object MobileResY
     
    /**
     * <p></p>
     */
    public static Object G_QAReactClusterMap_ES
     
    /**
     * <p></p>
     */
    public static Object DN_FeedName
     
    /**
     * <p></p>
     */
    public static Object OUT_FeedName
     
    /**
     * <p></p>
     */
    public static Object AM_FeedName
     
    /**
     * <p></p>
     */
    public static Object Custom_FeedName
     
    /**
     * <p></p>
     */
    public static Object API_Custom_FeedId
     
    /**
     * <p></p>
     */
    public static Object API_Custom_FeedName
     
    /**
     * <p></p>
     */
    public static Object API_Outage_FeedId
     
    /**
     * <p></p>
     */
    public static Object API_Outage_FeedName
     
    /**
     * <p></p>
     */
    public static Object API_DN_FeedId
     
    /**
     * <p></p>
     */
    public static Object API_DN_FeedName
     
    /**
     * <p></p>
     */
    public static Object API_AM_FeedId
     
    /**
     * <p></p>
     */
    public static Object API_AM_FeedName
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += RunConfiguration.getOverridingParameters()
    
            G_DevSiteURL = selectedVariables['G_DevSiteURL']
            G_QASiteURL = selectedVariables['G_QASiteURL']
            G_TestSiteURL = selectedVariables['G_TestSiteURL']
            G_LocalSiteURL = selectedVariables['G_LocalSiteURL']
            G_DefaultSiteURL = selectedVariables['G_DefaultSiteURL']
            G_ShortTimeout = selectedVariables['G_ShortTimeout']
            G_MediumTimeout = selectedVariables['G_MediumTimeout']
            G_LongTimeout = selectedVariables['G_LongTimeout']
            G_QAMap_EN = selectedVariables['G_QAMap_EN']
            G_QAMap_ES = selectedVariables['G_QAMap_ES']
            ZipReportID = selectedVariables['ZipReportID']
            CountyReportID = selectedVariables['CountyReportID']
            AreaViewID = selectedVariables['AreaViewID']
            G_LoginBrowserDefault = selectedVariables['G_LoginBrowserDefault']
            G_LoginBrowserIE = selectedVariables['G_LoginBrowserIE']
            G_LoginBrowserChromeFF = selectedVariables['G_LoginBrowserChromeFF']
            G_ShortDelayTime = selectedVariables['G_ShortDelayTime']
            G_MediumDelayTime = selectedVariables['G_MediumDelayTime']
            G_LongDelayTime = selectedVariables['G_LongDelayTime']
            G_QAClusterMap_EN = selectedVariables['G_QAClusterMap_EN']
            G_ProdTenant = selectedVariables['G_ProdTenant']
            AreaViewIDNoZoom = selectedVariables['AreaViewIDNoZoom']
            integrateSlack = selectedVariables['integrateSlack']
            G_DevDataFeedApp = selectedVariables['G_DevDataFeedApp']
            G_QADataFeedApp = selectedVariables['G_QADataFeedApp']
            G_Tenant_QATestUtilityCo = selectedVariables['G_Tenant_QATestUtilityCo']
            G_Tenant_ABCUtilityCo = selectedVariables['G_Tenant_ABCUtilityCo']
            SelectEnvironment = selectedVariables['SelectEnvironment']
            G_DefaultDataFeedAppURL = selectedVariables['G_DefaultDataFeedAppURL']
            G_QAReactMap_EN = selectedVariables['G_QAReactMap_EN']
            G_QAReactMap_ES = selectedVariables['G_QAReactMap_ES']
            G_QAReactClusterMap_EN = selectedVariables['G_QAReactClusterMap_EN']
            DesktopResX = selectedVariables['DesktopResX']
            DesktopResY = selectedVariables['DesktopResY']
            MobileResX = selectedVariables['MobileResX']
            MobileResY = selectedVariables['MobileResY']
            G_QAReactClusterMap_ES = selectedVariables['G_QAReactClusterMap_ES']
            DN_FeedName = selectedVariables['DN_FeedName']
            OUT_FeedName = selectedVariables['OUT_FeedName']
            AM_FeedName = selectedVariables['AM_FeedName']
            Custom_FeedName = selectedVariables['Custom_FeedName']
            API_Custom_FeedId = selectedVariables['API_Custom_FeedId']
            API_Custom_FeedName = selectedVariables['API_Custom_FeedName']
            API_Outage_FeedId = selectedVariables['API_Outage_FeedId']
            API_Outage_FeedName = selectedVariables['API_Outage_FeedName']
            API_DN_FeedId = selectedVariables['API_DN_FeedId']
            API_DN_FeedName = selectedVariables['API_DN_FeedName']
            API_AM_FeedId = selectedVariables['API_AM_FeedId']
            API_AM_FeedName = selectedVariables['API_AM_FeedName']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
