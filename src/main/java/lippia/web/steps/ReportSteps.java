package lippia.web.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import lippia.web.constants.ReportsConstants;
import lippia.web.services.BasicFunctionsService;
import lippia.web.services.ReportsService;
import lippia.web.services.TimeTrackerService;

public class ReportSteps {
    @And("clickea el boton Save as PDF")
    public void clickeaElBotonSaveAsPDF() {
        BasicFunctionsService.genericTouch(ReportsConstants.EXPORT_PDF_BUTTON);

    }

    @Then("se descarga un pdf con las horas trabajadas")
    public void seDescargaUnPdfConLasHorasTrabajadas() {
        ReportsService.verifyDownload();
    }

    @And("clickea el boton Export")
    public void clickeaElBotonExport() {
        BasicFunctionsService.genericTouch(ReportsConstants.EXPORT_BUTTON);

    }
}
