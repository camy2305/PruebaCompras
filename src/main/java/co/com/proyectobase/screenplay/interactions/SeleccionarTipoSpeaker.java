package co.com.proyectobase.screenplay.interactions;

import co.com.proyectobase.screenplay.userinterface.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SeleccionarTipoSpeaker implements Interaction {
    private String marca;

    public SeleccionarTipoSpeaker(String marca) {
        this.marca = marca;
    }



    @Override
    public <T extends Actor> void performAs(T actor) {
        List<WebElement> listStates = HomePage.SPEAKERS.resolveFor(actor).findElements(By.tagName("a"));

        System.out.println(marca);
        for (int i = 0; i < listStates.size(); i++) {
            System.out.println(i+listStates.get(i).getText());
            if (marca.equals(listStates.get(i).getText())) {
                listStates.get(i).click();
                break;
            }
        }

    }
    public static SeleccionarTipoSpeaker seleccionarMarca(String marca) {
        return Tasks.instrumented(SeleccionarTipoSpeaker.class,marca);
    }
}