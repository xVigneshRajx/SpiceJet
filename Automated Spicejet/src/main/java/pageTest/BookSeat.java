package pageTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BookSeat {
	
	WebDriver driver;
	public BookSeat (WebDriver driver) {this.driver=driver;}
	
	
	private By add = By.xpath("//div[@id='at_addon_close_icon']");
	private By seatbtn = By.xpath("//div[@data-testid='bookingFlow-seats-add-cta']");
	private By seat1 = By.xpath("(//div[@class='css-1dbjc4n r-13ubf1n r-1mnahxq'])[145]");
	private By seat2 = By.xpath("(//div[@class='css-1dbjc4n r-13ubf1n r-1mnahxq'])[146]");
	private By seat3 = By.xpath("(//div[@class='css-1dbjc4n r-13ubf1n r-1mnahxq'])[147]");
	private By seat4 = By.xpath("(//div[@class='css-1dbjc4n r-13ubf1n r-1mnahxq'])[151]");
	private By seat5 = By.xpath("(//div[@class='css-1dbjc4n r-13ubf1n r-1mnahxq'])[152]");
	private By seat6 = By.xpath("(//div[@class='css-1dbjc4n r-13ubf1n r-1mnahxq'])[153]");
	private By seat7 = By.xpath("(//div[@class='css-1dbjc4n r-13ubf1n r-1mnahxq'])[139]");
	private By seat8 = By.xpath("(//div[@class='css-1dbjc4n r-13ubf1n r-1mnahxq'])[140]");
	private By seat9 = By.xpath("(//div[@class='css-1dbjc4n r-13ubf1n r-1mnahxq'])[141]");
	private By seat10 = By.xpath("(//div[@class='css-1dbjc4n r-13ubf1n r-1mnahxq'])[145]");
	private By seat11 = By.xpath("(//div[@class='css-1dbjc4n r-13ubf1n r-1mnahxq'])[146]");
	private By seat12 = By.xpath("(//div[@class='css-1dbjc4n r-13ubf1n r-1mnahxq'])[147]");
	private By continue1 = By.xpath("(//div[@data-testid='add-ons-continue-footer-button'])[3]");
	private By done1 = By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-15bsvpr r-1w50u8q r-ah5dr5 r-1otgn73']");
	
	
	
	public WebElement PreBook() {return driver.findElement(seatbtn);}
	public WebElement  Add() {return driver.findElement(add);} 

	public WebElement Seat1() {return driver.findElement(seat1);}
	public WebElement Seat2() {return driver.findElement(seat2);}
	public WebElement Seat3() {return driver.findElement(seat3);}
	public WebElement Seat4() {return driver.findElement(seat4);}
	public WebElement Seat5() {return driver.findElement(seat5);}
	public WebElement Seat6() {return driver.findElement(seat6);}
	public WebElement Seat7() {return driver.findElement(seat7);}
	public WebElement Seat8() {return driver.findElement(seat8);}
	public WebElement Seat9() {return driver.findElement(seat9);}
	public WebElement Seat10() {return driver.findElement(seat10);}
	public WebElement Seat11() {return driver.findElement(seat11);}
	public WebElement Seat12() {return driver.findElement(seat12);}
	public WebElement Continue() {return driver.findElement(continue1);}
	public WebElement Done() {return driver.findElement(done1);}

}
