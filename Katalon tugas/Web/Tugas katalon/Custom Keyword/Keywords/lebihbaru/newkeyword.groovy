package lebihbaru

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable
import java.util.Random


public class newkeyword {

	@Keyword
	def myCustomRandom(String) {

		String chars = 'ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789'
		//membuat random string builder
		StringBuilder sb = new StringBuilder();
		Random random = new Random();

		int length = 15;
		for (int i = 0; i < length; i++) {
			// generate random gabungan number
			int gabungan = random.nextInt(chars.length());
			// mendapatkan karakter yangdi tentukan di gabungan
			char randomChar = chars.charAt(gabungan);
			//menambahkan karakter ke string builder
			sb.append(randomChar);
		}
		String randomString = sb.toString();
		println 'katarandom :' + randomString
	}
}