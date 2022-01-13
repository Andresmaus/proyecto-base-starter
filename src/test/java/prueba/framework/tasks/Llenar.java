package prueba.framework.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import prueba.framework.interfaces.PaginaLocalizadora;

public class Llenar {
    public static Performable formulario() {
        return Task.where("Llenar formulario Block",
                Enter.theValue("Andres Sanchez").into(PaginaLocalizadora.REQUERID),
                Enter.theValue("ASANCHEZB@CHOUCAIRTESTING.COM").into(PaginaLocalizadora.EMAIL),
                Enter.theValue("andres1020").into(PaginaLocalizadora.CLAVE),
                Enter.theValue("andres1020").into(PaginaLocalizadora.CLAVE_CONFIRMACION),
                Enter.theValue("12012022").into(PaginaLocalizadora.FECHA),
                Enter.theValue("https://colorlib.com/polygon/metis/form-validation.html").into(PaginaLocalizadora.URL),
                Enter.theValue("8").into(PaginaLocalizadora.DIGITOS),
                Enter.theValue("6").into(PaginaLocalizadora.RANGO),
                Click.on(PaginaLocalizadora.POLITICAS));
    }
}
