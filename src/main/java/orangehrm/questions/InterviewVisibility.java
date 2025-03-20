package orangehrm.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import orangehrm.ui.ScheduleInterviewPage;

public class InterviewVisibility  implements Question<Boolean>{

    @Override
    public  Boolean answeredBy(Actor actor) {
        return ScheduleInterviewPage.INTERVIEW_HEADER.resolveFor(actor).isVisible();
    }
    public static  InterviewVisibility isVisible(){
        return new InterviewVisibility();
    }
}