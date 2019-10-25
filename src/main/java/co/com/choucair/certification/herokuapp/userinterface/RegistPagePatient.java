package co.com.choucair.certification.herokuapp.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegistPagePatient extends PageObject {
    public static final Target ADD_PATIENT = Target.the("agregar doctor")
            .located(By.xpath("//a[contains(text(),'Agregar Paciente')]"));
    public static final Target NAME = Target.the("name")
            .located(By.xpath("//input[@placeholder='Ingrese el nombre']"));
    public static final Target LAST_NAME = Target.the("apellido")
            .located(By.name("last_name"));
    public static final Target TEL = Target.the("numero telefonico")
            .located(By.xpath("//input[@placeholder='Ingrese el teléfono']"));
    public static final Target ID_TYPE = Target.the("tipo de identificación")
            .located(By.xpath("//select[@name='identification_type']//option"));
    public static final Target ID_NUMBER = Target.the("numero id")
            .located(By.xpath("//input[@placeholder='Ingrese el documento de identidad']"));
    public static final Target SAVE = Target.the("guardar")
            .located(By.xpath("//a[@class='btn btn-primary pull-right']"));
}
