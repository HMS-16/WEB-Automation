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

valuePostcode = WebUI.getText(findTestObject('Add SP with valid data/Page_/AddSP_inputPostalcode'))

valueAddress = WebUI.getText(findTestObject('Add SP with valid data/Page_/input_Address'))

if (valuePostcode == '') {
    WebUI.setText(findTestObject('Add SP with valid data/Page_/AddSP_inputPostalcode'), PostCode)
}
//else {
//    WebUI.sendKeys(findTestObject('Add SP with valid data/Page_/AddSP_inputPostalcode'), Keys.chord(Keys.CONTROL, 'a'))
//
//    WebUI.sendKeys(findTestObject('Add SP with valid data/Page_/AddSP_inputPostalcode'), Keys.chord(Keys.BACK_SPACE))
//}

if (valueAddress == '') {
    WebUI.setText(findTestObject('Add SP with valid data/Page_/input_Address'), Address)
} 
//else {
//    WebUI.sendKeys(findTestObject('Add SP with valid data/Page_/input_Address'), Keys.chord(Keys.CONTROL, 'a'))
//
//    WebUI.sendKeys(findTestObject('Add SP with valid data/Page_/input_Address'), Keys.chord(Keys.BACK_SPACE))
//}

WebUI.delay(5)