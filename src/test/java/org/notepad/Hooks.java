package org.notepad;

import io.appium.java_client.windows.WindowsDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Hooks {
    public static WindowsDriver driver;
    @Before
    public void setup() throws MalformedURLException{
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("app", "C:\\Windows\\System32\\notepad.exe");
        cap.setCapability("platformName", "Windows");
        cap.setCapability("deviceName", "WindowsPC");
        driver = new WindowsDriver(new URL("http://127.0.0.1:4723"), cap);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @After
    public void teardown(){
        driver.quit();
    }

    public static void clearTextEditor(){
        Hooks.driver.findElementByName("Text editor").click();
        Hooks.driver.findElementByName("Edit").click();
        Hooks.driver.findElementByName("Select all").click();
        Hooks.driver.findElementByName("Edit").click();
        Hooks.driver.findElementByName("Delete").click();
    }

}
