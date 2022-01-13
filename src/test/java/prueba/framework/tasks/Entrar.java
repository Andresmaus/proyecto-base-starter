package prueba.framework.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;
import prueba.framework.interfaces.PaginaLocalizadora;

public class Entrar {
    public static Performable loguearse() {
        return Task.where("Logueo de usuario ",Enter.theValue("DEMO")
                    .into(PaginaLocalizadora.USER),
                    Enter.theValue("DEMO").into(PaginaLocalizadora.PASSWORK),
                Click.on(PaginaLocalizadora.REMEMBER_ME),
                Click.on(PaginaLocalizadora.SIGN_IN)
        );
    }
}
