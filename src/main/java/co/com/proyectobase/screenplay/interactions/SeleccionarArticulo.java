package co.com.proyectobase.screenplay.interactions;

import co.com.proyectobase.screenplay.userinterface.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;


public class SeleccionarArticulo implements Interaction {
    private String articulo;

    public SeleccionarArticulo(String articulo) {
        this.articulo = articulo;
    }



    @Override
    public <T extends Actor> void performAs(T actor) {
      List<WebElement> listStates = HomePage.LISTA_ARTICULO.resolveFor(actor).findElements(By.tagName("option"));

System.out.println(articulo);
        for (int i = 0; i < listStates.size(); i++) {
            System.out.println(i+listStates.get(i).getText());

            if (articulo.equals(listStates.get(i).getText())) {

                listStates.get(i).click();
                break;
            }
        }

    }
    public static SeleccionarArticulo seleccionarArticulo(String articulo) {
        return Tasks.instrumented(SeleccionarArticulo.class,articulo);
    }
}