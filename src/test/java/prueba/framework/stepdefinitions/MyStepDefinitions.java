package prueba.framework.stepdefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.ensure.Ensure;
import prueba.framework.tasks.*;

public class MyStepDefinitions {


    @Dado("que actor ingresa a color lib")
    public void queAndresIngresaAColorLib() {
        OnStage.theActorCalled("Andres").wasAbleTo(Abrir.paginaColor());
    }

    @Cuando("busca el formulario Block Validation")
    public void buscaElFormularioBlockValidation() {
        OnStage.theActorInTheSpotlight().attemptsTo(Entrar.loguearse(), Buscar.formularioBlockV());
    }

    @Y("lo diligencia de manera correcta")
    public void loDiligenciaDeManeraCorrecta() {
        OnStage.theActorInTheSpotlight().attemptsTo(Llenar.formulario(), Validar.blockValidation());
    }

    @Entonces("Verifica que se completaron correctamente")
    public void verificaQueSeCompletaronCorrectamente() {
        OnStage.theActorInTheSpotlight().attemptsTo(Ensure.that(ValidarMensaje.MENSAJE).hasText("Popup Validation"));
    }
}
