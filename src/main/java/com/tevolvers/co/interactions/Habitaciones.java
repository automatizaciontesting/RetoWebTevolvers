package com.tevolvers.co.interactions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import org.openqa.selenium.Keys;

import java.util.List;

import static com.tevolvers.co.ui.Onboarding.TXT_ROOMS;

public class Habitaciones implements Interaction {

    String numeroHabitaciones;
    public Habitaciones(String numeroHabitaciones){
        this.numeroHabitaciones=numeroHabitaciones;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {

        List<WebElementFacade> habitaciones = TXT_ROOMS.resolveAllFor(actor);
        habitaciones.get(0).sendKeys(numeroHabitaciones, Keys.ARROW_DOWN,Keys.ENTER);

    }
}
