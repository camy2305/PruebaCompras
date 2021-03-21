package co.com.proyectobase.screenplay.tasks;

import co.com.proyectobase.screenplay.interactions.SeleccionarArticulo;
import co.com.proyectobase.screenplay.interactions.SeleccionarMarca;
import co.com.proyectobase.screenplay.userinterface.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

public class RegistroContactenos implements Task {

    private String articulo;
    private String marca;
    private String correo;
    private String infor;

    public RegistroContactenos(String articulo, String  marca, String correo, String infor) {

        this.articulo = articulo;

        this.marca = marca;
        this.correo = correo;

        this.infor = infor;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

System.out.println(articulo);
        System.out.println(marca);
        actor.attemptsTo(SeleccionarArticulo.seleccionarArticulo(articulo),
                SeleccionarMarca.seleccionarMarca(marca),
                Enter.theValue(correo).into(HomePage.CAMPO_CORREOCN).thenHit(Keys.TAB),
                Enter.theValue(infor).into(HomePage.AREA_DESC),
                Click.on(HomePage.BTN_SEND)
                );




    }
    public static RegistroContactenos datos( String articulo, String  marca, String correo, String infor) {

        return Tasks.instrumented(RegistroContactenos.class, articulo,marca,correo,infor );
    }

}