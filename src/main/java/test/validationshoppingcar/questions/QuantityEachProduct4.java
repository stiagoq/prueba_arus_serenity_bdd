package test.validationshoppingcar.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import test.validationshoppingcar.userinterfaces.ShoppingCar;

public class QuantityEachProduct4 implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return BrowseTheWeb.as(actor).find(ShoppingCar.TXT_PRODUCTO_4_NUM).getText();
    }
    public static QuantityEachProduct4 numProduct4() {
        return new QuantityEachProduct4();
    }
}
