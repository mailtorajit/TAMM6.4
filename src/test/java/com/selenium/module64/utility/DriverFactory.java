package com.selenium.module64.utility;

import java.util.Properties;
import org.openqa.selenium.WebDriver;

import com.selenium.module64.patterns.BrowserIntializer;
import com.selenium.module64.patterns.ChromeBrowserIntializer;
import com.selenium.module64.patterns.FireFoxDriverIntializer;
import com.selenium.module64.patterns.IEDriverInitializer;

public class DriverFactory {
	public static WebDriver driver;
	public Properties properties;

	public static WebDriver getBrowserInstance(String browserName) {
		if (browserName.equalsIgnoreCase("Chrome")) {
			BrowserIntializer browserIntializer=new  ChromeBrowserIntializer();
			driver=browserIntializer.intializeBrowser();
			return driver;
		} else if (browserName.equalsIgnoreCase("firefox")) {
			BrowserIntializer browserIntializer=new  FireFoxDriverIntializer();
			driver=browserIntializer.intializeBrowser();
		} else if (browserName.equalsIgnoreCase("Internet Explorer")) {
			IEDriverInitializer inetBorwser = new IEDriverInitializer();
			driver = inetBorwser.intializeBrowser();
		}
		return driver;
	}
}