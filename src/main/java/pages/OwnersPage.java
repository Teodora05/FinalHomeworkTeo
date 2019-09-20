package pages;

import net.bytebuddy.utility.RandomString;
import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class OwnersPage {
   public  WebDriver driver;

    public OwnersPage(WebDriver driver) {
        this.driver = driver;
    }

    private  By dropDownOwnes = By.cssSelector("li:nth-child(2)");
    private  By addOwners = By.cssSelector(".open li:nth-child(2) span:nth-child(2)");
    private  By firstName = By.id("firstName");
    private  By lastName = By.id("lastName");
    private  By address = By.id("address");
    private  By city = By.id("city");
    private  By telephone = By.id("telephone");
    private  By btnAddOwner = By.cssSelector(".btn:nth-child(2)");

 public WebDriver getDriver() {
  return driver;
 }

 public By getDropDownOwnes() {
  return dropDownOwnes;
 }

 public By getAddOwners() {
  return addOwners;
 }

 public By getFirstName() {
  return firstName;
 }

 public By getLastName() {
  return lastName;
 }

 public By getAddress() {
  return address;
 }

 public By getCity() {
  return city;
 }

 public By getTelephone() {
  return telephone;
 }

 public By getBtnAddOwner() {
  return btnAddOwner;
 }
}
