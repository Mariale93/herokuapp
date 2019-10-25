package co.com.choucair.certification.herokuapp.task;

import co.com.choucair.certification.herokuapp.userinterface.OpenSite;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenThe implements Task {
    private OpenSite openSite;

    public static Performable webSite() {
        return Tasks.instrumented(OpenThe.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(openSite));
    }
}
