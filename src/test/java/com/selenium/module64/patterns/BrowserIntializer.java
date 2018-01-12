package com.selenium.module64.patterns;

import org.openqa.selenium.WebDriver;

public abstract class BrowserIntializer{
	
	protected static WebDriver driver;
	public abstract WebDriver intializeBrowser();

}

