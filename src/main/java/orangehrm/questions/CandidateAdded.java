package orangehrm.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import orangehrm.ui.RecruitmentPage;

public class CandidateAdded  implements Question<String>{
    @Override
    public String answeredBy(Actor actor) {
        return Text.of(RecruitmentPage.SUCCESS_ALERT).answeredBy(actor);
    }
    public static CandidateAdded successMessage(){
    return new CandidateAdded();
    }

}