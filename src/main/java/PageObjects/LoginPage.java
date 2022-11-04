package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
    WebDriver driver = new ChromeDriver();
    // Locators
    private By txtUsername = By.xpath("//input[@id='username']");
    private By txtPassword = By.xpath("//input[@id='password']");
    private By btnLogin = By.xpath("//input[@type='submit']");
    private By lblErrormessage = By.xpath("//label[@class='validation-error']");

    // Elements
    private WebElement getTxtUsername(){

        return driver.findElement(txtUsername);
    }
    private WebElement getTxtPassword(){

        return driver.findElement(txtPassword);
    }
    private WebElement getBtnLogin(){

        return driver.findElement(btnLogin);
    }
    private WebElement getLblErrormessage(){
        return driver.findElement(lblErrormessage);
    }

    // Methods
    public void login(String username, String password){
//        enterUsername(username);
//        enterPassword(password);
//        clickLoginButton();
    }
}
