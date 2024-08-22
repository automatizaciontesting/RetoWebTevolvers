package com.tevolvers.co.interactions;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HuespedesAdultos implements Interaction {

    String adultos;
    public HuespedesAdultos(String adultos){
        this.adultos=adultos;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {

        List<WebElement> Adultos = Serenity.getDriver().findElements(By.id("MainContentPlaceHolder_SearchPanel_SearchPanelLayout_AdultsSpinEdit_B-4"));

        for (int i = 1; i < Integer.parseInt(adultos)-1; i++) {
            Adultos.get(0).click();
            Adultos.get(0).click();
        }


    }
}
