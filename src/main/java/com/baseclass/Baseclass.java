package com.baseclass;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.action.Action;

public class Baseclass {

	public static Properties prop;
	public  WebDriver driver;

    @BeforeTest
	public void loadConfig() throws IOException {
		prop = new Properties();
		try (FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "\\config\\configration.properties"))
		{
			prop.load(file);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	
	}

	
	public void main() throws IOException {
		loadConfig();
		String browserName = prop.getProperty("browser");

		String url = prop.getProperty("url");
		System.out.println(url);

		if (browserName == null || browserName.isEmpty()) {
			System.out.println("browser property is not defined");
			return;
		}

		browserName = browserName.toLowerCase();
		
		switch ("chrome") {
		case "chrome":
               ChromeOptions options = new ChromeOptions();
                options.addArguments("--remote-allow-origins=*");
                			
			driver = new ChromeDriver(options);
			break;

		case "edge":
			driver = new EdgeDriver();
			break;

		case "internetexplorer":
			driver = new InternetExplorerDriver();
			break;

		default:
			System.out.println("Invalid browser specified in the configuration: " + browserName);
			return;
		}

		// Additional setup
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Action.implicitlyWait(driver); // implicit wait
		driver.get(url);
		
		
	}
	
	public void getdriver()
	{

	}
}
