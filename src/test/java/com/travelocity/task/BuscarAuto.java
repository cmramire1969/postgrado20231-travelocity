package com.travelocity.task;

import io.netty.util.Timeout;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import org.openqa.selenium.Keys;

import static com.travelocity.page.BusquedaPrincipalPage.*;


public class BuscarAuto {

    public static Performable conOrigenDestino(String origen, String destino) {
        return Task.where("{0} selecciona un auto en"+ origen + "hasta '" + destino + "'",
                Open.url("https://www.travelocity.com/es/"),
                Click.on(BUSQUEDA_AUTO),
                Click.on(BUT_AUTO_ORIGEN),
                Enter.theValue(origen).into(BUT_AUTO_ORIGEN2).thenHit(Keys.DOWN),
                Click.on(BUT_AUTO_DESTINO),
                Enter.theValue(destino).into(BUT_AUTO_DESTINO2).thenHit(Keys.ENTER),
                Click.on(BUT_FECHA),
                Click.on(FECHA_1.of("10")),
                Click.on(FECHA_2.of("20")),
                Click.on(FECHA_LISTO),
                Click.on(BUSCAR)
        );
    }
}
