package com.tevolvers.co.tasks;

import com.tevolvers.co.ui.Onboarding;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class LanzarNavegador {
    public static Performable paraLaPrueba() {
        return Task.where(
                actor -> {
                    Open.browserOn().the(Onboarding.class).performAs(actor);
                }
        );
    }
}
