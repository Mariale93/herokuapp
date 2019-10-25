package co.com.choucair.certification.herokuapp.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegistPageDoctor {
    public static final Target NAME = Target.the("name")
            .located(By.id("name"));
    public static final Target ADD_DOCTOR = Target.the("agregar doctor")
            .located(By.xpath("//a[contains(text(),'Agregar Doctor')]"));
    public static final Target LAST_NAME = Target.the("apellido")
            .located(By.id("last_name"));
    public static final Target TEL = Target.the("numero telefonico")
            .located(By.xpath("//input[@id='telephone']"));
    public static final Target ID_TYPE = Target.the("tipo de identificación")
            .located(By.xpath("//select[@id='identification_type']//option"));
    public static final Target ID_NUMBER = Target.the("numero id")
            .located(By.xpath("//input[@id='identification']"));
    public static final Target SAVE = Target.the("guardar")
            .located(By.xpath("//a[@class='btn btn-primary pull-right']"));
}
