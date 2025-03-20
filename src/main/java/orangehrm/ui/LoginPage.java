package orangehrm.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {
    public static final Target USERNAME = Target.the("Username field").located(By.cssSelector("input[name='username']"));
    public static final Target PASSWORD = Target.the("Password field").located(By.cssSelector("input[name='password']"));
    public static final Target LOGIN_BUTTON = Target.the("Login button").located(By.cssSelector("button[type='submit']"));
    public static final Target DASHBOARD_BANNER = Target.the("Dashboard banner").locatedBy("//h6[text()='Dashboard']");
}