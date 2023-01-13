package modals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class BaseModals extends BasePage {

    private final static By SAVE_BUTTON = By.xpath("//button[@class='slds-button slds-button_brand']");
    private final static By SAVE_AND_NEW_BUTTON = By.name("SaveAndNew");
    private final static By CANCEL_BUTTON = By.name("CancelEdit");

    public BaseModals(WebDriver driver) {
        super(driver);
    }

    public void clickSaveButton()   {
        driver.findElement(SAVE_BUTTON).click();
    }

    public void clickSаveAndNuwButton() {
        driver.findElement(SAVE_AND_NEW_BUTTON).click();
    }

    public void clickCancelButton() {
        driver.findElement(CANCEL_BUTTON).click();
    }
}
