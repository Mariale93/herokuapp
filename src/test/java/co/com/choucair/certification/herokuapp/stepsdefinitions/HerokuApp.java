package co.com.choucair.certification.herokuapp.stepsdefinitions;

import co.com.choucair.certification.herokuapp.model.Data;
import co.com.choucair.certification.herokuapp.questions.AnswerTo;
import co.com.choucair.certification.herokuapp.task.OpenThe;
import co.com.choucair.certification.herokuapp.task.Regist;
import co.com.choucair.certification.herokuapp.task.RegistDoctor;
import co.com.choucair.certification.herokuapp.task.RegistPatient;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class HerokuApp {

    @Given("^that the (.*) needs to entry at platform$")
    public void thatTheUserNeedsToEntryAtPlatform(String aleja)  {
        theActorCalled(aleja).wasAbleTo(OpenThe.webSite());
    }

    @When("^She does the doctor regist in the administration hospital system$")
    public void sheDoesTheDoctorRegistInTheAdministrationHospitalSystem(List<Data> data)  {
        theActorInTheSpotlight().attemptsTo(RegistDoctor.doctor(data));
    }


    @Then("^She will verify on the screen the message (.*)$")
    public void sheWillVerifyOnTheScreenTheMessageDatosGuardadosCorrectamente(String status)  {
        theActorInTheSpotlight().should(seeThat(AnswerTo.myQuestion(status)));
    }

    @When("^She does the patient regist in the administration hospital system$")
    public void sheDoesThePatientRegistInTheAdministrationHospitalSystem(List<Data> data) {
        theActorInTheSpotlight().attemptsTo(RegistPatient.patient(data));

    }

    @When("^She entries the corresponses data to the appointment$")
    public void sheEntriesTheCorresponsesDataToTheAppointment(List<Data> data) {
        theActorInTheSpotlight().attemptsTo(Regist.appointment(data));
    }

}
