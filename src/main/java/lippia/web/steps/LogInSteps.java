package lippia.web.steps;

import com.crowdar.core.actions.WebActionManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;;
import lippia.web.services.LogInService;

public class LogInSteps {

    @And("clickeo el boton (.*) del ultimo workspace$")
    public void clickeoElBotonDelWorkspace(String Boton){
        LogInService.lastButton(Boton);
    }

    @And("clickeo el boton (.*)")
    public void clickeoElBotonLoginLandingPage(String Boton){
        LogInService.commonButton(Boton);
    }

    @And("ingreso un {string}, un {string} y clikeo el boton Log In")
    public void ingresoUnYUn(String usuario, String password) {
        LogInService.usuarioyPassword(usuario, password);
    }

    @Then("soy redirigido la pagina principal de clockify")
    public void soyRedirigidoLaPaginaPrincipalDeClockify() {

    }
}

