package co.com.choucair.certification.herokuapp.task;

import co.com.choucair.certification.herokuapp.interactions.SelectObject;
import co.com.choucair.certification.herokuapp.model.Data;


import static co.com.choucair.certification.herokuapp.userinterface.RegistPagePatient.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static co.com.choucair.certification.herokuapp.util.Variables.MY_LIST;

public class RegistPatient implements Task {
    private final List<Data> data;

    public RegistPatient(List<Data> data) {
        this.data = data;
    }

    public static RegistPatient patient(List<Data> data) {
        return Tasks.instrumented(RegistPatient.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ADD_PATIENT),
                Enter.theValue(data.get(MY_LIST).getName()).into(NAME),
                Enter.theValue(data.get(MY_LIST).getLast_name()).into(LAST_NAME),
                Enter.theValue(data.get(MY_LIST).getTel_number()).into(TEL),
                SelectObject.fromOptions(ID_TYPE, data.get(MY_LIST).getId_type()),
                Enter.theValue(data.get(MY_LIST).getId_number()).into(ID_NUMBER),
                Click.on(SAVE)
        );
    }
}
