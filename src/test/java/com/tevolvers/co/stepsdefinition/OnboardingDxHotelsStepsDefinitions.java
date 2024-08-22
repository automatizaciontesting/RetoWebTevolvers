package com.tevolvers.co.stepsdefinition;

import com.tevolvers.co.questions.LoginSinCaptcha;
import com.tevolvers.co.tasks.CarruselImagenes;
import com.tevolvers.co.tasks.IngresarEnLogueo;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static org.hamcrest.Matchers.equalTo;

public class OnboardingDxHotelsStepsDefinitions {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Then("puedo ver la funcionalidad del carrusel con las imagenes")
    public void puedoVerLaFuncionalidadDelCarruselConLasImagenes() {

        OnStage.theActorInTheSpotlight().
                attemptsTo(
                        CarruselImagenes.enLaAplicacion()
                );

    }

}
