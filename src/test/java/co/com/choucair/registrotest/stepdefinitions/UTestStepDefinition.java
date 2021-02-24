package co.com.choucair.registrotest.stepdefinitions;

import co.com.choucair.registrotest.model.UTestData;
import co.com.choucair.registrotest.tasks.OpenUp;
import co.com.choucair.registrotest.tasks.SignIn;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class UTestStepDefinition {

    @Before
    public void setStage(){OnStage.setTheStage(new OnlineCast());}

    @Given("^Jorge wants to learn automation$")
    public void jorgeWantsToLearnAutomation(List<UTestData> uTestDataList) {
        OnStage.theActorCalled("Jorge").wasAbleTo(OpenUp.thePage(),
                SignIn.onThePage(uTestDataList.get(0).getFirstName(),uTestDataList.get(0).getLastName(),
                        uTestDataList.get(0).getEmail(), uTestDataList.get(0).getBirthMonth(),
                        uTestDataList.get(0).getBirthday(), uTestDataList.get(0).getBirthYear(),
                        uTestDataList.get(0).getLanguage(), uTestDataList.get(0).getCity(),
                        uTestDataList.get(0).getPostalCode(), uTestDataList.get(0).getCountry(),
                        uTestDataList.get(0).getDevice(), uTestDataList.get(0).getModel(),
                        uTestDataList.get(0).getSystem(), uTestDataList.get(0).getPassword(),
                        uTestDataList.get(0).getConfirmPassword()));
    }

    @When("^Registration is successful$")
    public void registrationIsSuccessful() {

    }

    @Then("^Browse uTest$")
    public void browseUTest() {

    }
}
