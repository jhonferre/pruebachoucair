package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.userinterface.ChoucairLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login implements Task {
    private String User;
    private String Password;

    public Login(String strUser, String strPassword) {
        this.User = strUser;
        this.Password = strPassword;
    }


    public static Login inThePage(String strUser, String strPassword) {
        return Tasks.instrumented(Login.class,strUser,strPassword);

    }
    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(Click.on(ChoucairLoginPage.LOGIN_BUTTON),
                Enter.theValue(User).into(ChoucairLoginPage.INPUT_USER),
                Enter.theValue(Password).into(ChoucairLoginPage.INPUT_PASSWORD),
                Click.on(ChoucairLoginPage.ENTER_BUTTON));

    }
}
