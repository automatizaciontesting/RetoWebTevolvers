package com.tevolvers.co.questions;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.thucydides.core.annotations.findby.By;
import org.openqa.selenium.WebElement;

import java.util.Arrays;
import java.util.List;

public class ValidarReserva implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        List<WebElement> valorHospedaje = Serenity.getDriver().findElements(By.xpath("//*[@class='price']"));
        double [] valoresHospedajes = new double[valorHospedaje.size()];
        int posicion=0;
        for(WebElement elemento :valorHospedaje){
            valoresHospedajes[posicion] = Double.parseDouble(elemento.getText().replace("$",""));
            posicion++;
        }
        Arrays.sort(valoresHospedajes);
        double reservaEconomica = valoresHospedajes[0];
        WebElement elemento = Serenity.getDriver().findElement(By.xpath("//*[text()='$"+reservaEconomica+"']"));
        Serenity.recordReportData().withTitle("El valor más bajo es:").andContents(String.valueOf("$"+reservaEconomica));
        return elemento.isDisplayed();
    }
}
