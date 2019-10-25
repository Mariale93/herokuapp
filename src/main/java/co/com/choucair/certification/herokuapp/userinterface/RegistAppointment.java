package co.com.choucair.certification.herokuapp.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegistAppointment {
    public static final Target APPOINTMENT = Target.the("cita medica")
            .located(By.xpath("//a[contains(text(),'Agendar Cita')]"));
    public static final Target APPOINTMENT_DAY = Target.the("fecha cita")
            .located(By.id("datepicker"));
    public static final Target PATIENT_ID = Target.the("id paciente")
            .located(By.xpath("//input[@placeholder='Ingrese el documento de identidad del paciente']"));
    public static final Target DOCTOR_ID = Target.the("id doctor")
            .located(By.xpath("//input[@placeholder='Ingrese el documento de identidad del doctor']"));
    public static final Target OBSERVATIONS = Target.the("obsevaciones")
            .located(By.xpath("//textarea[@class='form-control']"));
    public static final Target SAVE = Target.the("guardar")
            .located(By.xpath("//a[@class='btn btn-primary pull-right']"));
}
