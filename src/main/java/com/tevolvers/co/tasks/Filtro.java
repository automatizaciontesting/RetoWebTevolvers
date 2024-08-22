package com.tevolvers.co.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.JavaScriptClick;

import static com.tevolvers.co.ui.Resultados.BTN_APPLY;

public class Filtro implements Task {

    public static Filtro paraRealizarBusqueda(){
        return Tasks.instrumented(Filtro.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                JavaScriptClick.on(BTN_APPLY)
        );
    }
}
