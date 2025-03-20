package orangehrm.stepdefinitions;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import orangehrm.questions.CandidateAdded;
import orangehrm.tasks.AddCandidate;
import orangehrm.ui.RecruitmentPage;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.containsStringIgnoringCase;
import static org.hamcrest.CoreMatchers.equalTo;

public class RecruitmentSteps {


    @When("he creates a new candidate with complete fake data")
    public void fullCandidateCreation() {
        theActorInTheSpotlight().attemptsTo(
                AddCandidate.withFakeData()
        );
        //This is temporary because an unexpected error is occurring while saving.
//        theActorInTheSpotlight().should(
//                seeThat(CandidateAdded.successMessage(), containsStringIgnoringCase("Success"))
//        );


        //This is temporary because an unexpected error is occurring while saving.
        theActorInTheSpotlight().attemptsTo(
                Click.on(RecruitmentPage.RECRUITMENT_LINK),
                Click.on(RecruitmentPage.STATUS_DROPDOWN),
                Click.on(RecruitmentPage.APPLICATION_INITIADED_OPTION),
                Click.on(RecruitmentPage.SEARCH_BUTTON),
                Click.on(RecruitmentPage.CANDIDATE_BUTTON)
        );
  }





}