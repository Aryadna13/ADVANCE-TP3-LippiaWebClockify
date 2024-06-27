package lippia.web.services;

import com.crowdar.core.actions.WebActionManager;
import com.crowdar.driver.DriverManager;
import lippia.web.constants.MyAccountConstants;
import lippia.web.constants.ReportsConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;

public class ReportsService {


    public static void verifyDownload() {
        String downloadFilepath = "C:\\Users\\garci\\Downloads";
        File downloadedFile = new File(downloadFilepath + "Clockify_Time_Report_Summary_24_06_2024-30_06_2024.pdf");
        assert downloadedFile.exists() : "El archivo no se descargó correctamente";

    }
}
