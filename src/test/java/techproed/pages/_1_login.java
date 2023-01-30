package techproed.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class _1_login {

    public  _1_login(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(name ="username")
    public WebElement usernamelocade;

    @FindBy(name = "password")
    public WebElement passwordlocade;

    @FindBy(xpath = "//*[@type='submit']")
    public WebElement loginbutonu;

}
