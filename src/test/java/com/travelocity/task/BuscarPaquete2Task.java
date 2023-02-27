package com.travelocity.task;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import org.openqa.selenium.Keys;

import static com.travelocity.page.BusquedaPrincipalPage.*;


public class BuscarPaquete2Task {

    public static Performable conOrigenDestino2(String origen, String destino) {
        return Task.where("{0} selecciona un paquete desde"+ origen + "para '" + destino + "'",
                Open.url("https://www.travelocity.com/es/"),
                Click.on(BUSQUEDA_PAQUETES),
                Click.on(BUT_ORIGEN),
                Enter.theValue(origen).into(ORIGEN).thenHit(Keys.ENTER),
                Click.on(BUT_DESTINO),
                Enter.theValue(destino).into(DESTINO).thenHit(Keys.ENTER),
                Click.on(BUT_FECHA),
                Click.on(FECHA_1.of("3")),
                Click.on(FECHA_2.of("21")),
                Click.on(FECHA_LISTO),
                Click.on(BUT_PAQUETE_CHECKBOX),
                Click.on(BUT_FECHA),
                Click.on(FECHA_1.of("5")),
                Click.on(FECHA_2.of("10")),
                Click.on(FECHA_LISTO),
                Click.on(BUSCAR)
        );
    }
}
