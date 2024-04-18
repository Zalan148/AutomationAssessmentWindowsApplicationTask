package pages;

import org.notepad.Hooks;
import org.openqa.selenium.Keys;

public class EditMenuPage {
    public void enterCities() {
        Hooks.driver.findElementByName("Text editor").sendKeys("Paris");
        Hooks.driver.findElementByName("Text editor").sendKeys(Keys.RETURN);
        Hooks.driver.findElementByName("Text editor").sendKeys("London");
        Hooks.driver.findElementByName("Text editor").sendKeys(Keys.RETURN);
        Hooks.driver.findElementByName("Text editor").sendKeys("New York");
    }

    public void clickEdit() {
        Hooks.driver.findElementByName("Edit").click();
    }

    public void selectFind() {
        Hooks.driver.findElementByName("Find").click();
    }

    public void performSearch() {
        Hooks.driver.findElementByName("Find").click();
        int counter = 0;
        while (counter < 7)
        {
            Hooks.driver.findElementByName("Find").sendKeys(Keys.BACK_SPACE);
            counter = counter + 1;
        }

        Hooks.driver.findElementByName("Find").sendKeys("Dubai");
        Hooks.driver.findElementByName("Find").sendKeys(Keys.RETURN);
    }

    public void selectDateTime() {
        Hooks.driver.findElementByName("Time/Date").click();
    }
}
