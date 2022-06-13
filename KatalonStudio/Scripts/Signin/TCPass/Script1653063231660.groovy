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

'Mở trình duyệt'
WebUI.openBrowser('')

'Chuyển hướng đến trang web CareerLink'
WebUI.navigateToUrl('https://www.careerlink.vn/')

CustomKeywords.'myKeyword.zoomInBrowser'()

WebUI.click(findTestObject('Object Repository/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/i_ng k_cli-angle-down ml-xl-3 mr-1'))

'Click Đăng nhập'
WebUI.click(findTestObject('Object Repository/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/a_ng nhp'))

'Nhập email'
WebUI.setText(findTestObject('Object Repository/Page_ng nhp bng ti khon CareerLink  Viec la_c221a4/input_Ngi tm vic ng nhp__username'), 
    email)

'Nhập mật khẩu'
WebUI.setEncryptedText(findTestObject('Object Repository/Page_ng nhp bng ti khon CareerLink  Viec la_c221a4/input_Chng ti va gi li link kch hot n email_ae56e9'), 
    password)

'Nhấn button Đăng nhập'
WebUI.click(findTestObject('Object Repository/Page_ng nhp bng ti khon CareerLink  Viec la_c221a4/button_ng nhp'))

'Xác minh kết quả'
WebUI.verifyElementText(findTestObject('Object Repository/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/span_Nguyn Hong Anh'), 
    result)

'Đóng trình duyệt'
WebUI.closeBrowser()

