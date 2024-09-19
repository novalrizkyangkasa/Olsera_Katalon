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

Mobile.startExistingApplication('com.android.chrome')

Mobile.tap(findTestObject('Object Repository/Check Email/android.widget.EditText - Search or type URL'), 0)

Mobile.setText(findTestObject('Object Repository/Check Email/android.widget.EditText - Search or type URL (1)'), 'https://www.mailinator.com/v4/public/inboxes.jsp?to=olseratest', 
    0)

Mobile.tap(findTestObject('Object Repository/Check Email/android.widget.TextView - httpswww.mailinator.comv4publicinboxes.jsptoolseratest'), 
    0)

Mobile.scrollToText('olseratest')

Mobile.tap(findTestObject('Object Repository/Check Email/android.view.View'), 0)

Mobile.scrollToText('Back to Inbox')

Mobile.verifyElementVisible(findTestObject('Object Repository/Check Email/android.view.View (1)'), 0)

Mobile.closeApplication()

