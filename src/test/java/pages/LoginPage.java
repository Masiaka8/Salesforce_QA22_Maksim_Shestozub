package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{
    private final static By USER_NAME_LOCATOR= By.id("username");
    private By PASSWORD_INPUT_LOCATOR = By.id("password");
    private By LOGIN_BUTTON_LOCATOR = By.id("Login");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @Step
    public void clickLoginButton() {
        driver.findElement(LOGIN_BUTTON_LOCATOR).click();
    }

    @Step
    public void setUsername(String username) {
        driver.findElement(USER_NAME_LOCATOR).sendKeys(username);
    }

    @Step
    public void setPassword(String password) {
        driver.findElement(PASSWORD_INPUT_LOCATOR).sendKeys(password);
    }

}
