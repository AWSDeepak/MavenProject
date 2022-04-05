package SeleniumGrid_Pipeline.SeleniumGrid_Pipeline;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ParallelTest {
	
   WebDriver driver;
	
  @Test
  public void grid() throws MalformedURLException  {
	  
	  ChromeOptions chromeOptions = new ChromeOptions();
      //initialize chromeOptions
      chromeOptions.setCapability("browserName", "chrome");
      //Define on which browser you want to execute your tests.
      chromeOptions.setCapability("platformName", "WINDOWS");
      //Define in which mode your tests will run.
      chromeOptions.addArguments("--headless");
      //Define the platform on which you will execute your tests
      WebDriver driver = new RemoteWebDriver(new URL("http://ec2-65-2-35-95.ap-south-1.compute.amazonaws.com:4444/wd/hub"), chromeOptions);      //URL to the hub running on your local system
      driver.get("http://www.knoldus.com");
      //URL to hit
      System.out.println(driver.getTitle());
      //Print the title of the webpage
      System.out.println(driver.getCurrentUrl());
      //Print the URL of the current webpage
      driver.quit();
      //Close the browser
  }
  
	/*
	 * @Test public void grid() throws MalformedURLException {
	 * 
	 * DesiredCapabilities caps = new DesiredCapabilities();
	 * caps.setBrowserName(BrowserType.CHROME); caps.setCapability("version", "");
	 * caps.setPlatform(Platform.LINUX); driver = new RemoteWebDriver(new
	 * URL("http://172.17.0.2:4444"),caps); driver.get("https://www.google.co.in/");
	 * driver.manage().window().maximize();
	 * System.out.println("Title is ="+driver.getTitle()); driver.close(); }
	 */
	/*
	 * @Test public void grid1() throws MalformedURLException {
	 * 
	 * DesiredCapabilities caps = new DesiredCapabilities();
	 * caps.setBrowserName(BrowserType.FIREFOX); caps.setCapability("version", "");
	 * caps.setPlatform(Platform.LINUX); driver = new RemoteWebDriver(new
	 * URL("http://192.168.1.4:4444/wd/hub"),caps);
	 * driver.get("https://www.google.co.in/"); driver.manage().window().maximize();
	 * System.out.println("Title is ="+driver.getTitle()); driver.close(); }
	 */
}
