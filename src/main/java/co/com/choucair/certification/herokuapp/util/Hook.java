package co.com.choucair.certification.herokuapp.util;

import cucumber.api.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class Hook {
    @Before
    public void herokuapp(){
        OnStage.setTheStage(new OnlineCast());
    }
}
