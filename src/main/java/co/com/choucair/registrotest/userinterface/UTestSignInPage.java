package co.com.choucair.registrotest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UTestSignInPage {

    public static final Target LOGIN_BUTTON = Target.the("button to register").
            located(By.xpath("//a[@class='unauthenticated-nav-bar__sign-up']"));
    public static final Target INPUT_FIRSTNAME = Target.the("first name").
            located(By.id("firstName"));
    public static final Target INPUT_LASTNAME = Target.the("last name").
            located(By.id("lastName"));
    public static final Target INPUT_EMAIL = Target.the("email").
            located(By.id("email"));
    public static final Target SELECT_MONTH = Target.the("month").
            located(By.id("birthMonth"));
    public static final Target SELECT_DAY = Target.the("day").
            located(By.id("birthDay"));
    public static final Target SELECT_YEAR = Target.the("year").
            located(By.id("birthYear"));
    public static final Target SELECT_LANGUAGE = Target.the("language").
            located(By.id("languages"));
    public static final Target BUTTON_NEXT_FORM = Target.the("next button").
            located(By.xpath("//a[@class='btn btn-blue']"));
    public static final Target INPUT_CITY = Target.the("city").
            located(By.id("city"));
    public static final Target INPUT_POSTAL_CODE = Target.the("postal code").
            located(By.id("zip"));
    public static final Target INPUT_COUNTRY = Target.the("country").
            located(By.name("countryId"));
    public static final Target BUTTON_NEXT_FORM_2 = Target.the("next button").
            located(By.xpath("//a[@class = 'btn btn-blue pull-right']"));
    public static final Target INPUT_DEVICE = Target.the("device").
            located(By.xpath("//*[@id=\"mobile-device\"]/div[1]/div[2]/div/div[1]"));
    public static final Target LIST_DEVICE = Target.the("devices list").
            locatedBy ("//div[contains(text(),'{0}')]");
    public static final Target INPUT_MODEL = Target.the("smartphone model").
            located(By.xpath("//*[@id=\"mobile-device\"]/div[2]/div[2]/div/div[1]"));
    public static final Target LIST_MODEL = Target.the("models list").
            locatedBy ("//div[contains(text(),'{0}')]");
    public static final Target INPUT_SYSTEM = Target.the("operation system").
            located(By.xpath("//*[@id=\"mobile-device\"]/div[3]/div[2]/div/div[1]"));
    public static final Target LIST_SYSTEM = Target.the("op list").
            locatedBy ("//div[contains(text(),'{0}')]");
    public static final Target BUTTON_NEXT_FORM_3 = Target.the("next button").
            located(By.xpath("//a[@class = 'btn btn-blue pull-right']"));
    public static final Target INPUT_PASSWORD =Target.the("password").
            located(By.id("password"));
    public static final Target INPUT_CONFIRM =Target.the("confirm password").
            located(By.id("confirmPassword"));
    public static final Target INPUT_TERMS = Target.the("terms of use").
            located(By.id("termOfUse"));
    public static final Target INPUT_SECURITY = Target.the("privacy settings").
            located(By.id("privacySetting"));
    public static final Target BUTTON_FINISH = Target.the("finish button").
            located(By.id("laddaBtn"));
}
