package pages;

import org.notepad.Hooks;

public class ViewMenuPage {
    public void clickView() {
        Hooks.driver.findElementByName("View").click();
    }

}
