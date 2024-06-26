package lippia.web.services;

import com.crowdar.core.actions.WebActionManager;
import com.crowdar.driver.DriverManager;
import lippia.web.constants.WorkspaceConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import static lippia.web.services.BasicFunctionsService.getRandomString2;

public class WorkspaceService {

    public static void randomProyect() {
        String randomName = getRandomString2(10);
        WebActionManager.setInput(WorkspaceConstants.SET_INPUT_WORKSPACE_NAME, randomName);
    }

    public static void renameWorkspace() {
        WebActionManager.click(WorkspaceConstants.SET_INPUT_WORKSPACE_NAME_FROM_SETTINGS);
        String randomName = getRandomString2(10);
        WebActionManager.setInput(WorkspaceConstants.SET_INPUT_WORKSPACE_NAME_FROM_SETTINGS, randomName);
    }

    public static void dropDownWorkspace() {
        WebActionManager.click(WorkspaceConstants.DROP_DOWN_WORKSPACE_SELECTOR_BUTTON);
    }

    public static void lastButton(String botonGenerico) {
        WebDriver driver = DriverManager.getDriverInstance();
        WebElement lastElement = driver.findElement(By.xpath("//button[@type='button' and @tabindex='0' and @ngbautofocus='false' and contains(@class, 'cl-btn cl-btn-primary cl-ml-3 cl-d-print-none') and text()=' Settings ']"));
        lastElement.click();
    }

}