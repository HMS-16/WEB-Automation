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

WebUI.click(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/a_Patient'))

WebUI.click(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/EditIcon'))

WebUI.setText(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/input__fullName'), 'aaa')

WebUI.setText(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/input__birthPlace'), 'aaa')

WebUI.selectOptionByValue(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/select_MaleFemale'), '2', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/select_ABOAB'), '2', true)

WebUI.setText(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/input__email'), 'ababb@gmail.com')

WebUI.click(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/input__numberMed'))

WebUI.selectOptionByValue(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/select_SingleMaried'), '2', true)

WebUI.setText(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/input__phoneNum'), '08283827312321')

WebUI.setText(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/input__address'), 'address')

WebUI.doubleClick(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/input__province'))

WebUI.setText(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/input__address'), 'addressp')

WebUI.setText(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/input__province'), 'provinceP')

WebUI.setText(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/input__city'), 'cityP')

WebUI.click(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/div_District'))

WebUI.setText(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/input__district'), 'dictrictP')

WebUI.setText(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/input__fullNameFam'), 'fullnameF')

WebUI.click(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/div_Relationship With Patient'))

WebUI.setText(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/input__relationship'), 'relationF')

WebUI.setText(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/input__numberPhone'), 'phoneNuF')

WebUI.setText(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/input__emailFam'), 'emailF')

WebUI.setText(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/input__addressFamily'), 'AddressF')

WebUI.setText(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/input__provinceFamily'), 'ProvinceF')

WebUI.setText(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/input__cityFamily'), 'CityF')

WebUI.setText(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/input__districtFamily'), 'DistrictF')

WebUI.click(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/button_Save'))

WebUI.click(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/button_Yes'))

