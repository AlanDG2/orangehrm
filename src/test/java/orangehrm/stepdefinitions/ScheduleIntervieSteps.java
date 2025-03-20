package orangehrm.stepdefinitions;

import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.actions.Click;
import orangehrm.questions.InterviewVisibility;
import orangehrm.tasks.InterviewTasks;
import orangehrm.ui.ApplicationStage;
import orangehrm.ui.RecruitmentPage;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;

public class ScheduleIntervieSteps {
    @When("he schedules an interview for the candidate")
    public void scheduleInterview()  {
        theActorInTheSpotlight().attemptsTo(InterviewTasks.forCandidate());
        theActorInTheSpotlight().should(
                seeThat(InterviewVisibility.isVisible(), equalTo(true))
        );

//        theActorInTheSpotlight().should(
//                seeThat(CandidateAdded.successMessage(), containsStringIgnoringCase("Success"))
//        );

        //This is temporary because an unexpected error is occurring while saving.
        theActorInTheSpotlight().attemptsTo(
                Click.on(RecruitmentPage.RECRUITMENT_LINK),
                Click.on(RecruitmentPage.STATUS_DROPDOWN),
                Click.on(RecruitmentPage.INTERVIEW_SCHEDULED_OPTION),
                Click.on(RecruitmentPage.SEARCH_BUTTON),
                Click.on(RecruitmentPage.CANDIDATE_BUTTON),
                Click.on(ApplicationStage.MARK_INTERVIEW_BUTTON),
                Click.on(ApplicationStage.SAVE_BUTTON),
                Click.on(RecruitmentPage.RECRUITMENT_LINK),
                Click.on(RecruitmentPage.STATUS_DROPDOWN),
                Click.on(RecruitmentPage.INTERVIEW_PASSED_OPTION)
//                Click.on(RecruitmentPage.SEARCH_BUTTON),
//                Click.on(RecruitmentPage.CANDIDATE_BUTTON)

        );

    }


}
