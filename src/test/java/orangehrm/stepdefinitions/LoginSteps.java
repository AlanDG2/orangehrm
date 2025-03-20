package orangehrm.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import orangehrm.questions.DashboardVisibility;
import orangehrm.tasks.LoginWithCredentials;
import orangehrm.tasks.Navigate;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import static org.hamcrest.CoreMatchers.equalTo;

public class LoginSteps {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("{string} logs in with valid credentials")
    public void fullLoginProcess(String actorName) {
        theActorCalled(actorName).attemptsTo(
                Navigate.toTheLoginPage(),
                LoginWithCredentials.using("Admin", "admin123")
        );
        theActorInTheSpotlight().should(
                seeThat(DashboardVisibility.bannerText(), equalTo("Dashboard"))
        );
    }


}