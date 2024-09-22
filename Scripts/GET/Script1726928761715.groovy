import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

def getResponse = WS.sendRequest(findTestObject('GET'))


WS.verifyResponseStatusCode(getResponse, 200)

def slurper = new groovy.json.JsonSlurper()

def result = slurper.parseText(getResponse.getResponseBodyContent())

def firstname = result.firstname

assert firstname instanceof String

def lastname = result.lastname

assert lastname instanceof String

def totalprice = result.totalprice

assert totalprice instanceof Integer

def depositpaid = result.depositpaid

assert depositpaid instanceof Boolean

//def bookingDate = new BookingDate(checkin: "2018-01-01", checkout: "2019-01-01")
def bookingdates = result.bookingdates

assert bookingdates instanceof Object

def checkin = result.bookingdates.checkin

assert checkin instanceof String

def checkout = result.bookingdates.checkout

assert checkout instanceof String

def additionalneeds = result.additionalneeds

assert additionalneeds instanceof String

//"firstname":"John",
//"lastname":"Smith",
//"totalprice":111,
//"depositpaid":true,
//"bookingdates":{
//  "checkin":"2018-01-01",
//  "checkout":"2019-01-01"
//},
//"additionalneeds":"Breakfast"
//}
println(getResponse)



