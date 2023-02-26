package com.travelocity.task;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import org.openqa.selenium.Keys;

import static com.travelocity.page.BusquedaPrincipalPage.*;


public class BuscarVuelo {

    public static Performable conOrigenDestino(String origen, String destino) {
        return Task.where("{0} selecciona un vuelo desde"+ origen + "hasta '" + destino + "'",
                Open.url("https://www.travelocity.com/es/"),
                Click.on(BUSQUEDA_VUELO),
                Click.on(BUT_VUELO_ORIGEN),
                Enter.theValue(origen).into(BUT_VUELO_ORIGEN2).thenHit(Keys.ENTER),
                Click.on(BUT_VUELO_DESTINO),
                Enter.theValue(destino).into(BUT_VUELO_DESTINO2).thenHit(Keys.ENTER),
                Click.on(BUT_FECHA),
                Click.on(FECHA_1),
                Click.on(FECHA_2),
                Click.on(FECHA_LISTO),
                Click.on(BUSCAR)
        );
    }
}
