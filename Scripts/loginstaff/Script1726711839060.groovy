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

Mobile.startExistingApplication('com.olserapratama.pos')

WebUI.enableSmartWait()

Mobile.tap(findTestObject('Object Repository/Login Staff/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/Login Staff/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/Login Staff/android.widget.EditText - Store ID'), 0)

Mobile.setText(findTestObject('Object Repository/Login Staff/android.widget.EditText - Store ID (1)'), 'sukucadangmobil', 
    0)

Mobile.verifyElementText(findTestObject('Object Repository/Login Staff/android.widget.EditText - sukucadangmobil'), 'sukucadangmobil')

Mobile.tap(findTestObject('Object Repository/Login Staff/android.widget.EditText - Staff Code'), 0)

Mobile.setText(findTestObject('Object Repository/Login Staff/android.widget.EditText - Staff Code (1)'), 'P01', 0)

Mobile.verifyElementText(findTestObject('Object Repository/Login Staff/android.widget.EditText - P01'), 'P01')

Mobile.tap(findTestObject('Object Repository/Login Staff/android.widget.EditText - Password'), 0)

Mobile.setText(findTestObject('Object Repository/Login Staff/android.widget.EditText - Password (1)'), 'P01', 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Login Staff/android.widget.Button - Sign In'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Login Staff/android.widget.Button - Sign In'), 0)

Mobile.tap(findTestObject('Object Repository/Login Staff/android.widget.Button - Sign In'), 0)

Mobile.tap(findTestObject('Object Repository/Process Order/android.widget.Button - DENY'), 0)

Mobile.closeApplication()

