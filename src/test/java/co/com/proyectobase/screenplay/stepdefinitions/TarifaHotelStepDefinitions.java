package co.com.proyectobase.screenplay.stepdefinitions;

import co.com.proyectobase.screenplay.questions.VerificarMensajeContactenos;
import co.com.proyectobase.screenplay.questions.VerificarSpeaker;
import co.com.proyectobase.screenplay.questions.VerificarUsuarioRegistrado;
import co.com.proyectobase.screenplay.tasks.IngresoCuenta;
import co.com.proyectobase.screenplay.tasks.CrearCuenta;
import co.com.proyectobase.screenplay.tasks.RegistroContactenos;
import co.com.proyectobase.screenplay.tasks.SeleccionarSpeaker;
import co.com.proyectobase.screenplay.userinterface.HomePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;

import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;


import static org.hamcrest.Matchers.is;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;


public class TarifaHotelStepDefinitions {

    @Managed(driver="chrome")
    private WebDriver hisBrowser;
    private Actor rafa = Actor.named("Rafa");

    @Before
    public void configuracionInicial() {
        rafa.can(BrowseTheWeb.with(hisBrowser));
    }
    @Given("^Yo ingreso a la pagina de compras")
    public void yoIngresoalapaginadecompras() {
        rafa.wasAbleTo(Open.browserOn(new HomePage()));

    }

    @When("^Yo ingreso a la creacion de cuentas con los (.*) (.*) (.*)$")
    public void yoIngresoalacreaciondecuentas(String usuario, String correo, String contraseña) {
        rafa.attemptsTo(
                CrearCuenta.datos(usuario,correo,contraseña)
        );
    }


    @Then("^yo valido mensaje registro (.*)$")
    public void yoValidomensajeregistro(String usuario ) {
        rafa.should(seeThat(VerificarUsuarioRegistrado.mensaje(usuario), is(true)));
    }

    @When("^yo ingreso a la cuenta con los datos (.*) (.*)$")
    public void yoIngresoalacuentasconlosdatos(String usuario, String Contraseña) {
        rafa.attemptsTo(IngresoCuenta.datos(usuario,Contraseña));

    }

    @When("^yo registro contactenos con el (.*) la (.*) el (.*) y (.*)$")
    public void yoRegistrocontactenoscon(String articulo, String marca, String correo, String infor ) {
        rafa.attemptsTo(RegistroContactenos.datos(articulo,marca,correo,infor));

    }


    @Then("^yo valido mensaje contactenos$")
    public void yoValidomensajecontactenos() {
        rafa.should(seeThat(VerificarMensajeContactenos.mensaje(), is(true)));
    }


    @When("^yo selecciono y agrego un producto (.*)$")
    public void yoseleccionoyagregounproducto(String speaker ) {
        rafa.attemptsTo(SeleccionarSpeaker.datos(speaker));

    }

    @Then("^yo valido mensaje en carrito (.*)$")
    public void yoValidomensajecontactenos(String speaker ) {
        rafa.should(seeThat(VerificarSpeaker.mensaje(speaker), is(true)));
    }

}
