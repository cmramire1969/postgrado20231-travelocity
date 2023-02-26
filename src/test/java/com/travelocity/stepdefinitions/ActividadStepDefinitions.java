package com.travelocity.stepdefinitions;

import com.travelocity.task.BuscarActividad;
import com.travelocity.task.SeleccionarHospedajeTask;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.time.Duration;

import static com.travelocity.page.ResultadosBusquedasPage.LISTA_DE_RESULTADOS;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ActividadStepDefinitions {

    @Cuando("{actor} busca un una acividad en la ciudad de {string}")
    public void busca_un_una_acividad_en_la_ciudad_de(Actor sactor, String origen) {
        sactor.attemptsTo(
                BuscarActividad.conOrigen(origen)
        );
    }
    @Entonces("se debe encontrar al menos una actividad")
    public void se_debe_encontrar_al_menos_una_actividad() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
