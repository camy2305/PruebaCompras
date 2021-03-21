package co.com.proyectobase.screenplay.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.proyectobase.screenplay.userinterface.HomePage.TEXTO_USUARIO;

public class VerificarUsuarioRegistrado implements Question<Boolean> {


private  String usuario ;


public VerificarUsuarioRegistrado(String usuario) {
        this.usuario = usuario;

        }

@Override
public Boolean answeredBy(Actor actor) {
        System.out.println(Text.of(TEXTO_USUARIO));

        return  (usuario.equals(Text.of(TEXTO_USUARIO).viewedBy(actor).asString()));


        }
public static VerificarUsuarioRegistrado mensaje(String usuario) {
        return new VerificarUsuarioRegistrado(usuario);
        }
        }