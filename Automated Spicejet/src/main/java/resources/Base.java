package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Base {
	
	
	public Properties pro;
    public static WebDriver driver;
    public WebDriver initializeDriver() throws IOException
    {
        pro = new Properties();
        FileInputStream file = new FileInputStream("E:\\Code\\Selenium\\Spicejet.com\\src\\main\\java\\resources\\data.properties");
        pro.load(file);
        String browserName = pro.getProperty("browser");
        System.out.println(browserName);

        if (browserName.equals("chrome")){
            System.setProperty("webdriver.chrome.driver", "E:\\Code\\Selenium\\Spicejet.com\\Driver\\chromedriver.exe");
            ChromeOptions option = new ChromeOptions();
            option.addArguments("--disable-notifications");
            option.addArguments("--remote-allow-origins=*");
            option.addArguments("use-fake-ui-for-media-stream");
            driver = new ChromeDriver(option);
            driver.manage().window().maximize();
        }
        else if (browserName.equals("edge")){
        	System.setProperty("webdriver.edge.driver", "E:\\Code\\Selenium\\Spicejet.com\\Driver\\msedgedriver.exe");
        	EdgeOptions options = new EdgeOptions();
        	options.addArguments("--disable-notifications");
            options.addArguments("--remote-allow-origins=*");
            options.addArguments("use-fake-ui-for-media-stream");
            driver = new EdgeDriver(options);
            driver.manage().window().maximize();
        }
        else if (browserName.equals("firefox")){
        	System.setProperty("webdriver.chrome.driver", "E:\\Code\\Selenium\\Spicejet.com\\Driver\\geckodriver.exe");
        	FirefoxOptions options = new FirefoxOptions(); 
        	options.addArguments("--disable-notifications");
            options.addArguments("--remote-allow-origins=*");
            options.addArguments("use-fake-ui-for-media-stream");
            driver = new FirefoxDriver(options);
            driver.manage().window().maximize();
        }
        
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        return driver;
    }
}
