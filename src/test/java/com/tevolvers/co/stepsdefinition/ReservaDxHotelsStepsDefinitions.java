package com.tevolvers.co.stepsdefinition;

import com.tevolvers.co.questions.Resultados;
import com.tevolvers.co.questions.ValidarReserva;
import com.tevolvers.co.tasks.*;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static org.hamcrest.Matchers.equalTo;

public class ReservaDxHotelsStepsDefinitions {


    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @When("ingreso datos de reserva hotel")
    public void ingresoDatosDeReservaHotel(DataTable dataTable) {
        OnStage.theActorInTheSpotlight().
                attemptsTo(DiligenciarReserva.delHuesped(dataTable)
                );

        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Resultados.deLaBusqueda(),
                equalTo(true)));
    }

    @And("rango superior a {string}")
    public void rangoSuperiorDolares(String montoUsd) {
        OnStage.theActorInTheSpotlight().
                attemptsTo(RangoPrecio.deLaNoche(montoUsd)
                );
    }


    @And("seleccionar 3 estrellas o mas")
    public void seleccionarTresEstrellasOMas() {
        OnStage.theActorInTheSpotlight().
                attemptsTo(Calificacion.delHospedaje()
                );
    }

    @And("seleccionar filtro")
    public void seleccionarFiltro() {
        OnStage.theActorInTheSpotlight().
                attemptsTo(Filtro.paraRealizarBusqueda()
                );
    }

    @And("valido el hotel mas economico")
    public void validoElHotelMasEconomico() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(new ValidarReserva(),
                equalTo(true)));

    }

}
