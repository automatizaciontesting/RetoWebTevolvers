package com.tevolvers.co.stepsdefinition;

import com.tevolvers.co.tasks.LanzarNavegador;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import com.tevolvers.co.tasks.IngresarEnLogueo;
import com.tevolvers.co.questions.LoginSinCaptcha;

import static org.hamcrest.Matchers.equalTo;

public class LoginDxHotelsStepsDefinition {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("como {string} quiero ingresar a la pagina DX Hotels")
    public void ingresarPaginaAvianca(String actor) {
        OnStage.theActorCalled(actor).
                attemptsTo(LanzarNavegador.paraLaPrueba()
                 );
    }

    @When("ingreso credenciales de acceso")
    public void ingresoCredencialesDeAcceso(DataTable dataTable) {
        OnStage.theActorInTheSpotlight().
                attemptsTo(IngresarEnLogueo.lasCredencialesDeUsuario(dataTable)

                );
    }
    @Then("valido mensaje excepcion captcha sin diligenciar")
    public void validoMensajeExcepcionCaptchaSinDiligenciar() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(LoginSinCaptcha.veoMensajeAplicacion(),
                equalTo(true)));
    }

}
