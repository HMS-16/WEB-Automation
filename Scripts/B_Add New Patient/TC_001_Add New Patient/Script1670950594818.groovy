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

WebUI.setText(findTestObject('Add New Patient/Page_HMS-16-Admin/birthday'), birthdayPatient)

WebUI.setText(findTestObject('Object Repository/Add New Patient/Page_HMS-16-Admin/Page_HMS-16-Admin/input__email'), emailPatient)

WebUI.setText(findTestObject('Object Repository/Add New Patient/Page_HMS-16-Admin/Page_HMS-16-Admin/input__numberMed'), 
    '1233232323223')

WebUI.setText(findTestObject('Object Repository/Add New Patient/Page_HMS-16-Admin/Page_HMS-16-Admin/input__phoneNum'), phoneNumberPatient)

WebUI.setText(findTestObject('Object Repository/Add New Patient/Page_HMS-16-Admin/Page_HMS-16-Admin/input__address'), addressPatient)

WebUI.setText(findTestObject('Object Repository/Add New Patient/Page_HMS-16-Admin/Page_HMS-16-Admin/input__city'), cityPatient)

WebUI.setText(findTestObject('Object Repository/Add New Patient/Page_HMS-16-Admin/Page_HMS-16-Admin/input__fullNameFam'), 
    fullnameFamily)

WebUI.setText(findTestObject('Object Repository/Add New Patient/Page_HMS-16-Admin/Page_HMS-16-Admin/input__numberPhone'), 
    phoneNumberFamily)

WebUI.setText(findTestObject('Object Repository/Add New Patient/Page_HMS-16-Admin/Page_HMS-16-Admin/input__addressFamily'), 
    addressFamily)

WebUI.setText(findTestObject('Object Repository/Add New Patient/Page_HMS-16-Admin/Page_HMS-16-Admin/input__cityFamily'), 
    cityFamily)

WebUI.setText(findTestObject('Object Repository/Add New Patient/Page_HMS-16-Admin/Page_HMS-16-Admin/input__province'), provincePatient)

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

