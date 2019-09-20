package methods;

import org.openqa.selenium.WebDriver;
import pages.HomePage;

public class HomePageMethods extends HomePage {

    HomePage homePage = new HomePage(driver);

    public HomePageMethods(WebDriver driver) {
        super(driver);
    }

    public void clickHomePage() {
        driver.findElement(homePage.getClickOnHomePage()).click();
    }

    public String getWelcomeMessage() {
        return driver.findElement(homePage.getWelcomeText()).getText();
    }

    public boolean petImageIsDisplayed() {
        return driver.findElement(homePage.getPetImage()).isDisplayed();
    }

    public boolean springImageIsDisplayed() {
        return driver.findElement(homePage.getSpringImage()).isDisplayed();
    }


}
