    package orangehrm.tasks;

    import net.serenitybdd.screenplay.Actor;
    import net.serenitybdd.screenplay.Task;
    import net.serenitybdd.screenplay.actions.Click;
    import net.serenitybdd.screenplay.actions.Enter;
    import net.serenitybdd.screenplay.waits.WaitUntil;


    import static net.serenitybdd.screenplay.Tasks.instrumented;
    import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
    import static orangehrm.ui.LoginPage.*;


    public class LoginWithCredentials implements  Task {

        private final String username;
        private  final  String password;

        public LoginWithCredentials(String username, String password) {
            this.username =username;
            this.password = password;
        }
        public static LoginWithCredentials using(String username, String password) {
            return new LoginWithCredentials(username,password);


        }

        @Override
        public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo(
                    Enter.theValue(username).into(USERNAME),
                    Enter.theValue(password).into(PASSWORD),
                    WaitUntil.the(LOGIN_BUTTON, isVisible()).forNoMoreThan(10).seconds(),
                    Click.on(LOGIN_BUTTON)
            );
        }
    }