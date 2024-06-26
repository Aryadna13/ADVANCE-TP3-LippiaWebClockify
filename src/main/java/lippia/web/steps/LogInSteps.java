package lippia.web.steps;

import com.crowdar.core.actions.WebActionManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;;
import lippia.web.services.LogInService;
import lippia.web.services.WorkspaceService;

public class LogInSteps {

    @And("clickea el boton (.*) del ultimo workspace$")
    public void clickeoElBotonDelWorkspace(String Boton){
        WorkspaceService.lastButton(Boton);
    }



    @And("ingreso un {string}, un {string} y clikeo el boton Log In")
    public void ingresoUnYUn(String usuario, String password) {
        LogInService.usuarioyPassword(usuario, password);
    }

    @Then("soy redirigido la pagina principal de clockify")
    public void soyRedirigidoLaPaginaPrincipalDeClockify() {

    }
}

