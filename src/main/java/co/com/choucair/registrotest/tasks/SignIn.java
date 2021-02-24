package co.com.choucair.registrotest.tasks;

import co.com.choucair.registrotest.userinterface.UTestSignInPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class SignIn implements Task {

    private String firstName;
    private String lastName;
    private String email;
    private String birthMonth;
    private String birthday;
    private String birthYear;
    private String language;
    private String city;
    private String postalCode;
    private String country;
    private String device;
    private String model;
    private String system;
    private String password;
    private String confirmPassword;

    public SignIn(String firstName, String lastName, String email, String birthMonth, String birthday,
                  String birthYear, String language, String city, String postalCode, String country, String device,
                  String model, String system, String password,
                  String confirmPassword) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.birthMonth = birthMonth;
        this.birthday = birthday;
        this.birthYear = birthYear;
        this.language = language;
        this.city = city;
        this.postalCode = postalCode;
        this.country = country;
        this.device = device;
        this.model = model;
        this.system = system;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public static SignIn onThePage(String firstName, String lastName, String email, String birthMonth,
                                   String birthday, String birthYear, String language, String city,
                                   String postalCode, String country, String device, String model, String system,
                                   String password, String confirmPassword) {
        return Tasks.instrumented(SignIn.class, firstName, lastName, email, birthMonth, birthday,
                birthYear, language, city, postalCode, country, device, model, system,
                password, confirmPassword);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UTestSignInPage.LOGIN_BUTTON),
                Enter.theValue(firstName).into(UTestSignInPage.INPUT_FIRSTNAME),
                Enter.theValue(lastName).into(UTestSignInPage.INPUT_LASTNAME),
                Enter.theValue(email).into(UTestSignInPage.INPUT_EMAIL),
                SelectFromOptions.byVisibleText(birthMonth).from(UTestSignInPage.SELECT_MONTH),
                SelectFromOptions.byVisibleText(birthday).from(UTestSignInPage.SELECT_DAY),
                SelectFromOptions.byVisibleText(birthYear).from(UTestSignInPage.SELECT_YEAR),
                Click.on(UTestSignInPage.BUTTON_NEXT_FORM),
                Enter.theValue(city).into(UTestSignInPage.INPUT_CITY),
                Enter.theValue(postalCode).into(UTestSignInPage.INPUT_POSTAL_CODE),
                Click.on(UTestSignInPage.BUTTON_NEXT_FORM_2),
                Click.on(UTestSignInPage.INPUT_DEVICE),
                Click.on(UTestSignInPage.LIST_DEVICE.of(device)),
                Click.on(UTestSignInPage.INPUT_MODEL),
                Click.on(UTestSignInPage.LIST_MODEL.of(model)),
                Click.on(UTestSignInPage.INPUT_SYSTEM),
                Click.on(UTestSignInPage.LIST_SYSTEM.of(system)),
                Click.on(UTestSignInPage.BUTTON_NEXT_FORM_3),
                Enter.theValue(password).into(UTestSignInPage.INPUT_PASSWORD),
                Enter.theValue(confirmPassword).into(UTestSignInPage.INPUT_CONFIRM),
                Click.on(UTestSignInPage.INPUT_TERMS),
                Click.on(UTestSignInPage.INPUT_SECURITY),
                Click.on(UTestSignInPage.BUTTON_FINISH));

    }

}
