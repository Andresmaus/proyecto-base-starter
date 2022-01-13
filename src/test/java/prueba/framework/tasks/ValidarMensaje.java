package prueba.framework.tasks;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ValidarMensaje {

    public static final Target MENSAJE = Target.the("Popup Validation").located(By.xpath("//h5[contains(text(),'Popup Validation')]"));
}
