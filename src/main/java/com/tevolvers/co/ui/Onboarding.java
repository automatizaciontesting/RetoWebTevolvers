package com.tevolvers.co.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Onboarding extends PageObject {
    public static final Target BTN_LOGIN= Target.the("Boton login")
            .located(By.id("HeaderControl_Login_CD"));

    public static final Target TXT_ROOMS= Target.the("Txt rooms")
            .located(By.id("MainContentPlaceHolder_SearchPanel_SearchPanelLayout_RoomsComboBox_I"));

    public static final Target TXT_ADULTS= Target.the("Txt adults")
            .located(By.id("MainContentPlaceHolder_SearchPanel_SearchPanelLayout_AdultsSpinEdit_I"));

    public static final Target TXT_CHILDREN= Target.the("Txt children")
            .located(By.id("MainContentPlaceHolder_SearchPanel_SearchPanelLayout_ChildrenSpinEdit_I"));

    public static final Target BTN_SEARCH= Target.the("Btn search")
            .located(By.id("MainContentPlaceHolder_SearchPanel_SearchPanelLayout_SearchButton_CD"));

    public static final Target BTN_SLIDER_RIGHT= Target.the("Btn carrusel")
            .located(By.id("MainContentPlaceHolder_SpecialOffersImageSlider_nbf"));

    public static final Target TXT_LOCATION= Target.the("Btn location")
            .located(By.id("MainContentPlaceHolder_SearchPanel_SearchPanelLayout_LocationComboBox_I"));

}
