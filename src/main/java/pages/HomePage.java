package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
   public WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    private By clickOnHomePage = By.cssSelector(".nav > li:nth-child(1)");
    private By welcomeText =By.cssSelector("h1");
    private By petImage =By.cssSelector(".img-responsive");
    private By springImage = By.cssSelector("img:nth-child(2)");

    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public By getClickOnHomePage() {
        return clickOnHomePage;
    }

    public By getWelcomeText() {
        return welcomeText;
    }

    public By getPetImage() {
        return petImage;
    }

    public By getSpringImage() {
        return springImage;
    }
}
