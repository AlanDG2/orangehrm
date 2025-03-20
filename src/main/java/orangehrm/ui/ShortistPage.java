package orangehrm.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class ShortistPage {
    public static final Target SHORTLIST_BUTTON = Target.the("Shortlist button")
            .located(By.xpath("//button[text()=' Shortlist ']"));
    public static final Target SHORTLIST_HEADER = Target.the("Shortlist header")
            .located(By.xpath("//h6[text()='Shortlist Candidate']"));
    public static final Target SHORTLIST_SAVE = Target.the("Shortlist save button")
            .located(By.xpath("//button[text()=' Save ']"));
}
