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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://test-nr6s25u59-yustikaprwt.vercel.app/dashboard')

WebUI.click(findTestObject('Object Repository/Add New Patient/Page_HMS-16-Admin/Page_HMS-16-Admin/a_Patient'))

WebUI.click(findTestObject('Object Repository/Add New Patient/Page_HMS-16-Admin/Page_HMS-16-Admin/button_Add Patient'))

WebUI.setText(findTestObject('Object Repository/Add New Patient/Page_HMS-16-Admin/Page_HMS-16-Admin/input__fullName'), fullnamePatient)

WebUI.setText(findTestObject('Object Repository/Add New Patient/Page_HMS-16-Admin/Page_HMS-16-Admin/input__birthPlace'), 
    birthplacePatient)

WebUI.selectOptionByValue(findTestObject('Object Repository/Add New Patient/Page_HMS-16-Admin/Page_HMS-16-Admin/select_MaleFemale'), 
    genderPatient, true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Add New Patient/Page_HMS-16-Admin/Page_HMS-16-Admin/select_ABOAB'), 
    bloodTypePatient, true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Add New Patient/Page_HMS-16-Admin/Page_HMS-16-Admin/select_SingleMaried'), 
    statusPatient, true)

WebUI.click(findTestObject('Add New Patient/Page_HMS-16-Admin/birthday'))

WebUI.setText(findTestObject('Add New Patient/Page_HMS-16-Admin/birthday'), birthdayPatient)

WebUI.setText(findTestObject('Object Repository/Add New Patient/Page_HMS-16-Admin/Page_HMS-16-Admin/input__email'), emailPatient)

WebUI.setText(findTestObject('Object Repository/Add New Patient/Page_HMS-16-Admin/Page_HMS-16-Admin/input__numberMed'), 
    '1233232323223')

WebUI.setText(findTestObject('Object Repository/Add New Patient/Page_HMS-16-Admin/Page_HMS-16-Admin/input__phoneNum'), phoneNumberPatient)

WebUI.setText(findTestObject('Object Repository/Add New Patient/Page_HMS-16-Admin/Page_HMS-16-Admin/input__address'), addressPatient)

WebUI.setText(findTestObject('Object Repository/Add New Patient/Page_HMS-16-Admin/Page_HMS-16-Admin/input__city'), cityPatient)

WebUI.setText(findTestObject('Object Repository/Add New Patient/Page_HMS-16-Admin/Page_HMS-16-Admin/input__fullNameFam'), 
    'Rewina')

WebUI.setText(findTestObject('Object Repository/Add New Patient/Page_HMS-16-Admin/Page_HMS-16-Admin/input__numberPhone'), 
    phoneNumberFamily)

WebUI.setText(findTestObject('Object Repository/Add New Patient/Page_HMS-16-Admin/Page_HMS-16-Admin/input__addressFamily'), 
    addressFamily)

WebUI.setText(findTestObject('Object Repository/Add New Patient/Page_HMS-16-Admin/Page_HMS-16-Admin/input__cityFamily'), 
    cityFamily)

WebUI.setText(findTestObject('Object Repository/Add New Patient/Page_HMS-16-Admin/Page_HMS-16-Admin/input__province'), provinceFamily)

WebUI.setText(findTestObject('Object Repository/Add New Patient/Page_HMS-16-Admin/Page_HMS-16-Admin/input__district'), districtFamily)

WebUI.setText(findTestObject('Object Repository/Add New Patient/Page_HMS-16-Admin/Page_HMS-16-Admin/input__relationship'), 
    relationshipFamily)

WebUI.setText(findTestObject('Object Repository/Add New Patient/Page_HMS-16-Admin/Page_HMS-16-Admin/input__emailFam'), emailFamily)

WebUI.setText(findTestObject('Object Repository/Add New Patient/Page_HMS-16-Admin/Page_HMS-16-Admin/input__provinceFamily'), 
    provinceFamily)

WebUI.setText(findTestObject('Object Repository/Add New Patient/Page_HMS-16-Admin/Page_HMS-16-Admin/input__districtFamily'), 
    districtFamily)

WebUI.click(findTestObject('Object Repository/Add New Patient/Page_HMS-16-Admin/Page_HMS-16-Admin/button_Save'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Add New Patient/Page_HMS-16-Admin/Page_HMS-16-Admin/h5_Patient Detail'))

