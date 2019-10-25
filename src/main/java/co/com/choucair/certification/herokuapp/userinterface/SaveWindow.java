package co.com.choucair.certification.herokuapp.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SaveWindow extends PageObject {
    public static final Target SAVE_TEXT = Target.the("guardado correctamente")
            .located(By.xpath("//p[contains(text(),'Datos guardados correctamente.')]"));
}
