package test.validationshoppingcar.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import test.validationshoppingcar.exception.ShoppingCarExeption;
import test.validationshoppingcar.questions.*;
import test.validationshoppingcar.task.AddCabeceros;
import test.validationshoppingcar.task.ClickOnCabeceros;
import test.validationshoppingcar.task.SeeShoppingCar;
import test.validationshoppingcar.utils.drivers.MyChromeDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;
import static test.validationshoppingcar.exception.ShoppingCarExeption.*;
import static test.validationshoppingcar.utils.constantmanage.ConstantMagane.ACTOR;
import static test.validationshoppingcar.utils.constantmanage.ConstantMagane.URL;

public class Prueba2StepDefinition {
    @Before
    public void SetUp(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("User is in the product's list")
    public void userIsInTheProductSList() {
        theActorCalled(ACTOR);
        theActorInTheSpotlight().can(BrowseTheWeb.with(MyChromeDriver.chromeHisBrowserWeb().onTheUrl(URL)));
        theActorInTheSpotlight().wasAbleTo(ClickOnCabeceros.ClickOnCabeceros());
    }
    @When("User selected the products")
    public void userSelectedTheProducts() {
        theActorInTheSpotlight().wasAbleTo(AddCabeceros.AddCabeceros());
        theActorInTheSpotlight().wasAbleTo(SeeShoppingCar.SeeShoppingCar());
    }
    @Then("The shopping cart shows the product's names")
    public void theShoppingCartShowsTheProductSNames() {
        theActorInTheSpotlight().should(
                seeThat("name 1", ProductNamesResult1.nameProduct1(), equalTo("Cabecero De Cama Doble Entero 140 X 110 Negro"))
                        .orComplainWith(ShoppingCarExeption.class,THE_NAMES_ARE_NOT_EXPECTED),
                seeThat("name 2", ProductNamesResult2.nameProduct2(), equalTo("Cabecero Entero Tatooine Cama King 200 X 120 Negro"))
                        .orComplainWith(ShoppingCarExeption.class,THE_NAMES_ARE_NOT_EXPECTED),
                seeThat("name 3", ProductNamesResult3.nameProduct3(), equalTo("Cabecero Flotante Bogle Cama Sencilla 100 X 60 Café"))
                        .orComplainWith(ShoppingCarExeption.class,THE_NAMES_ARE_NOT_EXPECTED),
                seeThat("name 4", ProductNamesResult4.nameProduct4(), equalTo("Cabecero Entero Tatooine Cama King 200 X 120 Negro"))
                        .orComplainWith(ShoppingCarExeption.class,THE_NAMES_ARE_NOT_EXPECTED),
                seeThat("name 5", ProductNamesResult5.nameProduct5(), equalTo("Cabecero Capitoneado Versalles Sencillo Tela Negro"))
                        .orComplainWith(ShoppingCarExeption.class,THE_NAMES_ARE_NOT_EXPECTED)
        );
    }

    @Then("The shopping cart shows the quantity by each product")
    public void theShoppingCartShowsTheQuantityByEachProduct() {
        theActorInTheSpotlight().should(
                seeThat("Quantity 1", QuantityEachProduct1.numProduct1(), equalTo("5"))
                        .orComplainWith(ShoppingCarExeption.class, THE_QUANTITY_IS_NOT_EXPECTED),
                seeThat("Quantity 2", QuantityEachProduct2.numProduct2(), equalTo("3"))
                        .orComplainWith(ShoppingCarExeption.class, THE_QUANTITY_IS_NOT_EXPECTED),
                seeThat("Quantity 3", QuantityEachProduct3.numProduct3(), equalTo("6"))
                        .orComplainWith(ShoppingCarExeption.class, THE_QUANTITY_IS_NOT_EXPECTED),
                seeThat("Quantity 4", QuantityEachProduct4.numProduct4(), equalTo("2"))
                        .orComplainWith(ShoppingCarExeption.class, THE_QUANTITY_IS_NOT_EXPECTED),
                seeThat("Quantity 5", QuantityEachProduct5.numProduct5(), equalTo("1"))
                        .orComplainWith(ShoppingCarExeption.class, THE_QUANTITY_IS_NOT_EXPECTED)
        );
    }

    @Then("The shopping cart shows the total price")
    public void theShoppingCartShowsTheTotalPrice() {
        theActorInTheSpotlight().should(
                seeThat("Total price", TotalPriceResult.totalPriceResult(), equalTo("$ 5.508.300"))
                        .orComplainWith(ShoppingCarExeption.class, THE_TOTAL_PRICE_IS_NOT_EXPECTED)

        );
    }


}
