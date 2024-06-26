package lippia.web.steps;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.LogInService;
import lippia.web.services.TimeTrackerService;

public class TimeTrackerSteps {

    private ApiHelper apiHelper;

    @Before(value = "@ModificoElRegistroDeHoras")
    public void before() {
        apiHelper.sendPostRequest("https://api.clockify.me/api/v1/workspaces/6679dc23842d3958e3ee2108/time-entries", "{\"description\": \"TimeEntryDeApi\"}");
        apiHelper.sendPostRequest("https://api.clockify.me/api/v1/workspaces/6679dc23842d3958e3ee2108/projects", "{\"name\": \"ProyectoCrowdar\"}");
        apiHelper.sendPostRequest("https://api.clockify.me/api/v1/workspaces/6679dc23842d3958e3ee2108/tags", "{\"name\": \"Crowdar\"}");

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

    @And("seteo una hora final (.*)$")
    public void seteoUnaHoraFinal(String horaFinal) {
        TimeTrackerService.timeEntryfinal(horaFinal);
    }


    @And("clickeo el timer relojito")
    public void clickeoElTimerRelojito() {
        TimeTrackerService.relojitoButton();
    }

    @And("clickeo los tres puntitos laterales")
    public void clickeoLosTresPuntitosLaterales() {
        TimeTrackerService.puntitoslaterales();
    }

    @Then("se cancela la creacion del timeEntry")
    public void seCancelaLaCreacionDelTimeEntry() {
        TimeTrackerService.validarTimeEntryCancelado();
    }

    @When("edito el nombre del time entry (.*)")
    public void editoElNombreDelTimeEntry(String nuevoNombre) {
        TimeTrackerService.editTimeEntry(nuevoNombre);
    }

    @Then("se modifica el time entry")
    public void seModificaElTimeEntry() {
        //<div class="ng-tns-c78-28 toast-title ng-star-inserted" aria-label="Successfully updated description" style=""> Successfully updated description <!----></div>
    }
}
