package orangehrm.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RecruitmentPage {
    // Enlaces
    public static final Target RECRUITMENT_LINK = Target.the("Recruitment link")
            .located(By.xpath("//a[contains(., 'Recruitment')]"));

    // Botones
    public static final Target ADD_BUTTON = Target.the("Add button")
            .located(By.xpath("//button[text()=' Add ']"));
    public static final Target SAVE_BUTTON = Target.the("Save button")
            .located(By.xpath("//button[contains(.,' Save ')]"));

    // Campos del formulario
    public static final Target FIRST_NAME = Target.the("First name")
            .located(By.cssSelector("input[name='firstName']"));
    public static final Target MIDDLE_NAME = Target.the("Middle name")
            .located(By.cssSelector("input[name='middleName']"));
    public static final Target LAST_NAME = Target.the("Last name")
            .located(By.cssSelector("input[name='lastName']"));
    public static final Target VACANCY_DROPDOWN = Target.the("Vacancy dropdown")
            .located(By.xpath("//label[text()='Vacancy']/../../div[contains(., '-- Select --')]"));
    public static final Target VACANCY_OPTION = Target.the("Vacancy dropdown")
            .located(By.xpath("//span[text()='Junior Account Assistant']"));

    public static final Target EMAIL = Target.the("Email")
            .located(By.xpath("//label[text()='Email']/../..//input"));
    public static final Target PHONE = Target.the("Phone")
            .located(By.xpath("//label[text()='Contact Number']/../..//input"));
    public static final Target RESUME_UPLOAD = Target.the("Resume upload")
            .located(By.cssSelector("input[type='file']"));
    public static final Target SUCCESS_ALERT = Target.the("succes alert")
            .located(By.id("oxd-toaster_1"));

    public static final Target STATUS_DROPDOWN = Target.the("Status dropdown")
            .located(By.xpath("//label[text()='Status']/../../div[contains(., '-- Select --')]"));
    public static final Target STATUS_OPTION = Target.the("Status Option")
            .located(By.xpath("//span[text()='Shortlisted']"));
    public static final Target APPLICATION_INITIADED_OPTION = Target.the("Application initiated")
            .located(By.xpath("//span[text()='Application Initiated']"));
    public static final Target INTERVIEW_SCHEDULED_OPTION = Target.the("Interview schedule option")
            .located(By.xpath("//span[text()='Interview Scheduled']"));
    public static final Target INTERVIEW_PASSED_OPTION = Target.the("Interview passed option")
            .located(By.xpath("//span[text()='Interview Passed']"));
    public static final Target JOB_OFFERED_OPTION = Target.the("Job offered option")
            .located(By.xpath("//span[text()='Job Offered']"));
    public static final Target HIRED_OPTION = Target.the("Hired option")
            .located(By.xpath("//span[text()='Hired']"));
    public static final Target SEARCH_BUTTON = Target.the("Search button")
            .located(By.xpath("//button[text()=' Search ']"));
    public static final Target CANDIDATE_BUTTON = Target.the("Candidate button")
            .located(By.xpath("(//i[@class='oxd-icon bi-eye-fill']/..)[1]"));





}