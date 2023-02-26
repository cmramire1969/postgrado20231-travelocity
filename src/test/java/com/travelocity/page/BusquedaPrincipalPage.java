package com.travelocity.page;

import net.serenitybdd.screenplay.targets.Target;

public class BusquedaPrincipalPage {
    public static Target BUT_DESTINO = Target.the("busqueda button destino de hopedaje").locatedBy("//button[@data-stid='location-field-destination-menu-trigger']");
    public static Target DESTINO = Target.the("busqueda input destino de hopedaje").locatedBy("//input[@id='location-field-destination']");
    public static Target BUT_FECHA = Target.the("boton fecha in").locatedBy("//button[@id='d1-btn']");
    public static Target FECHA_1 = Target.the("fecha in seleccion").locatedBy("//button[@aria-label='5 de abril de 2023']");
    public static Target FECHA_2 = Target.the("fecha out seleccion").locatedBy("//button[@aria-label='15 de abril de 2023']");
    public static Target FECHA_3 = Target.the("fecha in seleccion").locatedBy("//button[@aria-label='5 de abril de 2023']");
    public static Target FECHA_4 = Target.the("fecha out seleccion").locatedBy("//button[@aria-label='15 de abril de 2023']");
    public static Target FECHA_LISTO = Target.the("listo fecha").locatedBy("//button[@data-stid='apply-date-picker']");
    public static Target BUSCAR = Target.the("boton hospedaje buscar").locatedBy("//button[@data-testid='submit-button']");
    public static Target BUSQUEDA_PAQUETES = Target.the("boton buscar paquetes").locatedBy("//span[text()='Paquetes']/..");
    public static Target BUT_ORIGEN = Target.the("boton origen").locatedBy("//button[@data-stid='location-field-origin-menu-trigger']");
    public static Target ORIGEN = Target.the("origen").locatedBy("//input[@id='location-field-origin']");

  public static Target BUSQUEDA_ACTIVIDAD = Target.the("boton buscar actividad").locatedBy("//span[text()='Actividades']/..");

  public static Target BUT_ACTIVIDAD_ORIGEN = Target.the("boton origen").locatedBy("//button[@data-stid=\'location-field-location-menu-trigger']");

    public static Target BUT_ACTIVIDAD_ORIGEN2 = Target.the("origen").locatedBy("//input[@id='location-field-location']");

    // busqueda de vuelos
    public static Target BUSQUEDA_VUELO = Target.the("boton buscar actividad").locatedBy("//span[text()='Vuelos']/..");
    public static Target BUT_VUELO_ORIGEN = Target.the("boton origen").locatedBy("//button[@data-stid='location-field-leg1-origin-menu-trigger']");
    public static Target BUT_VUELO_ORIGEN2 = Target.the("origen").locatedBy("//input[@id='location-field-leg1-origin']");
    public static Target BUT_VUELO_DESTINO = Target.the("busqueda button destino de vuelo").locatedBy("//button[@data-stid='location-field-leg1-destination-menu-trigger']");
    public static Target BUT_VUELO_DESTINO2 = Target.the("busqueda button destino de vuelo").locatedBy("//input[@id='location-field-leg1-destination']");
   //public static Target BUT_VUELO_FECHA = Target.the("boton fecha in").locatedBy("//button[@id='d1-btn']");

    // busqueda de autos
    public static Target BUSQUEDA_AUTO = Target.the("boton buscar auto").locatedBy("//span[text()='Autos']/..");
    public static Target BUT_AUTO_ORIGEN = Target.the("boton origen").locatedBy("//button[@data-stid='location-field-locn-menu-trigger']");
    public static Target BUT_AUTO_ORIGEN2 = Target.the("origen").locatedBy("//input[@id='location-field-locn']");
    public static Target BUT_AUTO_DESTINO = Target.the("busqueda button destino de auto").locatedBy("//button[@data-stid='location-field-loc2-menu-trigger']");
    public static Target BUT_AUTO_DESTINO2 = Target.the("busqueda button destino de auto").locatedBy("//input[@id='location-field-loc2']");

  }
