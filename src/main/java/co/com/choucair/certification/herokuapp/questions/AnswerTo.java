package co.com.choucair.certification.herokuapp.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.choucair.certification.herokuapp.userinterface.SaveWindow.SAVE_TEXT;

public class AnswerTo implements Question<Boolean> {
    private String status;

    public AnswerTo(String status) {
        this.status = status;
    }

    public static AnswerTo myQuestion(String status) {
        return new AnswerTo(status);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String MESSAGE = Text.of(SAVE_TEXT).viewedBy(actor).asString();
        return (status.equals(MESSAGE));
    }
}
