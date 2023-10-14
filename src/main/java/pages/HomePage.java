package pages;

import org.openqa.selenium.By;

import org.testng.Assert;
import utilities.BaseClass;

public class HomePage extends BaseClass {

    public final static By countryClick = By.cssSelector("#country-name");
    public final static By ksaButton = By.xpath("//a[@id='sa']");
    public final static By kuwaitButton = By.xpath("//a[@id='kw']");
    public final static By bahrainButton = By.xpath("//a[@id='bh']");
    public final static By languageButton = By.xpath("//a[@id='translation-btn']");
    public final static By liteLogo = By.id("name-lite");
    public final static By classicLogo = By.id("name-classic");
    public final static By premiumLogo = By.id("name-premium");
    public final static By litePrice = By.xpath("//div[@id='currency-lite']/b");
    public final static By classicPrice = By.xpath("//div[@id='currency-classic']/b");
    public final static By premiumPrice = By.xpath("//div[@id='currency-premium']/b");
    public final static By liteCurrency = By.xpath("//div[@id='currency-lite']/i");
    public final static By classicCurrency = By.xpath("//div[@id='currency-premium']/i");
    public final static By premiumCurrency = By.xpath("//div[@id='currency-premium']/i");

    String url = "https://subscribe.stctv.com/sa-en";

    public void elementValueAssertion(By locator, String validator) throws Exception {

        String text = driver.findElement(locator).getText();
        Assert.assertEquals(text, validator);
    }

    public void chooseCountry(String country) {

        wait.waitForElementToBeVisible(countryClick);
        driver.findElement(countryClick).click();
        if (country.equalsIgnoreCase("KSA") ) {
            driver.findElement(ksaButton).click();
        } else if (country.equalsIgnoreCase("KW")){
            driver.findElement(kuwaitButton).click();
        } else if (country.equalsIgnoreCase("BH")) {
            driver.findElement(bahrainButton).click();
        }
    }

    public void switchLanguage() {
        driver.findElement(languageButton).click();
    }

    public void loadPage() {
        driver.get(url);
    }

}
