package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class VeterinariansPage {
    public WebDriver driver;


    public VeterinariansPage(WebDriver driver) {
        this.driver = driver;
    }

    private  By dropDownVeterinarians = By.cssSelector("li:nth-child(3)");
    private  By addVeterinarians = By.cssSelector(".open li:nth-child(2) span:nth-child(2)");
    private  By firstName = By.id("firstName");
    private  By lastName = By.id("lastName");
    private  By btnSaveVet = By.cssSelector(".btn:nth-child(3)");

    public WebDriver getDriver() {
        return driver;
    }

    public By getDropDownVeterinarians() {
        return dropDownVeterinarians;
    }

    public By getAddVeterinarians() {
        return addVeterinarians;
    }

    public By getFirstName() {
        return firstName;
    }

    public By getLastName() {
        return lastName;
    }

    public By getBtnSaveVet() {
        return btnSaveVet;
    }
}
