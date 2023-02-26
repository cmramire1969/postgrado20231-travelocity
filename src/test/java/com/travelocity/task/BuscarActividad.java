package com.travelocity.task;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import org.openqa.selenium.Keys;

import static com.travelocity.page.BusquedaPrincipalPage.*;


public class BuscarActividad {

    public static Performable conOrigen(String origen) {
        return Task.where("{0} selecciona una actividad para '" + origen + "'",
                Open.url("https://www.travelocity.com/es/"),
                Click.on(BUSQUEDA_ACTIVIDAD),
                Click.on(BUT_ACTIVIDAD_ORIGEN),
                Enter.theValue(origen).into(BUT_ACTIVIDAD_ORIGEN2).thenHit(Keys.ENTER),
                Click.on(BUT_FECHA),
                Click.on(FECHA_1),
                Click.on(FECHA_2),
                Click.on(FECHA_LISTO),
                Click.on(BUSCAR)
        );
    }
}
