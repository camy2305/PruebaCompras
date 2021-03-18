package co.com.proyectobase.screenplay.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SeleccionHotelPage  extends PageObject {
    public static final By AREA_HOTELES = By.xpath("//*[contains(@class,\'rate-number\')]");
    public static final Target HOTEL_1 =  Target.the("HOTEL_1").located(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div/div[2]/div[2]/div/div[2]/div[1]/div/div[1]/div[1]/span[1]"));
    public static final Target HOTEL_2 =  Target.the("HOTEL_2").located(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div/div[2]/div[2]/div/div[2]/div[2]/div/div[1]/div[1]/span[1]"));
    public static final Target HOTEL_3 =  Target.the("HOTEL_3").located(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div/div[4]/div[2]/div/div[2]/div[3]/div/div[1]/div[1]/span[1]"));
    public static final Target HOTEL_SELECCION =  Target.the("HOTEL_1_1").located(By.xpath("//*[@aria-selected=\'true\']/div/div/div[2]/div/div"));


}
