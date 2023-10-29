package test.validationshoppingcar.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.waits.WaitUntil;
import test.validationshoppingcar.userinterfaces.CabacerosPage;
import test.validationshoppingcar.userinterfaces.HomePage;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ClickOnCabeceros implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Check.whether(HomePage.BTN_CATEGORIES.resolveFor(actor).isVisible()).andIfSo(
                        Click.on(HomePage.BTN_CATEGORIES),
                        Click.on(HomePage.BTN_DORMITORIO),
                        Click.on(HomePage.BTN_CANBECEROS),
                        WaitUntil.the(CabacerosPage.TXT_CABECEROS, isVisible()).forNoMoreThan(5).seconds()


                        )
        );
    }
    public static ClickOnCabeceros ClickOnCabeceros(){
        return Tasks.instrumented(ClickOnCabeceros.class);
    }
}
