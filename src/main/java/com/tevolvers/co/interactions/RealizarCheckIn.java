package com.tevolvers.co.interactions;

import com.tevolvers.co.utils.Helpers;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class RealizarCheckIn implements Interaction {

    Helpers help = new Helpers();
    @Override
    public <T extends Actor> void performAs(T actor) {

        List<WebElement> fechaCheckIn = Serenity.getDriver().findElements(By.id("MainContentPlaceHolder_SearchPanel_SearchPanelLayout_CheckInDateEdit_I"));
        fechaCheckIn.get(0).clear();
        fechaCheckIn.get(0).sendKeys(help.fechaPosterior("dd MMMM yyyy",2));

    }

}
