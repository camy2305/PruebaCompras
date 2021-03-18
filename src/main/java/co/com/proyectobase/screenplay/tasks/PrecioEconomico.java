package co.com.proyectobase.screenplay.tasks;

import co.com.proyectobase.screenplay.userinterface.SeleccionHotelPage;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import org.openqa.selenium.WebElement;


import java.util.List;

public class PrecioEconomico implements Task {

   private int menor;
    private int numero=0;
    private  int pos=0;


    @Override
    public <T extends Actor> void performAs(T actor) {
        List<WebElement> listObjeto = Serenity.getWebdriverManager().getCurrentDriver().findElements(SeleccionHotelPage.AREA_HOTELES);
        menor = Integer.parseInt ( listObjeto.get(0).getText().substring(1));
        for(int i=1; i < listObjeto.size(); i++) {
            numero = Integer.parseInt(listObjeto.get(i).getText().substring(1));
            if (numero < menor) {
                menor = numero;
                pos = i;
            }
        }


        if(pos==0){
            actor.attemptsTo(Click.on(SeleccionHotelPage.HOTEL_1));
        }else if(pos==1){
            actor.attemptsTo(Click.on(SeleccionHotelPage.HOTEL_2));
        }else{
            actor.attemptsTo(Click.on(SeleccionHotelPage.HOTEL_3));
        }
        actor.attemptsTo(Click.on(SeleccionHotelPage.HOTEL_SELECCION));



    }
    public static PrecioEconomico hotel() {

        return Tasks.instrumented(PrecioEconomico.class );
    }

}
