package lippia.web.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import lippia.web.services.BasicFunctionsService;
import lippia.web.services.ReportsService;
import lippia.web.services.TimeTrackerService;

public class ReportSteps {
    @And("clickea el boton Save as PDF")
    public void clickeaElBotonSaveAsPDF() {
        new BasicFunctionsService.DownloadFileTest();
    }

    @Then("se descarga un pdf con las horas trabajadas")
    public void seDescargaUnPdfConLasHorasTrabajadas() {
    }

    @And("clickea el boton Export")
    public void clickeaElBotonExport() throws InterruptedException {

        ReportsService.exportButton();
    }
}
