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

valueFullNamePatient = WebUI.getText(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/input__fullName'))

if (valueFullNamePatient == '') {
	//verify bahwa pesan error muncul, dan verify text pesan errornya sudah benar
	//    WebUI.verifyElementText(findTestObject('Add SP with valid data/Page_/AddSP_inputPostalcode'))
}

WebUI.sendKeys(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/input__birthPlace'), Keys.chord(Keys.CONTROL, 
        'a'))

WebUI.setText(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/input__birthPlace'), birthplacePatient)

WebUI.click(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/button_Save'))

valueFullBirthPlacePatient = WebUI.getText(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/input__birthPlace'))

if (valueFullBirthPlacePatient == '') {
	//verify bahwa pesan error muncul, dan verify text pesan errornya sudah benar
	//    WebUI.verifyElementText(findTestObject('Add SP with valid data/Page_/AddSP_inputPostalcode'))
}

WebUI.selectOptionByValue(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/select_MaleFemale'), genderPatient, 
    true)

WebUI.selectOptionByValue(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/select_ABOAB'), bloodTypePatient, 
    true)

WebUI.sendKeys(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/input__email'), Keys.chord(Keys.CONTROL, 
        'a'))

WebUI.setText(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/input__email'), emailPatient)

WebUI.click(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/button_Save'))
valueEmailPatient = WebUI.getText(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/input__email'))
if (valueEmailPatient == '') {
//verify bahwa pesan error muncul, dan verify text pesan errornya sudah benar
//    WebUI.verifyElementText(findTestObject('Add SP with valid data/Page_/AddSP_inputPostalcode'))
}
else if(valueEmailPatient.contains("@gmail.com") == false){
//verify bahwa pesan error muncul, dan verify text pesan errornya bahwa format email tidak  benar
//    WebUI.verifyElementText(findTestObject('Add SP with valid data/Page_/AddSP_inputPostalcode'))
}

WebUI.click(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/input__numberMed'))

WebUI.selectOptionByValue(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/select_SingleMaried'), statusPatient, 
    true)

WebUI.sendKeys(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/input__phoneNum'), Keys.chord(Keys.CONTROL, 
        'a'))

WebUI.setText(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/input__phoneNum'), phoneNumberPatient)

WebUI.click(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/button_Save'))
valuePhoneNumPatient = WebUI.getText(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/input__phoneNum'))
if (valuePhoneNumPatient == '') {
//verify bahwa pesan error muncul, dan verify text pesan errornya sudah benar
//    WebUI.verifyElementText(findTestObject('Add SP with valid data/Page_/AddSP_inputPostalcode'))
}
else if((valuePhoneNumPatient.length() < 9) || (valuePhoneNumPatient.length() > 16)){
//verify bahwa pesan error muncul, dan verify text pesan errornya bahwa panjang no telp hanya 9-16 tidak  benar
//    WebUI.verifyElementText(findTestObject('Add SP with valid data/Page_/AddSP_inputPostalcode'))
}

WebUI.sendKeys(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/input__address'), Keys.chord(Keys.CONTROL, 
        'a'))

WebUI.setText(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/input__address'), addressPatient)

WebUI.click(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/button_Save'))
valueAddressPatient = WebUI.getText(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/input__address'))
if (valueAddressPatient == '') {
//verify bahwa pesan error muncul, dan verify text pesan errornya sudah benar
//    WebUI.verifyElementText(findTestObject('Add SP with valid data/Page_/AddSP_inputPostalcode'))
}


WebUI.sendKeys(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/input__province'), Keys.chord(Keys.CONTROL, 
        'a'))

WebUI.setText(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/input__province'), provincePatient)

WebUI.click(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/button_Save'))
valueProvincePatient = WebUI.getText(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/input__province'))
if (valueProvincePatient == '') {
//verify bahwa pesan error muncul, dan verify text pesan errornya sudah benar
//    WebUI.verifyElementText(findTestObject('Add SP with valid data/Page_/AddSP_inputPostalcode'))
}

WebUI.sendKeys(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/input__city'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.setText(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/input__city'), cityPatient)

WebUI.click(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/button_Save'))
valueCityPatient = WebUI.getText(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/input__city'))
if (valueCityPatient == '') {
//verify bahwa pesan error muncul, dan verify text pesan errornya sudah benar
//    WebUI.verifyElementText(findTestObject('Add SP with valid data/Page_/AddSP_inputPostalcode'))
}

WebUI.sendKeys(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/input__district'), Keys.chord(Keys.CONTROL, 
        'a'))

WebUI.setText(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/input__district'), districtPatient)

WebUI.click(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/button_Save'))
valueDistrictPatient = WebUI.getText(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/input__district'))
if (valueDistrictPatient == '') {
//verify bahwa pesan error muncul, dan verify text pesan errornya sudah benar
//    WebUI.verifyElementText(findTestObject('Add SP with valid data/Page_/AddSP_inputPostalcode'))
}

WebUI.sendKeys(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/input__fullNameFam'), Keys.chord(Keys.CONTROL, 
        'a'))

WebUI.setText(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/input__fullNameFam'), fullnameFamily)

WebUI.click(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/button_Save'))
valueFullNameFam = WebUI.getText(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/input__fullNameFam'))
if (valueFullNameFam == '') {
//verify bahwa pesan error muncul, dan verify text pesan errornya sudah benar
//    WebUI.verifyElementText(findTestObject('Add SP with valid data/Page_/AddSP_inputPostalcode'))
}

WebUI.sendKeys(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/input__relationship'), Keys.chord(Keys.CONTROL, 
        'a'))

WebUI.setText(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/input__relationship'), relationshipFamily)

WebUI.click(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/button_Save'))
valueRelationshipFam = WebUI.getText(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/input__relationship'))
if (valueRelationshipFam == '') {
//verify bahwa pesan error muncul, dan verify text pesan errornya sudah benar
//    WebUI.verifyElementText(findTestObject('Add SP with valid data/Page_/AddSP_inputPostalcode'))
}

WebUI.sendKeys(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/input__numberPhone'), Keys.chord(Keys.CONTROL, 
        'a'))

WebUI.setText(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/input__numberPhone'), phoneNumberFamily)

WebUI.click(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/button_Save'))
valuePhoneNumFam = WebUI.getText(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/input__numberPhone'))
if (valuePhoneNumFam == '') {
//verify bahwa pesan error muncul, dan verify text pesan errornya sudah benar
//    WebUI.verifyElementText(findTestObject('Add SP with valid data/Page_/AddSP_inputPostalcode'))
}
else if((valuePhoneNumFam.length() < 9) || (valuePhoneNumFam.length() > 16)){
//verify bahwa pesan error muncul, dan verify text pesan errornya bahwa panjang no telp hanya 9-16 tidak  benar
//    WebUI.verifyElementText(findTestObject('Add SP with valid data/Page_/AddSP_inputPostalcode'))
}

WebUI.sendKeys(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/input__emailFam'), Keys.chord(Keys.CONTROL, 
        'a'))

WebUI.setText(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/input__emailFam'), emailFamily)

WebUI.click(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/button_Save'))
valueEmailFam = WebUI.getText(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/input__emailFam'))
if (valueEmailFam == '') {
//verify bahwa pesan error muncul, dan verify text pesan errornya sudah benar
//    WebUI.verifyElementText(findTestObject('Add SP with valid data/Page_/AddSP_inputPostalcode'))
}
else if(valueEmailFam.contains("@gmail.com")==false){
//verify bahwa pesan error muncul, dan verify text pesan errornya bahwa format email tidak  benar
//    WebUI.verifyElementText(findTestObject('Add SP with valid data/Page_/AddSP_inputPostalcode'))
}

WebUI.sendKeys(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/input__addressFamily'), Keys.chord(Keys.CONTROL, 
        'a'))

WebUI.setText(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/input__addressFamily'), addressFamily)

WebUI.click(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/button_Save'))

valueAddressFam = WebUI.getText(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/input__addressFamily'))
if (valueAddressFam == '') {
//verify bahwa pesan error muncul, dan verify text pesan errornya sudah benar
//    WebUI.verifyElementText(findTestObject('Add SP with valid data/Page_/AddSP_inputPostalcode'))
}
WebUI.sendKeys(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/input__provinceFamily'), Keys.chord(Keys.CONTROL, 
        'a'))

WebUI.setText(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/input__provinceFamily'), provinceFamily)

WebUI.click(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/button_Save'))
valueProvinceFam = WebUI.getText(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/input__provinceFamily'))
if (valueProvinceFam == '') {
//verify bahwa pesan error muncul, dan verify text pesan errornya sudah benar
//    WebUI.verifyElementText(findTestObject('Add SP with valid data/Page_/AddSP_inputPostalcode'))
}

WebUI.sendKeys(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/input__cityFamily'), Keys.chord(Keys.CONTROL, 
        'a'))

WebUI.setText(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/input__cityFamily'), cityFamily)

WebUI.click(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/button_Save'))
valueCityFam = WebUI.getText(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/input__cityFamily'))
if (valueCityFam == '') {
//verify bahwa pesan error muncul, dan verify text pesan errornya sudah benar
//    WebUI.verifyElementText(findTestObject('Add SP with valid data/Page_/AddSP_inputPostalcode'))
}

WebUI.sendKeys(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/input__districtFamily'), Keys.chord(Keys.CONTROL, 
        'a'))

WebUI.setText(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/input__districtFamily'), districtFamily)

WebUI.click(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/button_Save'))

valueDistrictFam = WebUI.getText(findTestObject('Object Repository/EditPatient/Page_HMS-16-Admin/input__districtFamily'))
if (valueDistrictFam == '') {
//verify bahwa pesan error muncul, dan verify text pesan errornya sudah benar
//    WebUI.verifyElementText(findTestObject('Add SP with valid data/Page_/AddSP_inputPostalcode'))
}
