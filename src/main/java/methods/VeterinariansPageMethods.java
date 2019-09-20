package methods;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import pages.VeterinariansPage;

public class VeterinariansPageMethods extends VeterinariansPage {

    public VeterinariansPageMethods(WebDriver driver) {
        super(driver);
    }

   JavaFakerAPI javaFakerAPI = new JavaFakerAPI();
    VeterinariansPage veterinariansPage = new VeterinariansPage(driver);


    public void clickDropDownVeterinarians() {
        driver.findElement(veterinariansPage.getDropDownVeterinarians()).click();
    }

    public void addNewVeterinarians() {
        driver.findElement(veterinariansPage.getAddVeterinarians()).click();
    }

    public void generateFirstName() {
        driver.findElement(veterinariansPage.getFirstName()).sendKeys(javaFakerAPI.getFirstName());
    }

    public void generateLastName() {
        driver.findElement(veterinariansPage.getLastName()).sendKeys(javaFakerAPI.getLastName());
    }

    public void selectDropDownVeterinarians() {
        Select drpVet = new Select(driver.findElement(By.name("specialties")));
        drpVet.selectByVisibleText("surgery");


    }

    public void clickOnSaveVet() {
        driver.findElement(veterinariansPage.getBtnSaveVet()).click();
    }

    public boolean saveVetButtonIsDisplayed(){
      return  driver.findElement(veterinariansPage.getBtnSaveVet()).isDisplayed();
    }


}
