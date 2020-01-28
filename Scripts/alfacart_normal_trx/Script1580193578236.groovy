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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://www.alfacart.com/')

WebUI.click(findTestObject('main_page/centang_popup'))

WebUI.click(findTestObject('main_page/close_popup'))

WebUI.click(findTestObject('main_page/button_Masuk  Daftar'))

WebUI.setText(findTestObject('main_page/input_Email'), 'herkanus.f.amisi@alfadigital.id')

WebUI.setText(findTestObject('main_page/input_password'), 'AMISI672014224')

WebUI.click(findTestObject('main_page/btn-login Masuk'))

WebUI.click(findTestObject('profile_page/to_home_page'))

WebUI.setText(findTestObject('main_page/input_search'), 'minyak goreng')

WebUI.sendKeys(findTestObject('main_page/input_search'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('main_page/imgProduct'))

WebUI.click(findTestObject('cart_page/add_to_cart'))

WebUI.click(findTestObject('cart_page/button_VIEW CART'))

WebUI.click(findTestObject('cart_page/lanjut_check_out'))

WebUI.click(findTestObject('check_out_page/to_apg_page'))

WebUI.click(findTestObject('apg_page/bank_transfer'))

WebUI.click(findTestObject('apg_page/button_BAYAR'))


