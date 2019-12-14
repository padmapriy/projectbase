package org.tcs.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	private void lChrome() {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Baseclass\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	}
}
