package After.Before;

import Logs.UtilsLogs;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.logging.Logger;

public class BaseClass {
   public WebDriver driver;
    private String baseUrl ="http://bhdtest.endava.com/petclinic/owners";
    String pathPetClinicLogFile = System.getProperty("user.dir") + "/logs/PetClinic_LogFilePositive.log";
    Logger PetClinicLogger = UtilsLogs.createLogger(pathPetClinicLogFile);

    @BeforeMethod
    public void beforeMethod(){
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/config/chromedriver.exe");
        driver= new ChromeDriver();



        // driver.get("http://bhdtest.endava.com/petclinic/owners");
        driver.get(baseUrl);
        driver.manage().window().maximize();

        PetClinicLogger.info("Opening the site at :http://bhdtest.endava.com/petclinic/owners ");

    }

    @AfterMethod
    public void afterMethod(){
        //driver.quit();
    }
}
