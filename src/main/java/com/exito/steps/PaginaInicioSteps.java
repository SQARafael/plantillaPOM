package com.exito.steps;
/*
 * @(#) PaginaInicioSteps.java 11.0
 * Copyright 2023 SQA. Todos los derechos reservados.
 */

import com.exito.pageObjects.PaginaInicioPageObject;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

/**
 * @autor Rafael Chica
 * @Fecha: --o--
 */
public class PaginaInicioSteps {
    //PaginaInicioPageObject paginaInicioPageObject= new PaginaInicioPageObject();

    @Page
    private PaginaInicioPageObject paginaInicio;

    @Step("Usuario abre la url")
    public void abrirUrl(){
        paginaInicio.open();
    }

    @Step("Escribir nombre de articulo")
    public void escribirArticulo(){
        paginaInicio.inputBusqueda.type("zapatos");
    }
}
