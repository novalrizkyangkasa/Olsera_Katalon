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

Mobile.tap(findTestObject('Object Repository/Process Order/android.widget.TextView -'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Process Order/android.widget.TextView - (1)'), '')

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Process Order/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/Process Order/android.widget.TextView - (2)'), 0)

Mobile.tap(findTestObject('Object Repository/Process Order/android.widget.EditText - 0'), 0)

Mobile.setText(findTestObject('Object Repository/Process Order/android.widget.EditText - 0 (1)'), '10000', 0)

Mobile.tap(findTestObject('Object Repository/Process Order/androidx.drawerlayout.widget.DrawerLayout'), 0)

Mobile.tap(findTestObject('Object Repository/Process Order/android.widget.EditText - Notes'), 0)

Mobile.setText(findTestObject('Object Repository/Process Order/android.widget.EditText - Notes (1)'), 'Create Automation Order Item', 
    0)

Mobile.tap(findTestObject('Object Repository/Process Order/androidx.drawerlayout.widget.DrawerLayout'), 0)

Mobile.tap(findTestObject('Object Repository/Process Order/android.widget.TextView - Save'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Process Order/android.widget.TextView - Rp 1,990,000'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Process Order/android.widget.TextView - Rp 1,990,000'), 'Rp 1,990,000')

Mobile.tap(findTestObject('Object Repository/Process Order/android.widget.TextView - Rp 1,990,000'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Process Order/android.widget.TextView - Select Payment Mode'), 
    0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Process Order/android.widget.TextView - CASH'), 0)

Mobile.tap(findTestObject('Object Repository/Process Order/android.widget.TextView - CASH'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Process Order/android.widget.TextView - Rp 1,990,000 (1)'), 'Rp 1,990,000')

Mobile.verifyElementText(findTestObject('Object Repository/Process Order/android.widget.TextView - Rp 1,990,000'), 'Rp 1,990,000')

Mobile.tap(findTestObject('Object Repository/Process Order/android.widget.TextView - Pay'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Process Order/android.widget.TextView - 1,990,000'), '1,990,000')

Mobile.tap(findTestObject('Object Repository/Process Order/android.widget.TextView - (3)'), 0)

Mobile.tap(findTestObject('Object Repository/Process Order/android.widget.LinearLayout'), 0)

Mobile.tap(findTestObject('Object Repository/Process Order/android.widget.TextView - Transactions'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Process Order/android.widget.TextView - 1,990,000 - CASH'), '1,990,000 - CASH')

Mobile.closeApplication()

