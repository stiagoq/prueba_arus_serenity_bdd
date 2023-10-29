package test.validationshoppingcar.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.waits.WaitUntil;
import test.validationshoppingcar.userinterfaces.CabacerosPage;
import test.validationshoppingcar.userinterfaces.ShoppingCar;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AddCabeceros implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Check.whether(CabacerosPage.TXT_CABECEROS.resolveFor(actor).isVisible()).andIfSo(
                        Click.on(CabacerosPage.BTN_COMPRA_PRODUCTO_1),
                        Click.on(CabacerosPage.BTN_AGREGAR),
                        WaitUntil.angularRequestsHaveFinished(),
                        Click.on(CabacerosPage.BTN_ADD_MAS),
                        WaitUntil.angularRequestsHaveFinished(),
                        Click.on(CabacerosPage.BTN_ADD_MAS),
                        WaitUntil.angularRequestsHaveFinished(),
                        Click.on(CabacerosPage.BTN_ADD_MAS),
                        WaitUntil.angularRequestsHaveFinished(),
                        Click.on(CabacerosPage.BTN_ADD_MAS),
                        WaitUntil.angularRequestsHaveFinished(),
                        Click.on(CabacerosPage.BTN_CERRAR),

                        Click.on(CabacerosPage.BTN_COMPRA_PRODUCTO_2),
                        Click.on(CabacerosPage.BTN_AGREGAR),
                        WaitUntil.angularRequestsHaveFinished(),
                        Click.on(CabacerosPage.BTN_ADD_MAS),
                        WaitUntil.angularRequestsHaveFinished(),
                        Click.on(CabacerosPage.BTN_ADD_MAS),
                        WaitUntil.angularRequestsHaveFinished(),
                        Click.on(CabacerosPage.BTN_CERRAR),

                        Click.on(CabacerosPage.BTN_COMPRA_PRODUCTO_3),
                        Click.on(CabacerosPage.BTN_AGREGAR),
                        WaitUntil.angularRequestsHaveFinished(),
                        Click.on(CabacerosPage.BTN_ADD_MAS),
                        WaitUntil.angularRequestsHaveFinished(),
                        Click.on(CabacerosPage.BTN_ADD_MAS),
                        WaitUntil.angularRequestsHaveFinished(),
                        Click.on(CabacerosPage.BTN_ADD_MAS),
                        WaitUntil.angularRequestsHaveFinished(),
                        Click.on(CabacerosPage.BTN_ADD_MAS),
                        WaitUntil.angularRequestsHaveFinished(),
                        Click.on(CabacerosPage.BTN_ADD_MAS),
                        WaitUntil.angularRequestsHaveFinished(),
                        Click.on(CabacerosPage.BTN_CERRAR),


                        Click.on(CabacerosPage.BTN_COMPRA_PRODUCTO_4),
                        Click.on(CabacerosPage.BTN_AGREGAR),
                        WaitUntil.angularRequestsHaveFinished(),
                        Click.on(CabacerosPage.BTN_ADD_MAS),
                        WaitUntil.angularRequestsHaveFinished(),
                        Click.on(CabacerosPage.BTN_CERRAR),


                        Click.on(CabacerosPage.BTN_COMPRA_PRODUCTO_5),
                        Click.on(CabacerosPage.BTN_AGREGAR),
                        WaitUntil.angularRequestsHaveFinished(),
                        Click.on(CabacerosPage.BTN_CERRAR),

                        Click.on(CabacerosPage.BTN_SHOPPING_CAR),
                        WaitUntil.the(ShoppingCar.TXT_CARRITO_COMPRAS, isVisible()).forNoMoreThan(10).seconds()

                )
        );
    }
    public static AddCabeceros AddCabeceros(){
        return Tasks.instrumented(AddCabeceros.class);
    }
}
