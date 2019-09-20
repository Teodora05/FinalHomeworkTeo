package PositiveTests;

import methods.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.logging.Logger;
import  Logs.UtilsLogs;
import pages.OwnersPage;
import After.Before.BaseClass;


public class PetClinicTest extends BaseClass {

    OwnersPageMethods ownersPageMethods;
    HomePageMethods homePageMethods;
    VeterinariansPageMethods veterinariansPageMethods;
    PetTypesMethods petTypesMethods;
    SpecialtiesPageMethods specialtiesPageMethods;


    String pathPetClinicLogFile = System.getProperty("user.dir") + "/logs/PetClinic_LogFilePositive.log";
    Logger PetClinicLogger = UtilsLogs.createLogger(pathPetClinicLogFile);





    @Test
    public void HomeTest(){
        /*  GIVEN the user is on PetClinic Home page
                THEN he checks it exists "Welcome to Petclinic" text
                AND  he checks the pet image is displayed
                AND  he checks the spring image is displayed

         */
        homePageMethods = new HomePageMethods(driver);

        homePageMethods.clickHomePage();
        Assert.assertEquals(homePageMethods.getWelcomeMessage(),"Welcome to Petclinic");
        Assert.assertTrue(homePageMethods.petImageIsDisplayed());
        Assert.assertTrue((homePageMethods.springImageIsDisplayed()));


    }


    /* GIVEN the user is on Owner page
           WHEN he enter FirstName, LastName, Address, City and Telephone
                THEN the Add Owner button is displayed
     */

    @Test
    public void createOwnersTest(){
        ownersPageMethods = new OwnersPageMethods(driver);

        PetClinicLogger.info("CLICKING ON DROPDOWN OWNERS BUTTON");
        ownersPageMethods.clickDropDownOwners();
        PetClinicLogger.info("CLICKING ON ADD NEW OWNERS ");
        ownersPageMethods.addNewOwners();
        PetClinicLogger.info("ADD Name");
        ownersPageMethods.generateFirstName();
        PetClinicLogger.info("ADD LastName");
        ownersPageMethods.generateLastName();
        PetClinicLogger.info("ADD Address");
        ownersPageMethods.generateAddress();
        PetClinicLogger.info("ADD City");
        ownersPageMethods.generateCity();
        PetClinicLogger.info("ADD Telephone");
        ownersPageMethods.generateTelephone();
        PetClinicLogger.info("CLICKING ON ADD OWNER");
        ownersPageMethods.clickOnAddOwner();
        PetClinicLogger.info("ASSERT-BUTTON ADD OWNER IS DISPALYED");
        Assert.assertTrue(ownersPageMethods.buttonAddOwnerIsDisplayed());

    }


    /* GIVEN the user is on Veterinarians Page
           WHEN he enter FirstName, LastName and Type
                THEN the Save Vet button is displayed
     */

    @Test
    public void createVeterinariansTest(){
        veterinariansPageMethods = new VeterinariansPageMethods(driver);
        PetClinicLogger.info("CLICKING ON DROPDOWN VETERINARIANS BUTTON");
        veterinariansPageMethods.clickDropDownVeterinarians();
        PetClinicLogger.info("CLICKING ON ADD NEW VETERINARIANS ");
        veterinariansPageMethods.addNewVeterinarians();
        PetClinicLogger.info("ADD Name");
        veterinariansPageMethods.generateFirstName();
        PetClinicLogger.info("ADD laSTName");
        veterinariansPageMethods.generateLastName();
        PetClinicLogger.info("CLICKING ON SELECT DROPDOWN VETERINARIANS");
        veterinariansPageMethods.selectDropDownVeterinarians();
        PetClinicLogger.info("CLICKING ON SAVE VET BUTTON");
        veterinariansPageMethods.clickOnSaveVet();
        PetClinicLogger.info("ASSERT-BUTTON SAVE VET IS DISPALYED");
        Assert.assertTrue(veterinariansPageMethods.saveVetButtonIsDisplayed());

    }



    /* GIVEN the user is on Pet Types Page
           WHEN add Name
                THEN the new PetType is successfully added
     */

    @Test
    public void petTypesTest() throws InterruptedException {
        petTypesMethods = new PetTypesMethods(driver);
        PetClinicLogger.info("CLICKING ON NAV PETTYPES BUTTON");
        petTypesMethods.clickOnNavPetTypes();
        PetClinicLogger.info("CLICKING ON ADD NEW PET TYPE");
        petTypesMethods.addNewPetType();
        PetClinicLogger.info("ADD PET TYPE Name");
        petTypesMethods.addPetTypeName();
        PetClinicLogger.info("CLICKING ON SAVE PET TYPE BUTTON");
        petTypesMethods.savePetType();
        PetClinicLogger.info("ASSERT-NEW PET TYPE IS SUCCESSFULLY ADDED");
        Assert.assertTrue(petTypesMethods.getPetTypesList());
        Thread.sleep(5000);
       // PetClinicLogger.info("CLICKING ON DELTE BUTTON");
       // petTypesMethods.deletePetTypesList();



    }

    /* GIVEN the user is on Specialties Page
           WHEN add Name
                THEN the new Specialty is successfully added
     */

    @Test
    public void specialtiesTest() {
        specialtiesPageMethods = new SpecialtiesPageMethods(driver);
        PetClinicLogger.info("CLICKING ON NAV SPECIALTIES BUTTON");
        specialtiesPageMethods.clickOnNavSpecialties();
        PetClinicLogger.info("CLICKING ON ADD NEW SPECIALTIES ");
        specialtiesPageMethods.addNewSpecialties();
        PetClinicLogger.info("ADD SPECIALTIES Name");
        specialtiesPageMethods.addSpecialtiesName();
        PetClinicLogger.info("CLICKING ON SAVE SPECIALTIES BUTTON");
        specialtiesPageMethods.saveSpecialties();
        PetClinicLogger.info("ASSERT-NEW PET SPECIALTY IS SUCCESSFULLY ADDED");
        Assert.assertTrue(specialtiesPageMethods.getSpecialtiesList());

    }

}
