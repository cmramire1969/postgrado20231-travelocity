package com.travelocity.stepdefinitions;

import com.travelocity.task.BuscarPaquete2Task;
import com.travelocity.task.BuscarPaqueteTask;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;

public class Paquetes2StepDefinitions {

    @Cuando("{actor} busca un paquete de viaje familiar salida {string} con destino {string}")
    public void busca_un_paquete_de_viaje_familiar_salida_con_destino(Actor actor, String origen, String destino) {
        actor.attemptsTo(
                BuscarPaquete2Task.conOrigenDestino2(origen, destino)
        );
        throw new io.cucumber.java.PendingException();
    }
    @Entonces("se debe encontrar al menos una opcion familiar")
    public void se_debe_encontrar_al_menos_una_opcion_familiar() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
