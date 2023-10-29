package test.validationshoppingcar.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ShoppingCar {
    public static final net.serenitybdd.screenplay.targets.Target TXT_PRODUCTO_1 = Target.the("Description of the category").located(By.xpath("//div[@class='exito-checkout-io-0-x-listContainer']/div[2]/div/div/div[4]/span"));
    public static final net.serenitybdd.screenplay.targets.Target TXT_PRODUCTO_1_NUM = Target.the("Quantity of product 1 ").located(By.xpath("//div[@class='exito-checkout-io-0-x-listContainer'][1]/div[2]/div/div/div[6]/div/div/div/div/span[1]"));

    public static final net.serenitybdd.screenplay.targets.Target TXT_PRODUCTO_2 = Target.the("Description of the product 1").located(By.xpath("//div[@class='exito-checkout-io-0-x-listContainer']/div[2]/div[2]/div/div[4]/span"));
    public static final net.serenitybdd.screenplay.targets.Target TXT_PRODUCTO_2_NUM = Target.the("Quantity of product 1").located(By.xpath("//div[@class='exito-checkout-io-0-x-listContainer'][2]/div[2]/div[1]/div/div[6]/div/div/div/div/span[1]"));

    public static final net.serenitybdd.screenplay.targets.Target TXT_PRODUCTO_3 = Target.the("Description of the product 2").located(By.xpath("//div[@class='exito-checkout-io-0-x-listContainer'][2]/div[2]/div/div/div[4]/span"));
    public static final net.serenitybdd.screenplay.targets.Target TXT_PRODUCTO_3_NUM = Target.the("Quantity of product 2").located(By.xpath("//div[@class='exito-checkout-io-0-x-listContainer']/div[2]/div[2]/div/div[6]/div/div/div/div/span[1]"));

    public static final net.serenitybdd.screenplay.targets.Target TXT_PRODUCTO_4 = Target.the("Description of the product 3").located(By.xpath("//div[@class='exito-checkout-io-0-x-listContainer'][2]/div[2]/div[2]/div/div[4]/span"));
    public static final net.serenitybdd.screenplay.targets.Target TXT_PRODUCTO_4_NUM = Target.the("Quantity of product 3").located(By.xpath("//div[@class='exito-checkout-io-0-x-listContainer'][2]/div[2]/div[3]/div/div[6]/div/div/div/div/span[1]"));

    public static final net.serenitybdd.screenplay.targets.Target TXT_PRODUCTO_5 = Target.the("Description of the product 3").located(By.xpath("//div[@class='exito-checkout-io-0-x-listContainer'][3]/div[2]/div/div/div[4]/span"));
    public static final net.serenitybdd.screenplay.targets.Target TXT_PRODUCTO_5_NUM = Target.the("Quantity of product 4").located(By.xpath("//div[@class='exito-checkout-io-0-x-listContainer'][3]/div[2]/div/div/div[6]/div/div/div/div/span[1]"));

    public static final net.serenitybdd.screenplay.targets.Target TXT_CARRITO_COMPRAS = Target.the("Description of the product 5").located(By.xpath("//div[@class='exito-checkout-io-0-x-contentCheckoutIO ']/h1"));
    public static final net.serenitybdd.screenplay.targets.Target TXT_TOTAL_PRICE = Target.the("Quantity of product 5").located(By.xpath("//div[@class='exito-checkout-io-0-x-summaryContainer']/div/div[2]/div/span[2]"));

}

