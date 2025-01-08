package api.cucumber.PageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import java.util.List;

public class LoginPage_PF {

    @FindBy(id = "username")
    private WebElement txt_username;

    @FindBy(id = "password")
    private WebElement txt_password;

    @FindBy(id = "log-in")
    private WebElement btn_login;

    /*@FindBy(partialLinkText = "sangeeta")
    private List<WebElement> myLinks;
     @FindBy(how = How.ID, using = "username")
    private WebElement abc;*/

    private WebDriver driver;

    public LoginPage_PF(WebDriver driver) {
        this.driver = driver;
        AjaxElementLocatorFactory factory= new AjaxElementLocatorFactory(driver,10);
        PageFactory.initElements(factory, this);
        //PageFactory.initElements( new AjaxElementLocatorFactory(driver,10), this);
    }

    public void enterUsername(String username) {
        txt_username.sendKeys(username);
    }

    public void enterPassword(String password) {
        txt_password.sendKeys(password);
    }

    public void clickLogin() {
        btn_login.click();
    }

}