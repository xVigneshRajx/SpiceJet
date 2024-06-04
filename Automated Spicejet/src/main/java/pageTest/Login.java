package pageTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {

	WebDriver driver;
    public Login(WebDriver driver){this.driver=driver;}
    
    private By loginbtn = By.xpath("//div[contains(text(),'Login')]");
    private By phone = By.xpath("(//input[@type='number'])[1]");
    private By password = By.xpath("(//input[@type='password'])[1]");		
    private By loginbtn1 = By.xpath("//div[@data-testid='login-cta']");
    private By failure = By.xpath("(//div[@class='css-1dbjc4n r-13awgt0 r-18u37iz'])[2]");
    
    
    public WebElement Loginbtn(){return driver.findElement(loginbtn);}
    public WebElement Phone() {return driver.findElement(phone);}
    public WebElement Password() {return driver.findElement(password);}
    public WebElement Loginbtn1() {return driver.findElement(loginbtn1);}
    public WebElement Failure() {return driver.findElement(failure);}
    

}
