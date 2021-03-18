package co.com.proyectobase.screenplay.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ValidarPrecioPage extends PageObject {

    public static final By PRECIOS =  By.xpath("//h4[@class='price']");
    public static final Target PRECIO_TOTAL =  Target.the("PRECIO_TOTAL").located(By.xpath("//h4[@class='total-price']"));
    public static final Target PRECIO_INDV = Target.the("PRECIO_INDV").located(By.className("total-pay"));

}