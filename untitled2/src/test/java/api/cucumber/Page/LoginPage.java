package api.cucumber.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageee {
    private WebDriver driver;
    private By txt_username = By.id("username");
    private By txt_password = By.id("password");
    private By btn_login = By.id("log-in");
  private String HomePage;

    public LoginPage(WebDriver driver) {
        this.driver = driver;

    }

    public void enterUsername(String username) {
        driver.findElement(txt_username).sendKeys(username);
    }

    // Method to enter the password
    public void enterPassword(String password) {
        driver.findElement(txt_password).sendKeys(password);
    }


    public void clickLogin() {
        driver.findElement(btn_login).click();
    }

    public  boolean navigatingToHomePage() {
        return true;
    }
}


