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

Mobile.tap(findTestObject('Object Repository/Process Order/android.widget.Button - DENY'), 0)

Mobile.tap(findTestObject('Object Repository/Send E Receipt/android.widget.TextView -'), 0)

Mobile.tap(findTestObject('Object Repository/Send E Receipt/android.widget.TextView - Transactions'), 0)

Mobile.tap(findTestObject('Object Repository/Send E Receipt/android.widget.TextView - 062C24091900000001'), 0)

Mobile.tap(findTestObject('Object Repository/Send E Receipt/android.widget.TextView - (1)'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Send E Receipt/android.widget.TextView - Email'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Send E Receipt/android.widget.ImageButton'), 0)

Mobile.tap(findTestObject('Object Repository/Send E Receipt/android.widget.TextView - Email'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Send E Receipt/android.widget.FrameLayout'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Send E Receipt/android.widget.EditText - Recipients Email'), 
    0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Send E Receipt/android.widget.TextView - CANCEL'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Send E Receipt/android.widget.TextView - CANCEL'), 0)

Mobile.setText(findTestObject('Send E Receipt/android.widget.EditText - Recipients Email'), 'olseratest@mailinator.com', 
    0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Send E Receipt/android.widget.TextView - CONFIRM'), 0)

Mobile.tap(findTestObject('Object Repository/Send E Receipt/android.widget.TextView - CONFIRM'), 0)

WebUI.enableSmartWait()

Mobile.closeApplication()

