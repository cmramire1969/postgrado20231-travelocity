package com.travelocity.page;

import net.serenitybdd.screenplay.targets.Target;

public class ResultadosBusquedasPage {
    public static Target LISTA_DE_RESULTADOS = Target.the("Lista de resultados busquedas").locatedBy("//a[@data-stid='open-hotel-information']");
    public static Target COSTOS_LISTA_DE_RESULTADOS = Target.the("costo de resultado").locatedBy("//span[@data-stid='price-lockup-text']");
    public static Target PRIMER_COSTOS_LISTA_DE_RESULTADOS = Target.the("primer costo de resultado").locatedByFirstMatching("//span[@data-stid='price-lockup-text']");
}
