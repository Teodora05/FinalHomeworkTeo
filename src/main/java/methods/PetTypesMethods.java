package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.PetTypesPage;

import java.util.List;

public class PetTypesMethods extends PetTypesPage {
    PetTypesPage petTypesPage = new PetTypesPage(driver);

    public PetTypesMethods(WebDriver driver) {
        super(driver);
    }

    public void clickOnNavPetTypes() {
        driver.findElement(petTypesPage.getNavPetTypes()).click();

    }

    public void addNewPetType() {
        driver.findElement(petTypesPage.getAddPetType()).click();
    }

    public void addPetTypeName() {
        driver.findElement(petTypesPage.getAddName()).sendKeys("Papagal");
    }

    public  void addPetTypeNameSpecialCharcters(){driver.findElement(petTypesPage.getAddName()).sendKeys("----???@@@@");}

    public void savePetType() {
        driver.findElement(petTypesPage.getBtnSave()).click();
    }


    public boolean getPetTypesList() {
        List<WebElement> petTypes = driver.findElements(By.cssSelector("#pettypes tbody td:first-child input"));
        boolean check = false;
        for (WebElement type: petTypes){
            if(type.getAttribute("value").contains("Papagal")){
                check = true;

            }
        }
        return check;
    }

    public void deletePetTypesList() throws InterruptedException {
        List<WebElement> petTypes = driver.findElements(By.cssSelector("#pettypes tbody td:first-child input"));


        for (int i = 0; i<petTypes.size();i++){
            if(petTypes.get(i).getAttribute("value").contains("Papagal")){
                System.out.println(petTypes.get(i).getAttribute("value"));
                Thread.sleep(5000);
               driver.findElement(By.cssSelector("tbody tr:nth-child("+(i)+") td:nth-child(2) button:nth-child(2)")).click();

            }
        }

    }


}
