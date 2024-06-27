package lippia.web.services;

import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.ReportsConstants;

public class ReportsService {
    public void testDownloadPDF() {
        //driver.get("http://example.com");

        // Código para realizar la acción de exportar a PDF
       // WebActionManager.click(TimeTrackerConstants.EXPORT_BUTTON);

        // Esperar que el archivo se descargue (opcional)
        // Thread.sleep(5000); // Añade un tiempo de espera si es necesario

        // Verificar que el archivo se ha descargado (opcional)
        // File file = new File("path/to/download/directory/expectedFileName.pdf");
        // Assert.assertTrue(file.exists());
    }

    public static void exportButton() throws InterruptedException {
        Thread.sleep(5000);
   WebActionManager.click(ReportsConstants.EXPORT_BUTTON);
    }
}
