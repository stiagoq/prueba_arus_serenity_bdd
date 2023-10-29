package test.validationshoppingcar.exception;

public class ShoppingCarExeption extends AssertionError {
    public static final String THE_NAMES_ARE_NOT_EXPECTED = "The names are not equals to selected in list products";
    public static final String THE_QUANTITY_IS_NOT_EXPECTED = "The quantity is not equal to which the shopping car shows";
    public static final String THE_TOTAL_PRICE_IS_NOT_EXPECTED = "The total price is not equal to which the shopping car shows";
    public static final String THE_TXT_CABECEROS_IS_NOT_VISIBLE = "The message cabecero is not visible in the page cabeceros";


    public ShoppingCarExeption(String mesagge, Throwable cause){
        super(mesagge,cause);

    }
}
