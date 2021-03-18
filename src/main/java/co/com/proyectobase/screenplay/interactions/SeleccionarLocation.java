package co.com.proyectobase.screenplay.interactions;

import co.com.proyectobase.screenplay.userinterface.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import org.openqa.selenium.WebElement;

import java.util.List;

import static co.com.proyectobase.screenplay.userinterface.HomePage.LOCATION;

public class SeleccionarLocation implements Interaction {
    String location;

    public SeleccionarLocation(String location) {
        this.location = location;
    }



    @Override
    public <T extends Actor> void performAs(T actor) {
        List<WebElement> listStates = HomePage.UBICACIONES.resolveFor(actor).findElements(LOCATION);
        for (int i = 0; i < listStates.size(); i++) {
            if (location.equals(listStates.get(i).getText())) {
                listStates.get(i).click();
                break;
            }
        }

    }
    public static SeleccionarLocation seleccionarLocation(String location) {
        return Tasks.instrumented(SeleccionarLocation.class,location);
    }
}