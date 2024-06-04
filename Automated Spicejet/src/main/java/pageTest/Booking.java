package pageTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Booking {
		
	WebDriver driver;
    public Booking (WebDriver driver){this.driver=driver;}
    
    private By round = By.xpath("//div[contains(text(),'round trip')]");
    private By from = By.xpath("(//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu'])[1]");
    private By to = By.xpath("(//input[@dir='auto'])[2]"); 
    private By date1 = By.xpath("(//div[@class='css-1dbjc4n r-1awozwy r-1pi2tsx r-1777fci r-13qz1uu'])[30]");		
    private By date2 = By.xpath("(//div[@class='css-1dbjc4n r-1awozwy r-1pi2tsx r-1777fci r-13qz1uu'])[35]"); 
    private By pass = By.xpath("//div[contains(text(),'Passengers')]");
    private By adultbtn = By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']");
    private By childbtn = By.xpath("//div[@data-testid='Children-testID-plus-one-cta']");
    private By lessbtn = By.xpath("//div[@data-testid='Infant-testID-plus-one-cta']");
    private By donebtn = By.xpath("//div[@data-testid='home-page-travellers-done-cta']");
    private By check = By.xpath("(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep'])[5]");
    private By searchbtn = By.xpath("//div[@data-testid='home-page-flight-cta']");
    private By pricebtn1 = By.xpath("(//span[contains(text(),'₹')])[5]");
    private By scroll1 = By.xpath("(//div[@class='css-1dbjc4n r-13awgt0 r-18u37iz r-b5h31w r-1ah4tor r-tvv088'])[2]");
    private By pricebtn2 = By.xpath("(//span[contains(text(),'₹')])[12]");
    private By scroll2 = By.xpath("(//div[@class='css-1dbjc4n r-13awgt0 r-18u37iz r-b5h31w r-1ah4tor r-tvv088'])[6]");
    private By continuebtn = By.xpath("//div[@data-testid='continue-search-page-cta']");		
    		
    		
    public WebElement RoundTrip() {return driver.findElement(round);}
    public WebElement From() {return driver.findElement(from);}
    public WebElement To() {return driver.findElement(to);}
    public WebElement Date1() {return driver.findElement(date1);}
    public WebElement Date2() {return driver.findElement(date2);}
    public WebElement Passengers() {return driver.findElement(pass);}
    public WebElement Adultbtn() {return driver.findElement(adultbtn);}
    public WebElement ChildBtn() {return driver.findElement(childbtn);}
    public WebElement Infantbtn() {return driver.findElement(lessbtn);}
    public WebElement Donebtn() {return driver.findElement(donebtn);}
    public WebElement Check() {return driver.findElement(check);}
    public WebElement Searchbtn() {return driver.findElement(searchbtn);}
    public WebElement Pricebtn1() {return driver.findElement(pricebtn1);}
    public WebElement Scroll1() {return driver.findElement(scroll1);}
    public WebElement Pricebtn2() {return driver.findElement(pricebtn2);}
    public WebElement Scroll2() {return driver.findElement(scroll2);}
    public WebElement Continue() {return driver.findElement(continuebtn);}
    
}
