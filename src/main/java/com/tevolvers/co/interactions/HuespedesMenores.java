package com.tevolvers.co.interactions;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HuespedesMenores implements Interaction {

    String menores;
    public HuespedesMenores(String menores){
        this.menores=menores;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {

        List<WebElement> children = Serenity.getDriver().findElements(By.id("MainContentPlaceHolder_SearchPanel_SearchPanelLayout_ChildrenSpinEdit_B-4"));

        for (int i = 0; i < Integer.parseInt(menores)-1; i++) {
            children.get(0).click();
            children.get(0).click();
        }

    }
}
