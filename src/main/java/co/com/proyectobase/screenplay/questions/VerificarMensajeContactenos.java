package co.com.proyectobase.screenplay.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.proyectobase.screenplay.userinterface.HomePage.TEXTO_CONTACTO_ENVIADO;
import static co.com.proyectobase.screenplay.userinterface.HomePage.TEXTO_USUARIO;

public class VerificarMensajeContactenos implements Question<Boolean> {



    @Override
    public Boolean answeredBy(Actor actor) {
        System.out.println(Text.of(TEXTO_CONTACTO_ENVIADO));

        return  ("Thank you for contacting Advantage support.".equals(Text.of(TEXTO_CONTACTO_ENVIADO).viewedBy(actor).asString()));


    }
    public static VerificarMensajeContactenos mensaje() {
        return new VerificarMensajeContactenos();
    }
}