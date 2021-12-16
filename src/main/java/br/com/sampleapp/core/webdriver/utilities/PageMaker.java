package br.com.sampleapp.core.webdriver.utilities;

import org.openqa.selenium.support.PageFactory;

public class PageMaker implements Page {
	
	public static <T extends Page> T getInstanceWeb(Class<T> pageClass) {
		try {
			
			return PageFactory.initElements(BaseTest.getDriver(), pageClass);
			
		} catch (Exception e) {
			throw new RuntimeException("Error in page web", e);
		}
	}
}
