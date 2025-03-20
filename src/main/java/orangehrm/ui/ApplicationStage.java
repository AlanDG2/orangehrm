package orangehrm.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class ApplicationStage {
    public static final Target MARK_INTERVIEW_BUTTON = Target.the("Mark Interview button")
            .located(By.xpath("//button[text()=' Mark Interview Passed ']"));
    public static final Target SAVE_BUTTON = Target.the("Shortlist save button")
            .located(By.xpath("//button[text()=' Save ']"));
}
