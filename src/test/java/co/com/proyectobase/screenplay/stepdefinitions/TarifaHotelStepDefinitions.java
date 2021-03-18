package co.com.proyectobase.screenplay.stepdefinitions;

import co.com.proyectobase.screenplay.questions.VerificarPrecio;
import co.com.proyectobase.screenplay.tasks.PrecioEconomico;
import co.com.proyectobase.screenplay.tasks.Seleccionar;
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
    @Given("^Yo ingreso a la pagina de viajes")
    public void yoIngresoALaPaginaDeViajes() {
        rafa.wasAbleTo(Open.browserOn(new HomePage()));

    }

    @When("^Yo selecciono la ciudad (.*) en el dia (.*) hasta (.*)$")
    public void yoSeleccionoLaCiudadeneldiahasta(String location, String checkIn, String checkOut) {
        rafa.attemptsTo(
                Seleccionar.plan(location,checkIn,checkOut)
        );
    }

    @When("^yo selecciono precio mas economico$")
    public void yoSeleccionopreciomaseconomico() {
        rafa.attemptsTo(PrecioEconomico.hotel());

    }

    @Then("^yo valido precio total (.*) con (.*)$")
    public void yoValidopreciototalcon(String checkIn, String checkOut ) {
        rafa.should(seeThat(VerificarPrecio.precioTotal(checkIn,checkOut), is(true)));
    }
}
