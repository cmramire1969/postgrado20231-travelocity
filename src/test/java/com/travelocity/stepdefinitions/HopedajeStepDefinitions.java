package com.travelocity.stepdefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import com.travelocity.task.SeleccionarHospedajeTask;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.time.Duration;

import static com.travelocity.page.ResultadosBusquedasPage.LISTA_DE_RESULTADOS;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class HopedajeStepDefinitions {

    @Cuando("{actor} busca un hospedaje para {string}")
    public void busca_un_hospedaje_para(Actor actor, String destino) {
        actor.attemptsTo(
                SeleccionarHospedajeTask.simple(destino)
        );

    }
    @Entonces("debe encontrar al menos una opción disponible")
    public void debe_encontrar_al_menos_una_opcion_disponible() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                WaitUntil.the(LISTA_DE_RESULTADOS, isVisible()).forNoMoreThan(Duration.ofSeconds(3))
        );
        Ensure.that(LISTA_DE_RESULTADOS).values().hasSizeGreaterThan(1);
    }

}
