package com.tevolvers.co.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.tevolvers.co.ui.Resultados.*;

public class Calificacion implements Interaction {

    public static Calificacion delHospedaje(){
        return Tasks.instrumented(Calificacion.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CHK_RATING_1),
                Click.on(CHK_RATING_2)
        );
    }
}
