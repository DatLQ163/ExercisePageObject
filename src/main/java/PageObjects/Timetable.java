package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Timetable {
    WebDriver driver = new ChromeDriver();
    // Locators
    private By rowTicketInfor = By.cssSelector(".MyTable tr:not(.TableSmallHeader)");
    private By lkCheckPrice = By.
}
