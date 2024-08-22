package com.tevolvers.co.tasks;

import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.SendKeys;

import java.util.List;
import java.util.Map;

import static com.tevolvers.co.ui.LoginForm.*;
import static com.tevolvers.co.ui.Onboarding.BTN_LOGIN;

public class IngresarEnLogueo implements Task {

    private String email;
    private String password;
    public IngresarEnLogueo(DataTable dataTable){
        List<Map<String, String>> datosFeature = dataTable.asMaps();
        this.email = datosFeature.get(0).get("email");
        this.password = datosFeature.get(0).get("password");
    }

    public static IngresarEnLogueo lasCredencialesDeUsuario(DataTable dataTable) {
        return Tasks.instrumented(IngresarEnLogueo.class,dataTable);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BTN_LOGIN),
                Enter.theValue(email).into(TXT_EMAIL),
                Click.on(TXT_PASSWORD),
                Enter.theValue(password).into(TXT_PASSWORD),
                JavaScriptClick.on(BTN_LOGIN_FORM));
    }
}
