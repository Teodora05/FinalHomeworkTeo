package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.SpecialtiesPage;

import java.util.List;

public class SpecialtiesPageMethods extends SpecialtiesPage {
    public SpecialtiesPageMethods(WebDriver driver) {
        super(driver);
    }

    JavaFakerAPI javaFakerAPI = new JavaFakerAPI();
    SpecialtiesPage specialtiesPage = new SpecialtiesPage(driver);

    public void clickOnNavSpecialties() {
        driver.findElement(specialtiesPage.getNavSpecialties()).click();

    }

    public void addNewSpecialties() {
        driver.findElement(specialtiesPage.getAddSpecialties()).click();
    }


    public void addSpecialtiesName() {
        driver.findElement(specialtiesPage.getAddName()).sendKeys(javaFakerAPI.specialtiesName);
    }

    public  void addSpecialtiesNameSpecialCharcters(){driver.findElement(specialtiesPage.getAddName()).sendKeys("----???!!!!!!!!!!!!!!!&^&%@@@@");}

    public void saveSpecialties() {
        driver.findElement(specialtiesPage.getBtnSave()).click();
    }


    public boolean getSpecialtiesList() {
        List<WebElement> specialtiesList = driver.findElements(By.cssSelector("#specialties tbody td:first-child input"));

        boolean check = false;

        for (WebElement specialty: specialtiesList){

            if(specialty.getAttribute("value").contains(javaFakerAPI.specialtiesName)){

                check = true;
            }
        }
        return check;
    }

}
