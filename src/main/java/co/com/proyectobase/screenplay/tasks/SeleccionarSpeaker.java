package co.com.proyectobase.screenplay.tasks;

import co.com.proyectobase.screenplay.interactions.SeleccionarTipoSpeaker;
import co.com.proyectobase.screenplay.userinterface.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Text;


public class SeleccionarSpeaker implements Task {

    private String speaker;



    public SeleccionarSpeaker(String speaker) {

        this.speaker = speaker;

    }

    @Override
    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(Click.on(HomePage.SELECCION_SPEAK),
                SeleccionarTipoSpeaker.seleccionarMarca(speaker),
                Click.on(HomePage.BTN_ADD_CAR),
                Click.on(HomePage.BTN_CARRITO));
        System.out.println(speaker.toUpperCase()+"."+ Text.of(HomePage.TEXTO_CARRITO).viewedBy(actor).asString());



    }
    public static SeleccionarSpeaker datos(String speaker) {

        return Tasks.instrumented(SeleccionarSpeaker.class, speaker );
    }

}