package test.validationshoppingcar.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.waits.WaitUntil;
import test.validationshoppingcar.userinterfaces.ShoppingCar;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SeeShoppingCar implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        Check.whether(ShoppingCar.TXT_CARRITO_COMPRAS.resolveFor(actor).isVisible()).andIfSo(
                WaitUntil.the(ShoppingCar.TXT_CARRITO_COMPRAS, isVisible()).forNoMoreThan(10).seconds()
        );
    }
    public static SeeShoppingCar SeeShoppingCar(){
        return Tasks.instrumented(SeeShoppingCar.class);
    }

}
