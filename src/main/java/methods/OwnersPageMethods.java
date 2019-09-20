package methods;

import com.github.javafaker.Faker;
import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import pages.OwnersPage;

public class OwnersPageMethods extends OwnersPage {
   JavaFakerAPI javaFakerAPI = new JavaFakerAPI();
   RandomString randomString = new RandomString();
   OwnersPage ownersPage = new OwnersPage(driver);



    public OwnersPageMethods(WebDriver driver) {
        super(driver);
    }

    public void clickDropDownOwners() {
        driver.findElement(ownersPage.getDropDownOwnes()).click();
    }

    public void addNewOwners() {
        driver.findElement(ownersPage.getAddOwners()).click();
    }


    public void generateFirstName() {
        driver.findElement(ownersPage.getFirstName()).sendKeys(javaFakerAPI.getFirstName());
    }

    public void generateLastName() {
        driver.findElement(ownersPage.getLastName()).sendKeys(javaFakerAPI.getLastName());
    }





    public void generateAddress() {
        driver.findElement(ownersPage.getAddress()).sendKeys(randomString.generateRandomAddressMethod(1));
    }

    public void generateCity() {
        driver.findElement(ownersPage.getCity()).sendKeys("Bucuresti");

    }


    public void generateTelephone() {
        driver.findElement(ownersPage.getTelephone()).sendKeys(randomString.generateRandomNumber(10));

    }

    public void clickOnAddOwner() {
        driver.findElement(ownersPage.getBtnAddOwner()).click();
    }

    public boolean buttonAddOwnerIsDisplayed() {
        return driver.findElement(ownersPage.getBtnAddOwner()).isDisplayed();
    }


}