valueFullNamePatient = WebUI.getText(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/input__fullName'))
valueFullBirthPlacePatient = WebUI.getText(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/input__birthPlace'))
valueEmailPatient = WebUI.getText(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/input__email'))
valuePhoneNumPatient = WebUI.getText(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/input__phoneNum'))
valueAddressPatient = WebUI.getText(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/input__address'))
valueProvincePatient = WebUI.getText(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/input__province'))
valueCityPatient = WebUI.getText(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/input__city'))
valueDistrictPatient = WebUI.getText(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/input__district'))
valueFullNameFam = WebUI.getText(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/input__fullNameFam'))
valueRelationshipFam = WebUI.getText(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/input__relationship'))
valuePhoneNumFam = WebUI.getText(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/input__numberPhone'))
valueEmailFam = WebUI.getText(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/input__emailFam'))
valueAddressFam = WebUI.getText(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/input__addressFamily'))
valueProvinceFam = WebUI.getText(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/input__provinceFamily'))
valueCityFam = WebUI.getText(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/input__cityFamily'))
valueDistrictFam = WebUI.getText(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/input__districtFamily'))

if (valueFullNamePatient == '') {
//verify bahwa pesan error muncul, dan verify text pesan errornya sudah benar
//    WebUI.verifyElementText(findTestObject('Add SP with valid data/Page_/AddSP_inputPostalcode'))
}
else if (valueFullBirthPlacePatient == '') {
//verify bahwa pesan error muncul, dan verify text pesan errornya sudah benar
//    WebUI.verifyElementText(findTestObject('Add SP with valid data/Page_/AddSP_inputPostalcode'))
}
else if (valueEmailPatient == '') {
//verify bahwa pesan error muncul, dan verify text pesan errornya sudah benar
//    WebUI.verifyElementText(findTestObject('Add SP with valid data/Page_/AddSP_inputPostalcode'))
}
else if(valueEmailPatient.contains("@gmail.com") == false){
//verify bahwa pesan error muncul, dan verify text pesan errornya bahwa format email tidak  benar
//    WebUI.verifyElementText(findTestObject('Add SP with valid data/Page_/AddSP_inputPostalcode'))
}
else if (valuePhoneNumPatient == '') {
//verify bahwa pesan error muncul, dan verify text pesan errornya sudah benar
//    WebUI.verifyElementText(findTestObject('Add SP with valid data/Page_/AddSP_inputPostalcode'))
}
else if((valuePhoneNumPatient.length() < 9) || (valuePhoneNumPatient.length() > 16)){
//verify bahwa pesan error muncul, dan verify text pesan errornya bahwa panjang no telp hanya 9-16 tidak  benar
//    WebUI.verifyElementText(findTestObject('Add SP with valid data/Page_/AddSP_inputPostalcode'))
}
else if (valueAddressPatient == '') {
//verify bahwa pesan error muncul, dan verify text pesan errornya sudah benar
//    WebUI.verifyElementText(findTestObject('Add SP with valid data/Page_/AddSP_inputPostalcode'))
}
else if (valueProvincePatient == '') {
//verify bahwa pesan error muncul, dan verify text pesan errornya sudah benar
//    WebUI.verifyElementText(findTestObject('Add SP with valid data/Page_/AddSP_inputPostalcode'))
}
else if (valueCityPatient == '') {
//verify bahwa pesan error muncul, dan verify text pesan errornya sudah benar
//    WebUI.verifyElementText(findTestObject('Add SP with valid data/Page_/AddSP_inputPostalcode'))
}
else if (valueDistrictPatient == '') {
//verify bahwa pesan error muncul, dan verify text pesan errornya sudah benar
//    WebUI.verifyElementText(findTestObject('Add SP with valid data/Page_/AddSP_inputPostalcode'))
}
else if (valueFullNameFam == '') {
//verify bahwa pesan error muncul, dan verify text pesan errornya sudah benar
//    WebUI.verifyElementText(findTestObject('Add SP with valid data/Page_/AddSP_inputPostalcode'))
}
else if (valueRelationshipFam == '') {
//verify bahwa pesan error muncul, dan verify text pesan errornya sudah benar
//    WebUI.verifyElementText(findTestObject('Add SP with valid data/Page_/AddSP_inputPostalcode'))
}
else if (valuePhoneNumFam == '') {
//verify bahwa pesan error muncul, dan verify text pesan errornya sudah benar
//    WebUI.verifyElementText(findTestObject('Add SP with valid data/Page_/AddSP_inputPostalcode'))
}
else if((valuePhoneNumFam.length() < 9) || (valuePhoneNumFam.length() > 16)){
//verify bahwa pesan error muncul, dan verify text pesan errornya bahwa panjang no telp hanya 9-16 tidak  benar
//    WebUI.verifyElementText(findTestObject('Add SP with valid data/Page_/AddSP_inputPostalcode'))
}
else if (valueEmailFam == '') {
//verify bahwa pesan error muncul, dan verify text pesan errornya sudah benar
//    WebUI.verifyElementText(findTestObject('Add SP with valid data/Page_/AddSP_inputPostalcode'))
}
else if(valueEmailFam.contains("@gmail.com")==false){
//verify bahwa pesan error muncul, dan verify text pesan errornya bahwa format email tidak  benar
//    WebUI.verifyElementText(findTestObject('Add SP with valid data/Page_/AddSP_inputPostalcode'))
}
else if (valueAddressFam == '') {
//verify bahwa pesan error muncul, dan verify text pesan errornya sudah benar
//    WebUI.verifyElementText(findTestObject('Add SP with valid data/Page_/AddSP_inputPostalcode'))
}
else if (valueAddressFam == '') {
//verify bahwa pesan error muncul, dan verify text pesan errornya sudah benar
//    WebUI.verifyElementText(findTestObject('Add SP with valid data/Page_/AddSP_inputPostalcode'))
}
else if (valueProvinceFam == '') {
//verify bahwa pesan error muncul, dan verify text pesan errornya sudah benar
//    WebUI.verifyElementText(findTestObject('Add SP with valid data/Page_/AddSP_inputPostalcode'))
}
else if (valueCityFam == '') {
//verify bahwa pesan error muncul, dan verify text pesan errornya sudah benar
//    WebUI.verifyElementText(findTestObject('Add SP with valid data/Page_/AddSP_inputPostalcode'))
}
else if (valueDistrictFam == '') {
//verify bahwa pesan error muncul, dan verify text pesan errornya sudah benar
//    WebUI.verifyElementText(findTestObject('Add SP with valid data/Page_/AddSP_inputPostalcode'))
}