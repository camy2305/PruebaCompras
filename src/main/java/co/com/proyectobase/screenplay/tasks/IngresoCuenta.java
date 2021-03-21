package co.com.proyectobase.screenplay.tasks;

import co.com.proyectobase.screenplay.userinterface.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

public class IngresoCuenta implements Task {

    private String usuario;
    private String contraseña;


    public IngresoCuenta(String usuario, String contraseña) {

        this.usuario = usuario;

        this.contraseña = contraseña;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(Click.on(HomePage.BOTON_USER),
                Enter.theValue(usuario).into(HomePage.LOGIN_USER).thenHit(Keys.TAB),
                Enter.theValue(contraseña).into(HomePage.LOGIN_PASS),
                Click.on(HomePage.BTN_LOGIN));




    }
    public static IngresoCuenta datos(String usuario, String contraseña) {

        return Tasks.instrumented(IngresoCuenta.class, usuario, contraseña );
    }

}