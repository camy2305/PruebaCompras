package co.com.proyectobase.screenplay.questions;

import co.com.proyectobase.screenplay.util.CalcularDias;
import co.com.proyectobase.screenplay.userinterface.ValidarPrecioPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import org.openqa.selenium.WebElement;

import java.util.List;

import static co.com.proyectobase.screenplay.userinterface.ValidarPrecioPage.PRECIOS;
import static co.com.proyectobase.screenplay.userinterface.ValidarPrecioPage.PRECIO_TOTAL;



public class VerificarPrecio implements Question<Boolean> {
    private  Boolean resultado = true;
    private  double precioTotal = 0.0;

    private  String checkIn ;
    private  String checkOut ;

    public VerificarPrecio(String checkIn, String checkOut) {
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        List<WebElement> listPrices = ValidarPrecioPage.PRECIO_INDV.resolveFor(actor).findElements(PRECIOS);
        precioTotal =Double.parseDouble(listPrices.get(0).getText().substring(1))*CalcularDias.calcularDias(checkIn,checkOut);
        System.out.println("Nprecio total " + precioTotal);
        System.out.println(Double.parseDouble(Text.of(PRECIO_TOTAL).viewedBy(actor).asString().substring(1)));
        if (precioTotal == Double.parseDouble(Text.of(PRECIO_TOTAL).viewedBy(actor).asString().replace("$",""))){
            resultado = true;
        } else {
            resultado = false;
        }
        return resultado;
    }
    public static VerificarPrecio precioTotal(String checkIn, String checkOut) {
        return new VerificarPrecio(checkIn,checkOut);
    }
}