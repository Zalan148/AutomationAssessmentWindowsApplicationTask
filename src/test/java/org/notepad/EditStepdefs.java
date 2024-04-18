package org.notepad;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.EditMenuPage;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class EditStepdefs {

    EditMenuPage editMenuPage = new EditMenuPage();

    @And("I enter three cities on separate lines")
    public void iEnterThreeCitiesOnSeparateLines() {
        editMenuPage.enterCities();
    }

    @When("I click Edit")
    public void iClickEdit() {
        editMenuPage.clickEdit();
    }

    @And("I select Find from the menu options")
    public void iSelectFindFromTheMenuOptions() {
        editMenuPage.selectFind();
    }

    @And("I perform a search for a city not entered")
    public void iPerformASearchForACityNotAlreadyEntered() {
        editMenuPage.performSearch();
    }

    @Then("a notice is displayed to say cannot find the city entered")
    public void aNoticeIsDisplayedToSayThatCityHasNotBeenEntered() {
        Assert.assertTrue(Hooks.driver.findElementByName("Cannot find \"Dubai\"").isDisplayed());
        Hooks.driver.findElementByName("OK").click();
        Hooks.clearTextEditor();
    }

    @And("I select TimeDate from the menu options")
    public void iSelectTimeDateFromTheMenuOptions() {
        editMenuPage.selectDateTime();
    }

    @Then("current Time and Date is displayed")
    public void timeAndDateIsDisplayed() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HHmm ddMMyyyy");
        LocalDateTime now = LocalDateTime.now();
        //System.out.println(dtf.format(now));
        Assert.assertTrue(Hooks.driver.findElementByName(dtf.format(now)).isDisplayed());
        Hooks.clearTextEditor();
    }

}
