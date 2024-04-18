package org.notepad;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.FileMenuPage;

public class FileStepdefs {

    FileMenuPage fileMenuPage = new FileMenuPage();

    @When("I click File")
    public void iClickFile() {
        fileMenuPage.clickFile();
    }

    @And("I select Open from the menu options")
    public void iSelectOpenFromTheMenuOptions() {
        fileMenuPage.selectOpen();
        
    }

    @Then("Open dialog is displayed")
    public void openDialogIsDisplayed() {
        Assert.assertTrue(Hooks.driver.findElementByName("Items View").isDisplayed());
        Hooks.driver.findElementByName("Cancel").click();
    }

    @And("I select New tab from the menu options")
    public void iSelectNewTabFromTheMenuOptions() {
        fileMenuPage.selectNewTab();
    }

    @Then("a new tab is opened")
    public void aNewTabIsOpened() {
        Hooks.driver.findElementByName("Close Tab").click();
        Assert.assertTrue(Hooks.driver.findElementByName("Untitled").isDisplayed());
    }

    @Given("notepad is launched")
    public void notepadIsLaunched() {
        fileMenuPage.notepadLaunched();
    }
}
