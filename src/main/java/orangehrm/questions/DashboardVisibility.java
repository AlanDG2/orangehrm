package orangehrm.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static orangehrm.ui.LoginPage.DASHBOARD_BANNER;


public class DashboardVisibility  implements  Question<String>{

    @Override
    public String answeredBy(Actor actor) {

        return Text.of(DASHBOARD_BANNER).answeredBy(actor);
    }

    public static DashboardVisibility bannerText() {
        return new DashboardVisibility();
    }

}