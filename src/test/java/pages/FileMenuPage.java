package pages;

import org.notepad.Hooks;

public class FileMenuPage {
    
    public void clickFile(){
        Hooks.driver.findElementByName("File").click();
    }

    public void selectOpen() {
        Hooks.driver.findElementByName("Open").click();
    }

    public void selectNewTab() {
        Hooks.driver.findElementByName("New tab").click();
    }

    public void notepadLaunched() {
        Hooks.driver.findElementByName("Untitled - Notepad").isDisplayed();
    }
}
