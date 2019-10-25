package co.com.choucair.certification.herokuapp.runnertags;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions (features = "src/test/resources/feature/herokuapp.feature",
        glue = {"co.com.choucair.certification.herokuapp.stepsdefinitions","co.com.choucair.certification.herokuapp.util"},
        //tags = "@DateAppointment",
        snippets = SnippetType.CAMELCASE)
public class
RunnerTags {

}

