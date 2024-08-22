package com.tevolvers.co.tasks;

import com.tevolvers.co.interactions.*;
import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import org.openqa.selenium.Keys;
import java.util.List;
import java.util.Map;

import static com.tevolvers.co.ui.Onboarding.*;

public class DiligenciarReserva implements Task {

    String destino;
    String habitaciones;
    String adultos;
    String menores;

    public DiligenciarReserva(DataTable dataTable){
        List<Map<String, String>> datosFeature = dataTable.asMaps();
        this.destino = datosFeature.get(0).get("destino");
        this.habitaciones = datosFeature.get(0).get("habitaciones");
        this.adultos = datosFeature.get(0).get("adultos");
        this.menores = datosFeature.get(0).get("menores");

    }

    public static DiligenciarReserva delHuesped(DataTable datatable){
        return Tasks.instrumented(DiligenciarReserva.class,datatable);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(destino).into(TXT_LOCATION).thenHit(Keys.TAB),
                new RealizarCheckIn(),
                new RealizarCheckOut(),
                new Habitaciones(habitaciones),
                new HuespedesAdultos(adultos),
                new HuespedesMenores(menores),
                JavaScriptClick.on(BTN_SEARCH)

        );
    }

}
