package common;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
//import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

//import java.awt.Robot;
//import java.awt.event.KeyEvent;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.support.ui.Select;

//import io.cucumber.core.gherkin.messages.internal.gherkin.internal.com.eclipsesource.json.ParseException;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;

public class OpenBrowserWiggle 
{
	public static WebDriver driver = null;
	public static WebDriver OpenBrpowser1() throws InterruptedException, IOException, org.json.simple.parser.ParseException 
	{
	System.setProperty("webdriver.chrome.driver", "F:\\Selenium Class from Shrikant\\6thymay2022\\CucumberJava1\\Drivers\\chromedriver.exe");
	//JSONObject abc=(JSONObject)common.OpenBrowser.readJSON("F:\\Selenium Class from Shrikant\\6thymay2022\\CucumberJava1\\src\\\\main\\\\java\\\\Data\\\\Data.json");
	ChromeOptions options = new ChromeOptions(); 
	options.addArguments("--disable-notifications");
	options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"}); 
	WebDriver driver = new ChromeDriver(options); 
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	return driver;
	}
	
	public static JSONObject readJSON(String path) throws IOException, org.json.simple.parser.ParseException
	{
		
	        JSONParser parser = new JSONParser();
			Object obj = parser.parse(new FileReader(path));
	        JSONObject jsonObject =  (JSONObject) obj;
	      //  String URL= (String) jsonObject.get("url");
	        return jsonObject;
	
	}
	public void  tabfunction() throws AWTException
	{
		///this mouse function. Below is tab event for moving cursor from one tab into another. 
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);
	}
	
	public void scrolldown() throws AWTException
	{
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_UP);
	}
	
	
	
}
