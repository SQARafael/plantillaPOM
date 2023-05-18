package com.exito.pageObjects;
/*
 * @(#) PaginaInicio.java 11.0
 * Copyright 2023 SQA. Todos los derechos reservados.
 */

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

/**
 * @autor Rafael Chica
 * @Fecha: --o--
 */
@DefaultUrl("https://www.exito.com/")
public class PaginaInicioPageObject extends PageObject {

    //By txtBusquedaArticulo= By.id("downshift-0-input");

    @FindBy(how = How.ID, using = "downshift-0-input")
    public WebElementFacade inputBusqueda;


}
