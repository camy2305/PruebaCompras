package co.com.proyectobase.screenplay.questions;

import co.com.proyectobase.screenplay.userinterface.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class VerificarSpeaker implements Question<Boolean> {


private  String speaker ;


public VerificarSpeaker(String speaker) {
        this.speaker = speaker;

        }

@Override
public Boolean answeredBy(Actor actor) {

System.out.println(speaker.toUpperCase()+"."+Text.of(HomePage.TEXTO_CARRITO).viewedBy(actor).asString());
        return  (speaker.toUpperCase().equals(Text.of(HomePage.TEXTO_CARRITO).viewedBy(actor).asString()));


        }
public static VerificarSpeaker mensaje(String speaker) {
        return new VerificarSpeaker(speaker);
        }
        }