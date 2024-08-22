package com.tevolvers.co.tasks;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class RangoPrecio implements Task {

    String montoUsd;
    public RangoPrecio(String montoUsd){
        this.montoUsd=montoUsd;
    }
    public static RangoPrecio deLaNoche(String montoUsd){
        return Tasks.instrumented(RangoPrecio.class,montoUsd);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {

        JavascriptExecutor jse = (JavascriptExecutor) Serenity.getDriver();
        jse.executeScript("arguments[0].innerText='"+montoUsd.replace("USD","")+"'", Serenity.getDriver().findElement(By.xpath("//*[@class='trackbar-container-lr']/div[@id='NightyRateTrackBarLabel_L']")));
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
