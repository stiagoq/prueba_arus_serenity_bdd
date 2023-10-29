package test.validationshoppingcar.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import test.validationshoppingcar.userinterfaces.ShoppingCar;

public class ProductNamesResult2 implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return BrowseTheWeb.as(actor).find(ShoppingCar.TXT_PRODUCTO_2).getText();
    }
    public static ProductNamesResult2 nameProduct2() {
        return new ProductNamesResult2();
    }

}
