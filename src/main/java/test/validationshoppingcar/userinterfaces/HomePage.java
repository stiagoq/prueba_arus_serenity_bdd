package test.validationshoppingcar.userinterfaces;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage {
    public static final net.serenitybdd.screenplay.targets.Target BTN_CATEGORIES =Target.the("Button of categories").located(By.xpath("//div[@class='vtex-flex-layout-0-x-flexRow vtex-flex-layout-0-x-flexRow--header-row-layout vtex-flex-layout-0-x-flexRow--header-content']/div/div/div/div/div/div/div/div/div/div/button"));
    public static final net.serenitybdd.screenplay.targets.Target BTN_DORMITORIO =Target.the("Button of dormitorios").located(By.xpath("//div[@class='exito-category-menu-3-x-container']/div/div[@class='exito-category-menu-3-x-categoryList']/ul/li[@id='undefined-nivel2-Dormitorio']"));
    public static final net.serenitybdd.screenplay.targets.Target BTN_CANBECEROS =Target.the("Button of cabeceras").located(By.xpath("//div[@class='exito-category-menu-3-x-containerDrawer']/section/div[@class='exito-category-menu-3-x-sideMenu']/div[@class='exito-category-menu-3-x-contentColumns']/div[@class='exito-category-menu-3-x-column']/div[@class='exito-category-menu-3-x-itemSideMenu']/a[@id='Categorías-nivel3-Cabeceros']"));

}
