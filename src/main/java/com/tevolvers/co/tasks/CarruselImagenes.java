package com.tevolvers.co.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.ScrollTo;
import org.openqa.selenium.WebElement;

import static com.tevolvers.co.ui.Onboarding.BTN_SLIDER_RIGHT;

public class CarruselImagenes implements Task {

    public static CarruselImagenes enLaAplicacion(){
        return Tasks.instrumented(CarruselImagenes.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        WebElement elemento= BTN_SLIDER_RIGHT.resolveFor(actor);
        for (int i = 0; i <= 10; i++) {
            elemento.isDisplayed();
            elemento.click();
        }
    }
}
