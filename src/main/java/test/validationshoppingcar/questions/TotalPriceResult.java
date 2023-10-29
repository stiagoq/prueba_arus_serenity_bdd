package test.validationshoppingcar.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import test.validationshoppingcar.userinterfaces.ShoppingCar;

public class TotalPriceResult implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return BrowseTheWeb.as(actor).find(ShoppingCar.TXT_TOTAL_PRICE).getText();
    }
    public static TotalPriceResult totalPriceResult() {
        return new TotalPriceResult();
    }
}
