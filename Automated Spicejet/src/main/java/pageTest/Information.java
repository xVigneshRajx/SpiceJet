package pageTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Information {
	
	WebDriver driver;
	public Information (WebDriver driver) {this.driver=driver;}
	
	
	
	private By city = By.xpath("//input[@data-testid='city-inputbox-contact-details']");
	private By infobtn = By.xpath("//div[text()='Next']");
	private By passphone = By.xpath("//input[@data-testid='sc-member-mobile-number-input-box']");
	private By pass1first = By.xpath("//input[@data-testid='traveller-0-first-traveller-info-input-box']");
	private By pass1last = By.xpath("//input[@data-testid='traveller-0-last-traveller-info-input-box']");
	private By pass2first = By.xpath("//input[@data-testid='traveller-1-first-traveller-info-input-box']");
	private By pass2last = By.xpath("//input[@data-testid='traveller-1-last-traveller-info-input-box']");
	private By pass3first = By.xpath("//input[@data-testid='traveller-2-first-traveller-info-input-box']");
	private By pass3last = By.xpath("//input[@data-testid='traveller-2-last-traveller-info-input-box']");
	private By pass4first = By.xpath("//input[@data-testid='traveller-3-first-traveller-info-input-box']");
	private By pass4last = By.xpath("//input[@data-testid='traveller-3-last-traveller-info-input-box']");
	private By pass5first = By.xpath("//input[@data-testid='traveller-4-first-traveller-info-input-box']");
	private By pass5last = By.xpath("//input[@data-testid='traveller-4-last-traveller-info-input-box']");
	private By pass6first = By.xpath("//input[@data-testid='traveller-5-first-traveller-info-input-box']");
	private By pass6last = By.xpath("//input[@data-testid='traveller-5-last-traveller-info-input-box']");
	private By pass7first = By.xpath("//input[@data-testid='first-traveller-0-infant-information']");
	private By pass7last = By.xpath("//input[@data-testid='last-traveller-0-infant-information']");
	private By pass8first = By.xpath("//input[@data-testid='first-traveller-1-infant-information']");
	private By pass8last = By.xpath("//input[@data-testid='last-traveller-1-infant-information']");
	
	private By default1 = By.xpath("//div[@class='css-1dbjc4n r-14lw9ot r-11u4nky r-z2wwpe r-1phboty r-rs99b7 r-1loqt21 r-1ugchlj r-1777fci r-ymttw5 r-5njf8e r-1otgn73 r-19554kt r-184en5c']");
	private By select2 = By.xpath("(//div[@class='css-76zvg2 r-homxoj r-poiln3 r-ubezar'])[2]");
	private By selectopt1 = By.xpath("//div[text()='Miss']");
	private By selectopt2 = By.xpath("//div[text()='Master']");
	private By title1 = By.xpath("(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep'])[4]");
	private By travel1 = By.xpath("(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep'])[5]"); 
	private By title2 = By.xpath("(//div[@data-testid='title-traveller-1-infant-information'])[1]");
	private By travel2 = By.xpath("(//div[@data-testid='title-traveller-1-infant-information'])[2]");
	private By pick1 = By.xpath("(//div[@class='css-76zvg2 r-homxoj r-poiln3 r-ubezar'])[1]"); 
	private By pick2 = By.xpath("(//div[@class='css-76zvg2 r-homxoj r-poiln3 r-ubezar'])[3]");
	private By dob = By.xpath("//input[@class='css-1cwyjr8 r-homxoj r-13awgt0 r-poiln3 r-ubezar r-ur6pnr r-10paoce r-1e081e0 r-9qu9m4 r-1kneemv']");
	private By year = By.xpath("//div[text()='2024']");
	private By month = By.xpath("//div[text()='Jan']");
	private By date = By.xpath("//div[text()='8']");
	private By justbtn = By.xpath("//div[text()='Miss KARISHMA SHREE']");
	private By continue1 = By.xpath("//div[@data-testid='traveller-info-continue-cta']");
			
			
			
			
			
			
			
			
			
	public List<WebElement> Tickbox() {return driver.findElements(passphone);}

	public WebElement City() {return driver.findElement(city);}
	public WebElement Infobtn() {return driver.findElement(infobtn);}


	public WebElement P1First() {return driver.findElement(pass1first);}
	public WebElement P1Last() {return driver.findElement(pass1last);}
	public WebElement P2First() {return driver.findElement(pass2first);}
	public WebElement P2Last() {return driver.findElement(pass2last);}
	public WebElement P3First() {return driver.findElement(pass3first);}
	public WebElement P3Last() {return driver.findElement(pass3last);}
	public WebElement P4First() {return driver.findElement(pass4first);}
	public WebElement P4Last() {return driver.findElement(pass4last);}
	public WebElement P5First() {return driver.findElement(pass5first);}
	public WebElement P5Last() {return driver.findElement(pass5last);}
	public WebElement P6First() {return driver.findElement(pass6first);}
	public WebElement P6Last() {return driver.findElement(pass6last);}
	public WebElement P7First() {return driver.findElement(pass7first);}
	public WebElement P7Last() {return driver.findElement(pass7last);}
	public WebElement P8First() {return driver.findElement(pass8first);}
	public WebElement P8Last() {return driver.findElement(pass8last);}
	
	public WebElement Default() {return driver.findElement(default1);}
	public WebElement Select2() {return driver.findElement(select2);}
	public WebElement Selectop1() {return driver.findElement(selectopt1);}
	public WebElement Selectop2() {return driver.findElement(selectopt2);}
	public WebElement Title1() {return driver.findElement(title1);}
	public WebElement Title2() {return driver.findElement(title2);}
	public WebElement Travel1() {return driver.findElement(travel1);}
	public WebElement Travel2() {return driver.findElement(travel2);}
	public WebElement Pick1() {return driver.findElement(pick1);}
	public WebElement Pick2() {return driver.findElement(pick2);}
	public WebElement Birth() {return driver.findElement(dob);}
	public WebElement Year() {return driver.findElement(year);}
	public WebElement Month() {return driver.findElement(month);}
	public WebElement Date() {return driver.findElement(date);}
	public WebElement Justbtn() {return driver.findElement(justbtn);}
	public WebElement Con() {return driver.findElement(continue1);}

}
