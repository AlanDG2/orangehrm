package orangehrm.tasks;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import orangehrm.ui.RecruitmentPage;
import orangehrm.ui.ShortistPage;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ShortlistCandidate {
    public static Task proceed() {
        return Task.where("{0} shortlists the candidate",
                WaitUntil.the(ShortistPage.SHORTLIST_BUTTON, isClickable()).forNoMoreThan(10).seconds(),
                Click.on(ShortistPage.SHORTLIST_BUTTON),
                WaitUntil.the(ShortistPage.SHORTLIST_HEADER, isVisible()).forNoMoreThan(5).seconds()
        );
    }

    public static Task confirm() {
        return Task.where("{0} confirms shortlist",
                Click.on(ShortistPage.SHORTLIST_SAVE),
                WaitUntil.the(RecruitmentPage.SUCCESS_ALERT, isVisible()).forNoMoreThan(10).seconds()
        );
    }
}