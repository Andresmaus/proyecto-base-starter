package prueba.framework.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import prueba.framework.interfaces.PaginaLocalizadora;

public class Buscar {
    public static Performable formularioBlockV() {
        return Task.where("Buscamos el formulario Block Validation", Click.on(PaginaLocalizadora.FORMS),
                Click.on(PaginaLocalizadora.FORM_VALIDATION),
                Click.on(PaginaLocalizadora.ELIMINAR_POPUP_VALIDATION));
    }
}
