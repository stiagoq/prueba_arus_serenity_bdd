package test.validationshoppingcar.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import test.validationshoppingcar.userinterfaces.ShoppingCar;

public class ProductNamesResult4 implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return BrowseTheWeb.as(actor).find(ShoppingCar.TXT_PRODUCTO_4).getText();
    }
    public static ProductNamesResult4 nameProduct4() {
        return new ProductNamesResult4();
    }

}
