package techproed.tests;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages._1_dashboard;
import techproed.pages._1_login;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class orn {

    @Test
    public void test () throws InterruptedException {

        Driver.getDriver().get(ConfigReader.getProperty("open_source_url"));

        _1_login _1_login= new _1_login();

        _1_login.usernamelocade.sendKeys(ConfigReader.getProperty("usernameorn"));

        _1_login.passwordlocade.sendKeys(ConfigReader.getProperty("passwordorn"));

        _1_login.loginbutonu.click();

        _1_dashboard dashboard = new _1_dashboard();

        Assert.assertTrue(dashboard.dashboardlocade.isDisplayed());

        Driver.closeDriver();

    }
}
