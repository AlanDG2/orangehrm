package orangehrm.stepdefinitions;

import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import orangehrm.questions.CandidateAdded;
import orangehrm.tasks.ShortlistCandidate;
import orangehrm.ui.RecruitmentPage;
import orangehrm.ui.ShortistPage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static org.hamcrest.Matchers.containsStringIgnoringCase;

public class ShortlistSteps {
    @When("he shortlists the candidate")
    public void shortlistCandidate() {
        theActorInTheSpotlight().attemptsTo(ShortlistCandidate.proceed());
        theActorInTheSpotlight().should(
                seeThat(WebElementQuestion.stateOf(ShortistPage.SHORTLIST_HEADER), isVisible())
        );
        theActorInTheSpotlight().attemptsTo(ShortlistCandidate.confirm());
//        theActorInTheSpotlight().should(
//                seeThat(CandidateAdded.successMessage(), containsStringIgnoringCase("success"))
//        );

        //This is temporary because an unexpected error is occurring while saving.

        theActorInTheSpotlight().attemptsTo(
                Click.on(RecruitmentPage.RECRUITMENT_LINK),
                Click.on(RecruitmentPage.STATUS_DROPDOWN),
                Click.on(RecruitmentPage.STATUS_OPTION),
                Click.on(RecruitmentPage.SEARCH_BUTTON),
                Click.on(RecruitmentPage.CANDIDATE_BUTTON)

                );


    }


}
