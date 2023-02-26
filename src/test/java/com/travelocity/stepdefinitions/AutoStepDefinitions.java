package com.travelocity.stepdefinitions;

import com.travelocity.task.BuscarAuto;
import com.travelocity.task.BuscarVuelo;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;

public class AutoStepDefinitions {

    @Cuando("{actor} busca un auto en arriendo en {string} para entregar en {string}")
    public void busca_un_auto_en_arriendo_en_para_entregar_en(Actor actor, String origen, String destino) {
        actor.attemptsTo(
                BuscarAuto.conOrigenDestino(origen,destino)
        );
    }
    @Entonces("se debe encontrar al menos una opcion con valor menor a {int}")
    public void se_debe_encontrar_al_menos_una_opcion_con_valor_menor_a(Integer valor) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
