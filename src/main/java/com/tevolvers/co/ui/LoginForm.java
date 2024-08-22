package com.tevolvers.co.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginForm extends PageObject {

    public static final Target TXT_EMAIL= Target.the("Txt email")
            .located(By.xpath("//*[@value='Email']"));

    public static final Target TXT_PASSWORD= Target.the("Txt password")
            .located(By.id("HeaderControl_LogonControl_LoginFormLayout_txtPassword_I_CLND"));

    public static final Target BTN_LOGIN_FORM= Target.the("BTN login")
            .located(By.id("HeaderControl_LogonControl_btnLoginNow_CD"));

    public static final Target LBL_EXCEPCION_SIN_CAPTCHA= Target.the("LBL sin diligenciar captcha")
            .located(By.xpath("//td[contains(text(),'The submitted code is incorrect')]"));

}
