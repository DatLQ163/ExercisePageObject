package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterPage {
    WebDriver driver = new ChromeDriver();
    // Locators
    private By txtEmail = By.xpath("//input[@id='email']");
    private By txtPassword = By.xpath("//input[@id='password']");
    private By txtConfirmPassword = By.xpath("//input[@id='confirmPassword']");
    private By txtPassport = By.xpath("//input[@id='pid']");
    private By lblErrormessage = By.xpath("//label[@class='validation-error']");

    // Elements
    private WebElement getTxtEmail(){
        return driver.findElement(txtEmail);
    }
    private WebElement getTxtPassword(){
        return driver.findElement(txtPassport);
    }
    private WebElement getTxtConfirmPassword(){
        return driver.findElement(txtConfirmPassword);
    }
    private WebElement getTxtPassport(){
        return driver.findElement(txtPassport);
    }
    private WebElement getLblErrormessage(){
        return driver.findElement(lblErrormessage);
    }

    //Methods
    public void register(String email,String password,String confirmpassword ,String passport){
//        enterEmail(email);
//        enterPassword(password);
//        enterConfirmPassword(confirmpassword);
//        enterPassport(passport);

    }
}
