package co.com.choucair.certification.herokuapp.task;

import co.com.choucair.certification.herokuapp.model.Data;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static co.com.choucair.certification.herokuapp.userinterface.RegistAppointment.*;
import static co.com.choucair.certification.herokuapp.util.Variables.MY_LIST;

public class Regist implements Task {
    private List<Data> data;

    public Regist(List<Data> data) {
        this.data = data;
    }

    public static Regist appointment(List<Data> data) {
        return Tasks.instrumented(Regist.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(APPOINTMENT),
                Enter.theValue(data.get(MY_LIST).getDate()).into(APPOINTMENT_DAY),
                Click.on(OBSERVATIONS),
                Enter.theValue(data.get(MY_LIST).getId_patient()).into(PATIENT_ID),
                Enter.theValue(data.get(MY_LIST).getId_doctor()).into(DOCTOR_ID),
                Enter.theValue(data.get(MY_LIST).getObservations()).into(OBSERVATIONS),
                Click.on(SAVE)

        );

    }
}
