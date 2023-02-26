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

import static com.travelocity.page.ResultadosBusquedasPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class PaquetesStepDefinitions {

    @Cuando("{actor} busca un paquete de viaje desde {string} para {string}")
    public void busca_un_paquete_de_viaje_desde_para(Actor actor, String origen, String destino) {
        actor.attemptsTo(
                BuscarPaqueteTask.conOrigenDestino(origen, destino)
        );
    }
    @Entonces("debe encontrar al menos una opción con valor menor a {int}")
    public void debe_encontrar_al_menos_una_opcion_con_valor_menor_a(Integer valor) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                WaitUntil.the(LISTA_DE_RESULTADOS, isVisible()).forNoMoreThan(Duration.ofSeconds(90))
        );
        String valorObtenido = OnStage.theActorInTheSpotlight().asksFor(Text.of(PRIMER_COSTOS_LISTA_DE_RESULTADOS));
        Integer valorObtenidoInt = Integer.parseInt(valorObtenido.substring(1));
        Ensure.that(valorObtenidoInt).isLessThanOrEqualTo(valor);
    }

}
