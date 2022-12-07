package common;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BLoad 
{
	public static WebDriver driver = null;
	public static WebDriver OpenBrpowser3() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium Class from Shrikant\\6thymay2022\\CucumberJava1\\Drivers\\chromedriver.exe");
		//ChromeOptions options = new ChromeOptions(); 
		//options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"}); 
		//WebDriver driver = new ChromeDriver(options); 
		  WebDriver driver=new ChromeDriver();  
		driver.manage().window().maximize();
		//driver.get("https://www.wiggles.in/");
		return driver;
	}
	
	public static String launchurl()
	{
		String site= "https://www.wiggles.in/";
		driver.get(site);
		System.out.println("Wiggles shop is loaded");
		return site;
	}
	
	public String readJSON() throws FileNotFoundException, IOException, ParseException 
	{
		
		JSONParser parser = new JSONParser();
		Object obj = parser.parse(new FileReader("F:\\Selenium Class from Shrikant\\6thymay2022\\CucumberJava1\\src\\main\\java\\Data\\Data.json"));

        JSONObject jsonObject =  (JSONObject) obj;

        String sitename = (String) jsonObject.get("url");
        
		return sitename;
	
	}
}
