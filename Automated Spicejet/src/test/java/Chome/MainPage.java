package Chome;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.io.Files;

import pageTest.Information;
import pageTest.BookSeat;
import pageTest.Booking;
import pageTest.Login;
import resources.Base;

public class MainPage extends Base {

	public WebDriver driver;
    @Test
    public void loginBase() throws  InterruptedException, IOException {
        driver = initializeDriver();
        driver.get(pro.getProperty("url"));
        
        Login log = new Login(driver);
        Thread.sleep(2000);
        log.Loginbtn().click();
        log.Phone().sendKeys("8610170598");
        log.Password().sendKeys("Hello");
        Thread.sleep(2000);
        log.Loginbtn1().click();
        
        if(log.Failure().isDisplayed()) {
        	log.Phone().sendKeys(Keys.CONTROL + "a");
        	log.Phone().sendKeys(Keys.DELETE);
        	log.Password().sendKeys(Keys.CONTROL + "a");
        	log.Password().sendKeys(Keys.DELETE);
        	
        	Thread.sleep(4000);
        	log.Phone().sendKeys("8610170598");
            log.Password().sendKeys("#Naruto2002");
            File src1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            Files.copy(src1, new File("E:\\Code\\Selenium\\Spicejet.com\\ScreenShot\\1.Login.png"));
            log.Loginbtn1().click();
        }
          
        Booking book = new Booking(driver);
        Actions act = new Actions(driver);
        Thread.sleep(5000);
        act.click(book.RoundTrip()).perform();
        book.From().sendKeys("MAA");
        Thread.sleep(1000);
        book.To().sendKeys("DEL",Keys.ENTER);
        
        Thread.sleep(2000);
        book.Date1().click();
        book.Date2().click();
        book.Passengers().click();
        for (int i = 1;i<4;i++) {
            book.Adultbtn().click();
        }
        int i = 1;
        while(i<=2){
            book.ChildBtn().click();
            book.Infantbtn().click();
            i++;
        }
        book.Donebtn().click();
        
        Assert.assertEquals(book.Check().getText(),"4 Adults, 2 Children, 2 Infants");
        File src2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        Files.copy(src2, new File("E:\\Code\\Selenium\\Spicejet.com\\ScreenShot\\2.Information.png"));
        book.Searchbtn().click();
        
        JavascriptExecutor js = (JavascriptExecutor) driver;
        File src3 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        Files.copy(src3, new File("E:\\Code\\Selenium\\Spicejet.com\\ScreenShot\\3.Check.png"));
        Thread.sleep(6000);
        book.Continue().click();
    
        	Information info = new Information(driver);
        	Thread.sleep(8000);
            info.City().sendKeys("Chennai");
          //String[] texts = {"Vignesh ", "Raj","6482056839","vignesh2002raj@gmail.com"};
            //
            //int loopIterations = info.Tickbox().size() < texts.length ? info.Tickbox().size() : texts.length;
            //for (int j = 0; j < loopIterations; j++) {
            //  info.Tickbox().get(j).sendKeys(texts[j]);
            //}
            File src4 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            Files.copy(src4, new File("E:\\Code\\Selenium\\Spicejet.com\\ScreenShot\\4.Contact.png"));

        	String[] texts = {"9972798419","8672076111","6482056839","9471503592"};
        	info.P1First().sendKeys("Vignesh");
        	info.P1Last().sendKeys("Raj");
        	WebElement input1 = info.Tickbox().get(0);
        	input1.sendKeys(texts[0]);
        	Thread.sleep(2000);
        	info.Infobtn().click();
        	
        	info.P2First().sendKeys("Ram");
        	info.P2Last().sendKeys("Sunder");
        	WebElement input2 = info.Tickbox().get(0);
        	input2.sendKeys(texts[1]);
        	Thread.sleep(2000);
        	info.Infobtn().click();
        	
        	
        	js.executeScript("window.scrollBy(0,100)");
        	info.Default().click();
        	info.Select2().click();
        	info.P3First().sendKeys("Naisha");
        	info.P3Last().sendKeys("Karan");
        	WebElement input3 = info.Tickbox().get(0);
        	input3.sendKeys(texts[2]);
        	Thread.sleep(2000);
        	info.Infobtn().click();
        	
        	info.Default().click();
        	info.Select2().click();
        	js.executeScript("window.scrollBy(0,100)");
        	info.P4First().sendKeys("Priyanka");
        	info.P4Last().sendKeys("Sarala");
        	WebElement input4 = info.Tickbox().get(0);
        	input4.sendKeys(texts[3]);
        	Thread.sleep(2000);
        	info.Infobtn().click();
        	
        	
        	info.Default().click();
        	info.Selectop2().click();
        	info.P5First().sendKeys("Ravi");
        	info.P5Last().sendKeys("Kannan");
        	Thread.sleep(2000);
        	info.Infobtn().click();
        	
        	info.Default().click();
        	info.Selectop1().click();
        	info.P6First().sendKeys("Kavi");
        	info.P6Last().sendKeys("Shree");
        	Thread.sleep(2000);
        	info.Infobtn().click();
        	
        	info.Title1().click();
        	info.Selectop2().click();
        	info.P7First().sendKeys("Saran");
        	info.P7Last().sendKeys("Vel");
        	info.Birth().click();
        	info.Year().click();
        	info.Month().click();
        	info.Date().click();
        	info.Travel1().click();
        	info.Pick1().click();
        	Thread.sleep(2000);
        	info.Infobtn().click();
      	
        	js.executeScript("window.scrollBy(0,100)");
        	info.Title1().click();
        	info.Selectop1().click();
        	info.P8First().sendKeys("Karishma");
        	info.P8Last().sendKeys("Shree");
        	info.Birth().click();
        	info.Year().click();
        	info.Month().click();
        	info.Date().click();
        	info.Travel2().click();
        	info.Pick2().click();
        	js.executeScript("window.scrollBy(0,-300)");
        	info.Justbtn().click();
            File src5 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            Files.copy(src5, new File("E:\\Code\\Selenium\\Spicejet.com\\ScreenShot\\5.Information.png"));
        	Thread.sleep(4000);
        	info.Con().click();
        	
        	BookSeat seat=new BookSeat(driver);
        	Thread.sleep(2000);
//        	seat.Add().click();
        	seat.PreBook().click();
        	Thread.sleep(4000);
        	seat.Seat1().click();
        	seat.Seat4().click();
        	seat.Seat2().click();
        	seat.Seat5().click();
        	seat.Seat3().click();
        	seat.Seat6().click();
        	Thread.sleep(5000);
        	seat.Done().click();
        	js.executeScript("window.scrollBy(0,950)");
        	Thread.sleep(5000);
        	seat.Continue().click();
        	Thread.sleep(4000);
            File src6 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            Files.copy(src6, new File("E:\\Code\\Selenium\\Spicejet.com\\ScreenShot\\6.Payment.png"));
        	
    }


}


