package br.com.sampleapp.core.utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import br.com.sampleapp.core.webdriver.utilities.BaseTest;

public class UtilidadesPagina {
	
	private Select seletor;
	private static WebDriver driver = BaseTest.getDriver();
	
	public void selectElementByValue(WebElement element, String value) {
		try {
			seletor = new Select(element);
			seletor.selectByVisibleText(value);
		} catch (Exception ex) {
			System.out.println("Erro ao selecionar opcao por texto.");
		}
	}
	
	public Object executeJS(String cmd, Object... param) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		return js.executeScript(cmd, param);
	}

	public void scroll(int scroll) {
		executeJS("window.scrollBy(0," + scroll + ")", "");
	}

	public void scroll(WebElement element) {
		executeJS("arguments[0].scrollIntoView(true);", element);
	}
	
	public void click(WebElement element) {
		element.isDisplayed();
		try {
			executeJS("arguments[0].click();", element);
		} catch (StaleElementReferenceException ex) {
			element.click();
		}
	}
	
	public void navigateToURL(String url) {
		driver.get(url);
	}
	
	public void verifyVisibilityElement(WebElement element) {
		element.isDisplayed();
	}
	
	public void selectElementDropDown(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByValue(value);
	}
	
	public void insertText(WebElement element, String text) {
		element.sendKeys(text);
	}
	
	public boolean isDisplayed(WebElement element, int miliseg) {
		
		miliseg = miliseg / 1000;
		for (int i = 1; i <= miliseg; i++) {
			try {
				if(element.isDisplayed()) {
					return true;
				}
			} catch (Exception e) {
				sleep(1000);
			}
		}
		
		return false;
	}
	
	public boolean isDisplayed(WebElement element) {
		return isDisplayed(element, 60000);
	}
	
	public void sleep(final int miliseg) {
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.err.println(e);
		}
		
	}
}
