/*
package api.cucumber.steps;

import api.cucumber.Page.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertTrue;


public class LoginDemoSteps_POM {
    WebDriver driver= null;
    LoginPage login;

    @Given("browser is open")
    public void browser_is_open() {
       System.out.println("=== I am inside browser_is_open =====");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @And("user is on login page")
    public void user_is_on_login_page() {
        driver.navigate().to("https://demo.applitools.com/");

    }

    @When("user enters (.*) and (.*)$")
    public void userEntersUsernameAndPassword(String username, String password) {
         login= new LoginPage(driver);
        login.enterUsername(username);  // Enter username
        login.enterPassword(password);  // Enter password

    }
    @And("user clicks on login")
    public void user_clicks_on_login() {
        login.clickLogin();
    }

    @Then("user is navigated to the home page")
    public void user_is_navigated_to_the_home_page(){
        login= new LoginPage(driver);
        assertTrue(login.navigatingToHomePage());
        driver.quit();
    }



}
*/

