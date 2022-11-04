package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Timetable {
    WebDriver driver = new ChromeDriver();
    // Locators
    private By rowTicketInfo = By.cssSelector(".MyTable tr:not(.TableSmallHeader)");
    private By lkCheckPrice = By.xpath("//a[.= 'check price']");
    private By lkBookTicket = By.xpath("//a[.= 'book ticket']");

    // Elements
    private WebElement getRowTicketInfo(){
        return driver.findElement(rowTicketInfo);
    }
    private WebElement getLkCheckPrice(){
        return driver.findElement(lkCheckPrice);
    }
    private WebElement getLkBookTicket(){
        return driver.findElement(lkBookTicket);
    }

    // Methods
    public void checkLink(){
//        clickOnCheckPrice();
//        clickOnBookTicket();
    }
}
