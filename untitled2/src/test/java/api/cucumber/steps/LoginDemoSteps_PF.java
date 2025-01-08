package api.cucumber.steps;
import api.cucumber.PageFactory.LoginPage_PF;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginDemoSteps_PF {
    WebDriver driver = null;
    LoginPage_PF login;

    @Given("browser is open")
    public void browser_is_open() {
        System.out.println("I am inside LoginDemoSteps_PF class ==");
        System.out.println("Inside Step - browser is open");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @And("user is on login page")
    public void user_is_on_login_page() {
        driver.navigate().to("https://demo.applitools.com/");
    }
    @When("user enters (.*) and (.*)$")
    public void userEntersUsernameAndPassword(String username, String password)  {
        login= new LoginPage_PF(driver);
        login.enterUsername(username);  // Enter username
        login.enterPassword(password);  // Enter password
    }
    @And("user clicks on login")
    public void user_clicks_on_login() {
        login.clickLogin();
    }
    @Then("user is navigated to the home page")
    public void user_is_navigated_to_the_home_page(){
        System.out.println("user_is_navigated_to_the_home_page");
    }
}
