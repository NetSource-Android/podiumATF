package pageobjects.homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import framework.core.BasePage;
import org.openqa.selenium.WebElement;

public class podiumHomePage extends BasePage {

    public podiumHomePage(WebDriver driver) {

        super(driver);
        //maximize window
        driver.manage().window().maximize();

        //goto podium website
        driver.get("https://www.podium.com/");

        //find get started link and click to go to form
        driver.findElement(By.linkText("Get Started")).click();

        //fill out form

        //find firstname field, clear out the text box, and fill in firstname
        WebElement firstName = driver.findElement(By.name("firstName"));
        firstName.clear();
        firstName.sendKeys("Antonio");

        //find lastname field, clear form, fill in lastname
        WebElement lastName = driver.findElement(By.name("lastName"));
        lastName.clear();
        lastName.sendKeys("Franco");
    }
}
