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

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/a_Patient'))

WebUI.click(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/EditIcon'))

//WebUI.delay(5)
//WebUI.sendKeys(findTestObject('EditPatient/Page_HMS-16-Admin/input__fullName'), Keys.chord(Keys.CONTROL, 'a'))

//Press Ctrl+A on the Edit element

//WebUI.sendKeys(findTestObject('Add SP with valid data/Page_/AddSp_CP_input Email'), Keys.chord(Keys.BACK_SPACE))
//
//WebUI.setText(findTestObject('Add SP with valid data/Page_/AddSp_CP_input Email'), CPemail)
WebUI.sendKeys(findTestObject('EditPatient/Page_HMS-16-Admin/input__fullName'), Keys.chord(Keys.CONTROL, 'a'))
WebUI.setText(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/input__fullName'), fullnamePatient)
WebUI.click(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/button_Save'))

WebUI.sendKeys(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/input__birthPlace'), Keys.chord(Keys.CONTROL, 'a'))
WebUI.setText(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/input__birthPlace'), birthplacePatient)
WebUI.click(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/button_Save'))

WebUI.selectOptionByValue(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/select_MaleFemale'), genderPatient, 
    true)


WebUI.selectOptionByValue(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/select_ABOAB'), bloodTypePatient, 
    true)

WebUI.sendKeys(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/input__email'), Keys.chord(Keys.CONTROL, 'a'))
WebUI.setText(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/input__email'), emailPatient)
WebUI.click(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/button_Save'))

WebUI.click(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/input__numberMed'))

WebUI.selectOptionByValue(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/select_SingleMaried'), statusPatient, 
    true)

WebUI.sendKeys(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/input__phoneNum'), Keys.chord(Keys.CONTROL, 'a'))
WebUI.setText(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/input__phoneNum'), phoneNumberPatient)
WebUI.click(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/button_Save'))

WebUI.sendKeys(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/input__address'), Keys.chord(Keys.CONTROL, 'a'))
WebUI.setText(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/input__address'), addressPatient)
WebUI.click(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/button_Save'))

WebUI.sendKeys(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/input__province'), Keys.chord(Keys.CONTROL, 'a'))
WebUI.setText(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/input__province'), provincePatient)
WebUI.click(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/button_Save'))

WebUI.sendKeys(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/input__city'), Keys.chord(Keys.CONTROL, 'a'))
WebUI.setText(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/input__city'), cityPatient)
WebUI.click(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/button_Save'))

WebUI.sendKeys(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/input__district'), Keys.chord(Keys.CONTROL, 'a'))
WebUI.setText(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/input__district'), districtPatient)
WebUI.click(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/button_Save'))

WebUI.sendKeys(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/input__fullNameFam'), Keys.chord(Keys.CONTROL, 'a'))
WebUI.setText(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/input__fullNameFam'), fullnameFamily)
WebUI.click(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/button_Save'))

WebUI.sendKeys(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/input__relationship'), Keys.chord(Keys.CONTROL, 'a'))
WebUI.setText(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/input__relationship'), relationshipFamily)
WebUI.click(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/button_Save'))

WebUI.sendKeys(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/input__numberPhone'), Keys.chord(Keys.CONTROL, 'a'))
WebUI.setText(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/input__numberPhone'), phoneNumberFamily)
WebUI.click(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/button_Save'))

WebUI.sendKeys(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/input__emailFam'), Keys.chord(Keys.CONTROL, 'a'))
WebUI.setText(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/input__emailFam'), emailFamily)
WebUI.click(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/button_Save'))

WebUI.sendKeys(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/input__addressFamily'), Keys.chord(Keys.CONTROL, 'a'))
WebUI.setText(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/input__addressFamily'), addressFamily)
WebUI.click(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/button_Save'))

WebUI.sendKeys(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/input__provinceFamily'), Keys.chord(Keys.CONTROL, 'a'))
WebUI.setText(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/input__provinceFamily'), provinceFamily)
WebUI.click(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/button_Save'))

WebUI.sendKeys(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/input__cityFamily'), Keys.chord(Keys.CONTROL, 'a'))
WebUI.setText(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/input__cityFamily'), cityFamily)
WebUI.click(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/button_Save'))

WebUI.sendKeys(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/input__districtFamily'), Keys.chord(Keys.CONTROL, 'a'))
WebUI.setText(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/input__districtFamily'), districtFamily)
WebUI.click(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/button_Save'))


//WebUI.click(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/button_Yes'))

