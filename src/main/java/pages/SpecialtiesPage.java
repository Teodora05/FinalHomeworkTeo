package pages;

import methods.JavaFakerAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.sql.SQLOutput;
import java.util.List;

public class SpecialtiesPage {
    public WebDriver driver;


    public SpecialtiesPage(WebDriver driver) {
        this.driver = driver;
    }

    private By navSpecialties = By.cssSelector("li:nth-child(5)");
    private By addSpecialties = By.cssSelector("div > .btn:nth-child(2)");
    private By addName = By.id("name");
    private By btnSave = By.cssSelector(".btn:nth-child(3)");

    public WebDriver getDriver() {
        return driver;
    }

    public By getNavSpecialties() {
        return navSpecialties;
    }

    public By getAddSpecialties() {
        return addSpecialties;
    }

    public By getAddName() {
        return addName;
    }

    public By getBtnSave() {
        return btnSave;
    }
}
