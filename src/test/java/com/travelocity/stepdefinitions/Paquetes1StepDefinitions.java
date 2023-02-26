package com.travelocity.stepdefinitions;

import com.travelocity.task.BuscarPaqueteTask;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.time.Duration;

import static com.travelocity.page.ResultadosBusquedasPage.LISTA_DE_RESULTADOS;
import static com.travelocity.page.ResultadosBusquedasPage.PRIMER_COSTOS_LISTA_DE_RESULTADOS;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Paquetes1StepDefinitions {

    @Cuando("{actor} busca un paquete de viaje salida {string} con destino {string}")
    public void busca_un_paquete_de_viaje_salida_con_destino(Actor actor, String origen, String destino) {
        actor.attemptsTo(
                BuscarPaqueteTask.conOrigenDestino(origen, destino)
        );
        throw new io.cucumber.java.PendingException();
    }
    @Entonces("se debe encontrar al menos una opcion")
    public void se_debe_encontrar_al_menos_una_opcion() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
