package orangehrm.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class ScheduleInterviewPage {
    public static final Target SCHEDULE_INTERVIEW_BUTTON = Target.the("Schedule interview button")
            .located(By.xpath("//button[text()=' Schedule Interview ']"));
    public static final Target INTERVIEW_HEADER = Target.the("Interview header")
            .located(By.xpath("//h6[text()='Schedule Interview']"));
}
