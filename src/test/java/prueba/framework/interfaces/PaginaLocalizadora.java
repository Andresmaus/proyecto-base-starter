package prueba.framework.interfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaLocalizadora {
    public static final Target USER = Target.the("Usuario").located(By.xpath("//*[@id='login']/form/input[1]"));
    public static final Target PASSWORK = Target.the("Clave").located(By.xpath("//*[@id='login']/form/input[2]"));
    public static final Target REMEMBER_ME = Target.the("Recordar Usuario").located(By.xpath("//*[@id='login']/form/div/label/input"));
    public static final Target SIGN_IN = Target.the("Boton Iniciar Sesion").located(By.xpath("//*[@id='login']/form/button"));
    public static final Target FORMS = Target.the("Menu Formulario").located(By.xpath("//*[@id='menu']/li[6]/a/span[1]"));
    public static final Target FORM_VALIDATION = Target.the("").located(By.xpath("//*[@id='menu']/li[6]/ul/li[2]/a"));
    public static final Target ELIMINAR_POPUP_VALIDATION = Target.the("").locatedBy("#content > div > div > div:nth-child(2) > div > div > header > div.toolbar > nav > a.btn.btn-danger.btn-xs.close-box");
    public static final Target REQUERID = Target.the("Nombre").located(By.id("required2"));
    public static final Target EMAIL = Target.the("Correo").located(By.id("email2"));
    public static final Target CLAVE = Target.the("Clave 1").located(By.id("password2"));
    public static final Target CLAVE_CONFIRMACION = Target.the("Clave 2").located(By.id("confirm_password2"));
    public static final Target FECHA = Target.the("FECHA").located(By.id("date2"));
    public static final Target URL = Target.the("URL").located(By.id("url2"));
    public static final Target DIGITOS = Target.the("DIGITOS ONLY").located(By.id("digits"));
    public static final Target RANGO = Target.the("RANGO 6/16").located(By.id("range"));
    public static final Target POLITICAS = Target.the("Politicas de Formulario").located(By.id("agree2"));

    public static final Target BOTON_VALIDAR = Target.the("Boton de Validacion").located(By.xpath("//*[@id='block-validate']/div[10]/input"));


//    JavascriptExecutor js = (JavascriptExecutor) driver;
//    WebElement = (WebElement)js.executeAsyncScript("return document.getElements")
}