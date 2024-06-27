package lippia.web.steps;

import io.cucumber.java.en.*;
import lippia.web.services.LogInService;

public class LogInSteps {


    @And("ingreso un {string}, un {string} y clikeo el boton Log In")
    public void ingresoUnYUn(String usuario, String password) {
        LogInService.usuarioyPassword(usuario, password);
    }

    @Then("soy redirigido la pagina principal de clockify")
    public void soyRedirigidoLaPaginaPrincipalDeClockify() {

    }
}

