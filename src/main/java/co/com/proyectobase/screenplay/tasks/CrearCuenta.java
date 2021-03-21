package co.com.proyectobase.screenplay.tasks;

import co.com.proyectobase.screenplay.userinterface.HomePage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;


public class CrearCuenta implements Task {

    private String usuario;
    private String correo;
    private String contraseña;


    public CrearCuenta(String usuario, String correo, String contraseña) {

        this.usuario = usuario;
        this.correo = correo;
        this.contraseña = contraseña;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

       


        actor.attemptsTo(Click.on(HomePage.BOTON_USER),Click.on(HomePage.BOTON_NEWACC),
                Enter.theValue(usuario).into(HomePage.CAMPO_USERNAME).thenHit(Keys.TAB),
                Enter.theValue(correo).into(HomePage.CAMPO_CORREO).thenHit(Keys.TAB),
                Enter.theValue(contraseña).into(HomePage.CAMPO_PASS).thenHit(Keys.TAB),
                Enter.theValue(contraseña).into(HomePage.CAMPO_CPASS),Click.on(HomePage.TERMINOS),
                Click.on(HomePage.BTN_REGISTER));




    }
    public static CrearCuenta datos(String usuario, String correo, String contraseña) {

        return Tasks.instrumented(CrearCuenta.class, usuario, correo, contraseña );
    }

}
