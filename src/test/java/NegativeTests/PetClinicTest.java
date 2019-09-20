package NegativeTests;

import After.Before.BaseClass;
import Logs.UtilsLogs;
import methods.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.PetTypesPage;

import java.util.logging.Logger;

public class PetClinicTest extends BaseClass {

    String pathPetClinicLogFile = System.getProperty("user.dir") + "/logs/PetClinic_LogFileNegative.log";
    Logger PetClinicLogger = UtilsLogs.createLogger(pathPetClinicLogFile);


    PetTypesMethods petTypesMethods;
    SpecialtiesPageMethods specialtiesPageMethods;



        /* GIVEN the user is on Pet Types Page
           WHEN add Name with special charcters
                THEN the new PetType is successfully added with special charcters with no Error message.
     */

    @Test
    public void petTypesNegativeTest() {
        petTypesMethods = new PetTypesMethods(driver);
        PetClinicLogger.info("CLICKING ON NAV PETTYPES BUTTON");
        petTypesMethods.clickOnNavPetTypes();
        PetClinicLogger.info("CLICKING ON ADD NEW PET TYPE");
        petTypesMethods.addNewPetType();
        PetClinicLogger.info("ADD PET TYPE Name Special Charcters");
        petTypesMethods.addPetTypeNameSpecialCharcters();
        PetClinicLogger.info("CLICKING ON SAVE PET TYPE BUTTON");
        petTypesMethods.savePetType();
        PetClinicLogger.info("ASSERT-NEW PET TYPE IS SUCCESSFULLY ADDED");
        Assert.assertTrue(petTypesMethods.getPetTypesList());

    }

            /* GIVEN the user is on Specialties Page
           WHEN add Name with special charcters
                THEN the new Specialty is successfully added with special charcters with no Error message.
     */


    @Test
    public void specialtiesNegativeTest()  {
        specialtiesPageMethods = new SpecialtiesPageMethods(driver);
        PetClinicLogger.info("CLICKING ON NAV SPECIALTIES BUTTON");
        specialtiesPageMethods.clickOnNavSpecialties();
        PetClinicLogger.info("CLICKING ON ADD NEW SPECIALTIES ");
        specialtiesPageMethods.addNewSpecialties();
        PetClinicLogger.info("ADD SPECIALTIES Name SPECIAL CHARCTERS");
        specialtiesPageMethods.addSpecialtiesNameSpecialCharcters();
        PetClinicLogger.info("CLICKING ON SAVE SPECIALTIES BUTTON");
        specialtiesPageMethods.saveSpecialties();
        PetClinicLogger.info("ASSERT-NEW PET SPECIALTY IS SUCCESSFULLY ADDED");
        Assert.assertTrue(specialtiesPageMethods.getSpecialtiesList());

    }


}
