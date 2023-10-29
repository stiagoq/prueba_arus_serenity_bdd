package test.validationshoppingcar.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import test.validationshoppingcar.exception.ShoppingCarExeption;
import test.validationshoppingcar.questions.FilterResult;
import test.validationshoppingcar.task.ClickOnCabeceros;
import test.validationshoppingcar.utils.drivers.MyChromeDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;

import static test.validationshoppingcar.exception.ShoppingCarExeption.THE_TXT_CABECEROS_IS_NOT_VISIBLE;
import static test.validationshoppingcar.utils.constantmanage.ConstantMagane.ACTOR;
import static test.validationshoppingcar.utils.constantmanage.ConstantMagane.URL;

public class Prueba1StepDefinition {

    @Before
    public void SetUp(){
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("User is in the home page")
    public void userIsInTheHomePage() {
        theActorCalled(ACTOR);
        theActorInTheSpotlight().can(BrowseTheWeb.with(MyChromeDriver.chromeHisBrowserWeb().onTheUrl(URL)));
    }
    @When("User selects the product category.")
    public void userSelectsTheProductCategory() {
        theActorInTheSpotlight().wasAbleTo(ClickOnCabeceros.ClickOnCabeceros());
    }
    @Then("The page shows the product's list")
    public void thePageShowsTheProductSList() {
        theActorInTheSpotlight().should(
                seeThat(
                        FilterResult.resutlpay(), equalTo(true))
                        .orComplainWith(ShoppingCarExeption.class,THE_TXT_CABECEROS_IS_NOT_VISIBLE)
        );
    }



}
