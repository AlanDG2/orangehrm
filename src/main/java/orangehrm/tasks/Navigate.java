package orangehrm.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;


import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Navigate implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.url("https://opensource-demo.orangehrmlive.com/")
        );
    }

    public static Navigate toTheLoginPage() {
        return instrumented(Navigate.class);
    }
}
