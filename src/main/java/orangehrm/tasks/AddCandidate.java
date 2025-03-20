package orangehrm.tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;
import orangehrm.ui.RecruitmentPage;
import orangehrm.utils.DataGenerator;

import java.nio.file.Paths;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class AddCandidate implements Task {

    public static AddCandidate withFakeData() {
        return instrumented(AddCandidate.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Click.on(RecruitmentPage.RECRUITMENT_LINK),
                WaitUntil.the(RecruitmentPage.ADD_BUTTON, isClickable()).forNoMoreThan(10).seconds(),
                Click.on(RecruitmentPage.ADD_BUTTON),

                Enter.theValue(DataGenerator.getFirstName()).into(RecruitmentPage.FIRST_NAME),
                Enter.theValue(DataGenerator.getMiddleName()).into(RecruitmentPage.MIDDLE_NAME),
                Enter.theValue(DataGenerator.getLastName()).into(RecruitmentPage.LAST_NAME),

                Click.on(RecruitmentPage.VACANCY_DROPDOWN),
                Click.on(RecruitmentPage.VACANCY_OPTION),

                Enter.theValue(DataGenerator.getEmail()).into(RecruitmentPage.EMAIL),
                Enter.theValue(DataGenerator.getPhoneNumber()).into(RecruitmentPage.PHONE),

                Upload.theFile(Paths.get("src/test/resources/utils/resume.pdf")).to(RecruitmentPage.RESUME_UPLOAD),

                WaitUntil.the(RecruitmentPage.SAVE_BUTTON, isClickable()).forNoMoreThan(10).seconds(),
                Click.on(RecruitmentPage.SAVE_BUTTON)
        );
    }
}