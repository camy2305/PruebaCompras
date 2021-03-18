package co.com.proyectobase.screenplay.tasks;

import co.com.proyectobase.screenplay.interactions.SeleccionarLocation;
import co.com.proyectobase.screenplay.userinterface.HomePage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;


public class Seleccionar implements Task {

    private String checkIn;
    private String location;
    private String checkOut;


    public Seleccionar(String location, String checkIn, String checkOut) {

        this.checkIn = checkIn;
        this.location = location;
        this.checkOut = checkOut;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo( Click.on(HomePage.LISTA_SELECCIÓN), SeleccionarLocation.seleccionarLocation(location),
                Click.on(HomePage.TEXTO_CHECKIN),
                Enter.theValue(checkIn).into(HomePage.TEXTO_CHECKIN),
                Click.on(HomePage.TEXTO_CHECKOUT),
                Enter.theValue(checkOut).into(HomePage.TEXTO_CHECKOUT),
                Click.on(HomePage.BTN_SEARCH));




    }
    public static Seleccionar plan(String location, String checkIn, String checkOut) {

        return Tasks.instrumented(Seleccionar.class, location, checkIn, checkOut );
    }

}
