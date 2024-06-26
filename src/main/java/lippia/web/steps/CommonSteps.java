package lippia.web.steps;

import com.crowdar.core.actions.WebActionManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.BasicFunctionsService;
import lippia.web.services.LogInService;

public class CommonSteps {
    @Given("estoy en la landing page de clockify")
    public void estoyEnLaLandingPageDeClockify() {
        LogInService.urlBase();
    }


    @Given("me encuentro el en home de usuarios logueado con un {string} y {string} validos")
    public void meEncuentroElEnHomeDeUsuariosLogueadoConUnYValidos(String usuario, String password) {
        WebActionManager.navigateTo("https://app.clockify.me/en/login");
        LogInService.usuarioyPassword(usuario,password);
    }

    @Given("la pagina esta en (.*)")
    public void laPaginaEstaEn(String idioma) {
        BasicFunctionsService.verifyLanguage(idioma);
    }
}
