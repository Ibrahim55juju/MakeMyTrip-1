package com.makemytrip.pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.makemytrip.baseclass.BaseClass;
import com.makemytrip.util.UtilFunctions;

public class AllFlightInfoPage extends BaseClass {

	public static WebDriver driver;

	@FindBy(xpath = "//div[@id='ow-domrt-jrny']/div/div[contains(@class,'fli-list splitVw-listing ')]")
	private List<WebElement> allFlightInfo;

	@FindBy(xpath = "//div[@id='ow-domrt-jrny']/div/div[contains(@class,'fli-list splitVw-listing ')]//descendant ::span[1][contains(@class,'insertSep')]")
	private List<WebElement> flightName;

	@FindBy(xpath = "//div[@id='ow-domrt-jrny']/div/div[contains(@class,'fli-list splitVw-listing ')]//descendant::label/div/div[@class='dept-time']")
	private List<WebElement> deptTime;

	@FindBy(xpath = "//div[@id='ow-domrt-jrny']/div/div[contains(@class,'fli-list splitVw-listing ')]//descendant::div/p[@class='fli-duration']")
	private List<WebElement> duration;

	@FindBy(xpath = "//div[@id='ow-domrt-jrny']/div/div[contains(@class,'fli-list splitVw-listing ')]//descendant::div/p/span[@class='actual-price']")
	private List<WebElement> amount;

	public AllFlightInfoPage(WebDriver ldriver) {
		this.driver = ldriver;
		PageFactory.initElements(driver, this);
	}

	public List<WebElement> getallFlightInfo() {
		return allFlightInfo;
	}

	public List<WebElement> getFlightName() {
		return flightName;
	}

	public List<WebElement> getDeptTime() {
		return deptTime;
	}

	public List<WebElement> getDuration() {
		return duration;
	}

	public List<WebElement> getAmount() {
		return amount;
	}

}
