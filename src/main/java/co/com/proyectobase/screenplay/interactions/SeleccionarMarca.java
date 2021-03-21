package co.com.proyectobase.screenplay.interactions;

import co.com.proyectobase.screenplay.userinterface.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SeleccionarMarca implements Interaction {
    private String marca;

    public SeleccionarMarca(String marca) {
        this.marca = marca;
    }



    @Override
    public <T extends Actor> void performAs(T actor) {
        List<WebElement> listStates = HomePage.LISTA_MARCA.resolveFor(actor).findElements(By.tagName("option"));


        for (int i = 0; i < listStates.size(); i++) {
            if (marca.equals(listStates.get(i).getText())) {
                listStates.get(i).click();
                break;
            }
        }

    }
    public static SeleccionarMarca seleccionarMarca(String marca) {
        return Tasks.instrumented(SeleccionarMarca.class,marca);
    }
}