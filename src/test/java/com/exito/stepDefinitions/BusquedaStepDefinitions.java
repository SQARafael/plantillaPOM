package com.exito.stepDefinitions;
/*
 * @(#) BusquedaStepDefinitions.java 11.0
 * Copyright 2023 SQA. Todos los derechos reservados.
 */

import com.exito.steps.PaginaInicioSteps;
import io.cucumber.java.es.*;
import net.thucydides.core.annotations.Steps;

/**
 * @autor Rafael Chica
 * @Fecha: --o--
 */
public class BusquedaStepDefinitions {

    @Steps
    PaginaInicioSteps paginaInicioSteps;

    @Dado("que el usuario abra el sitio web")
    public void queElUsuarioAbraElSitioWeb() {
        paginaInicioSteps.abrirUrl();
    }
    @Cuando("ingrese el articulo a buscar y le de clic al articulo")
    public void buscarArticulo() {
        paginaInicioSteps.escribirArticulo();
        paginaInicioSteps.seleccionarProducto();

    }
    @Entonces("puede visualizar el nombre del articulo en pantalla")
    public void validarNombreArticulo() {

    }


}
