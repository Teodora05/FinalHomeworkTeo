package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class PetTypesPage {

    public WebDriver driver;


    public PetTypesPage(WebDriver driver) {
        this.driver = driver;
    }

    private By navPetTypes = By.cssSelector("li:nth-child(4)");
    private By addPetType = By.cssSelector("div > .btn:nth-child(2)");
    private By addName = By.cssSelector("#name");
    private  By btnSave = By.cssSelector(".btn:nth-child(3)");

    public WebDriver getDriver() {
        return driver;
    }

    public By getNavPetTypes() {
        return navPetTypes;
    }

    public By getAddPetType() {
        return addPetType;
    }

    public By getAddName() {
        return addName;
    }

    public By getBtnSave() {
        return btnSave;
    }
}
