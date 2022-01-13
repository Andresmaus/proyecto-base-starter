package prueba.framework.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class Abrir {
    public static Performable paginaColor() {
        return Task.where(" abre la pagina de inicio de Color Lib",
                Open.browserOn().the(ColorLipPage.class));
    }
}
