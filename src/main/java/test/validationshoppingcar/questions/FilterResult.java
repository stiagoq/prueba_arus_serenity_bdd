package test.validationshoppingcar.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import test.validationshoppingcar.userinterfaces.CabacerosPage;

public class FilterResult implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return CabacerosPage.TXT_CABECEROS.resolveFor(actor).isVisible();
    }

    public static FilterResult resutlpay(){
        return new FilterResult();
    }
}
