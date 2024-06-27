package lippia.web.steps;

import com.crowdar.core.actions.WebActionManager;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.constants.CommonConstants;
import lippia.web.constants.TimeTrackerConstants;
import lippia.web.services.BasicFunctionsService;
import lippia.web.services.LogInService;
import lippia.web.services.TimeTrackerService;
import lippia.web.services.WorkspaceService;
import org.testng.Assert;

public class TimeTrackerSteps {

    private ApiHelper apiHelper;

    @Before(value = "@ModificoElRegistroDeHoras")
    public void before() {
        apiHelper.sendPostRequest("https://api.clockify.me/api/v1/workspaces/6537291f940183327c06fc57/time-entries", "{\"description\": \"TimeEntryDeApi\"}");
        apiHelper.sendPostRequest("https://api.clockify.me/api/v1/workspaces/6537291f940183327c06fc57/projects", "{\"name\": \"ProyectoCrowdar\"}");
        apiHelper.sendPostRequest("https://api.clockify.me/api/v1/workspaces/6537291f940183327c06fc57/tags", "{\"name\": \"Crowdar\"}");

    }


    @And("clickeo sobre el boton Manual")
    public void clickeoElBotonManual() {
        TimeTrackerService.manualButton();
    }


    @And("añado una (.*)$")
    public void anadoUnaFecha(String fecha) {
        TimeTrackerService.dateEntry("26/02/2024");
    }


    @Then("se crea un nuevo time entry")
    public void seCreaUnNuevoTimeEntry() {
        System.out.println("cree con exito");
    }

    @And("seteo una hora de inicio (.*)$")
    public void seteoUnaHoraDeInicio(String horaInicio) {
        TimeTrackerService.timeEntry(horaInicio);
    }


    @And("clickeo el timer relojito")
    public void clickeoElTimerRelojito() {
        TimeTrackerService.relojitoButton();
    }

    @And("clickeo los tres puntitos laterales")
    public void clickeoLosTresPuntitosLaterales() throws InterruptedException {
        TimeTrackerService.puntitoslaterales();
    }

    @Then("se cancela la creacion del timeEntry")
    public void seCancelaLaCreacionDelTimeEntry() throws InterruptedException {
        Thread.sleep(200);
        TimeTrackerService.validarTimeEntryCancelado();
    }


    @Then("se modifica el time entry")
    public void seModificaElTimeEntry() {
        TimeTrackerService.validaciones();
        TimeTrackerService.restauracion();
    }

    @And("modifico la hora de inicio (.*)")
    public void modificoLaHoraDeInicio(String hora) throws InterruptedException {
        String boton = BasicFunctionsService.removeQuotes(hora);
        TimeTrackerService.editTimeEntry(boton, "1");
    }

    @And("modifico la hora de finalizacion (.*)")
    public void modificoLaHoraDeFinalizacion(String hora) throws InterruptedException {
        String boton = BasicFunctionsService.removeQuotes(hora);
        TimeTrackerService.editTimeEntry(boton, "2");
    }

    @And("cambio el dia del calendario")
    public void cambioElDiaDelCalendario() {
        TimeTrackerService.editCalendar();
    }

    @When("clickea el boton Project")
    public void clickeaElBotonProject() {
        BasicFunctionsService.genericTouch(TimeTrackerConstants.PROJECT_BUTTON);
    }

    @And("clickea el boton Tags")
    public void clickeaElBotonTags() {
        TimeTrackerService.tagButton();
    }

    @And("valido estar en el Workspace correcto")
    public void validoEstarEnElWorkspaceCorrecto() throws InterruptedException {
        WorkspaceService.dropDownWorkspace();
        LogInService.commonButton(" Manage workspaces ");
        String Boton = " Settings ";
        WorkspaceService.prepareFirstData(Boton);
        WorkspaceService.clickOnTimer();
    }

    @And("cancelo el registro")
    public void canceloElRegistro() {
        WebActionManager.waitVisibility(TimeTrackerConstants.DISCARD);
        WebActionManager.click(TimeTrackerConstants.DISCARD);
    }
}
