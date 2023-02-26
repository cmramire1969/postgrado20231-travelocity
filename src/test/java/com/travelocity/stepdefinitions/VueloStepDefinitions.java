package com.travelocity.stepdefinitions;

import com.travelocity.task.BuscarPaqueteTask;
import com.travelocity.task.BuscarVuelo;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;

public class VueloStepDefinitions {

    @Cuando("{actor} busca un vuelo de viaje desde {string} hacia {string}")
    public void busca_un_vuelo_de_viaje_desde_hacia(Actor actor, String origen, String destino) {
        actor.attemptsTo(
                BuscarVuelo.conOrigenDestino(origen,destino)
        );
    }
    @Entonces("se debe encontrar al menos un vuelo con valor menor a {int}")
    public void se_debe_encontrar_al_menos_un_vuelo_con_valor_menor_a(Integer valor) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
