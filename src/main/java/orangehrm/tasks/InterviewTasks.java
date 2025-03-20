package orangehrm.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import orangehrm.ui.ScheduleInterviewPage;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class InterviewTasks implements  Task{

    public static Task forCandidate() {
        return instrumented(InterviewTasks.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(ScheduleInterviewPage.SCHEDULE_INTERVIEW_BUTTON, isClickable()).forNoMoreThan(10).seconds(),
                Click.on(ScheduleInterviewPage.SCHEDULE_INTERVIEW_BUTTON),
                WaitUntil.the(ScheduleInterviewPage.INTERVIEW_HEADER, isVisible()).forNoMoreThan(5).seconds()
        );
    }


}
