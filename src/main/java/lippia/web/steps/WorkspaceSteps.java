package lippia.web.steps;

import com.aventstack.extentreports.gherkin.model.Scenario;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import lippia.web.services.BasicFunctionsService;
import lippia.web.services.LogInService;
import lippia.web.services.WorkspaceService;


public class WorkspaceSteps {

    private ApiHelper apiHelper;
    @Before (value = "@ActualizacionDeWorkspaceExitoso")
    public void before() {
        apiHelper.sendPostRequest("https://api.clockify.me/api/v1/workspaces","{\"name\": \"Cool Company\"}");
    }
    @And("clickeo el boton (.*)")
    public void clickeoElBotonLoginLandingPage(String Boton){
        LogInService.commonButton(Boton);

    }
    @And("nombro mi nuevo workspace (.*)$")
    public void nombroMiNuevoWorkspace(String workspace) {
        WorkspaceService.randomProyect();
    }

    @Then("se crea un nuevo workspace")
    public void seCreaUnNuevoWorkspace(String check) {
        BasicFunctionsService.validCheck(check);
    }

    @And("clickeo el dropdown de workspaces")
    public void clickeoElDropdownDeWorkspaces() {
        WorkspaceService.dropDownWorkspace();
    }

    @And("cambio el nombre del workspace")
    public void cambioElNombreDelWorkspace() {
        WorkspaceService.renameWorkspace();
    }

    @Then("se cambia el nombre del workspace")
    public void seCambiaElNombreDelWorkspace() {
    }

}
