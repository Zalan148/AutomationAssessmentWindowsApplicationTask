package org.notepad;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.ViewMenuPage;

public class ViewStepdefs {

    ViewMenuPage viewMenuPage = new ViewMenuPage();

    @When("I click View")
    public void iClickView() {
        viewMenuPage.clickView();
    }

    @Then("I can select Highlight from the menu options")
    public void iCanSelectHighlightFromTheMenuOptions() {
        Assert.assertTrue(Hooks.driver.findElementByName("Highlight").isDisplayed());
    }
}
