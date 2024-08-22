package com.tevolvers.co.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Resultados extends PageObject {

    public static final Target LBL_RESULTS= Target.the("Label results")
            .located(By.id("MainContentPlaceHolder_HotelsResultsLabel"));

    public static final Target CHK_RATING_1= Target.the("Check rating 1")
            .located(By.id("MainContentPlaceHolder_FilterFormLayout_OurRatingCheckBoxList_RB0_I_D"));

    public static final Target CHK_RATING_2= Target.the("Check rating 2")
            .located(By.id("MainContentPlaceHolder_FilterFormLayout_OurRatingCheckBoxList_RB1_I_D"));

    public static final Target BTN_APPLY= Target.the("Boton apply")
            .located(By.xpath("//span[text()='APPLY']"));

    public static final Target BTN_CHEAPER_PRICE= Target.the("label precio bajo")
            .located(By.xpath("//*[text()='{0}']"));

}
