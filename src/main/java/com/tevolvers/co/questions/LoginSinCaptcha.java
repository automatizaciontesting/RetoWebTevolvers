package com.tevolvers.co.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.tevolvers.co.ui.LoginForm.LBL_EXCEPCION_SIN_CAPTCHA;

public class LoginSinCaptcha implements Question<Boolean> {

    public static LoginSinCaptcha veoMensajeAplicacion(){
        return new LoginSinCaptcha();
    }
    @Override
    public Boolean answeredBy(Actor actor) {
        return LBL_EXCEPCION_SIN_CAPTCHA.isVisibleFor(actor);
    }
}
