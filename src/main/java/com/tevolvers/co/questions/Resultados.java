package com.tevolvers.co.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.tevolvers.co.ui.Resultados.LBL_RESULTS;

public class Resultados implements Question<Boolean> {

    public static Resultados deLaBusqueda(){
        return new Resultados();
    }
    @Override
    public Boolean answeredBy(Actor actor) {
        return LBL_RESULTS.isVisibleFor(actor);
    }
}
