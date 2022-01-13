package prueba.framework.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import prueba.framework.interfaces.PaginaLocalizadora;

public class Validar {
    public static Performable blockValidation() {
        return Task.where("Validar Formulario", Click.on(PaginaLocalizadora.BOTON_VALIDAR));
    }
}
