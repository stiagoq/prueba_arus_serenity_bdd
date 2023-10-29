package test.validationshoppingcar.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import test.validationshoppingcar.userinterfaces.ShoppingCar;

public class QuantityEachProduct1 implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return BrowseTheWeb.as(actor).find(ShoppingCar.TXT_PRODUCTO_1_NUM).getText();
    }
    public static QuantityEachProduct1 numProduct1() {
        return new QuantityEachProduct1();
    }
}
