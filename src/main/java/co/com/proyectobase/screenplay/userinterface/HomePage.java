package co.com.proyectobase.screenplay.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://js.devexpress.com/Demos/DXHotels/#home")
public class HomePage extends PageObject {
    public static final Target LISTA_SELECCIÓN = Target.the("LISTA_SELECCIÓN").located(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div/div/div[1]/div/div[1]/div[2]/div[1]/div/div/div/div/div/div/div/div/div/div/div/div[1]/div/div/div/div/div[1]/div/div[2]/div/div/div"));
 public static final Target TEXTO_CHECKIN = Target.the("TEXTO_CHECKIN").located(By.xpath("/html/body/div/div/div/div[2]/div[1]/div/div/div[1]/div/div[1]/div[2]/div[1]/div/div/div/div/div/div/div/div/div/div/div/div[2]/div/div[1]/div/div/div/div/div/div/input"));
    public static final Target UBICACIONES = Target.the("UBICACIONES").
            located(By.xpath("//div[@class='dx-scrollable-wrapper']/div/div[1]"));
    public static final Target TEXTO_CHECKOUT = Target.the("CHECKOUT").located(By.xpath("/html/body/div/div/div/div[2]/div[1]/div/div/div[1]/div/div[1]/div[2]/div[1]/div/div/div/div/div/div/div/div/div/div/div/div[2]/div/div[2]/div/div/div/div/div/div/input"));
    public static final Target BTN_SEARCH = Target.the("CHECKOUT").located(By.xpath("/html/body/div/div/div/div[2]/div[1]/div/div/div[1]/div/div[1]/div[3]/div/div"));
public static final By LOCATION = By.tagName("div");


}
