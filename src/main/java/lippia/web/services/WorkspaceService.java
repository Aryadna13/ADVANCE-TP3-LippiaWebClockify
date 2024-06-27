package lippia.web.services;

import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.core.actions.WebActionManager;
import com.crowdar.driver.DriverManager;
import lippia.web.constants.TimeTrackerConstants;
import lippia.web.constants.WorkspaceConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;


import java.util.List;

import static lippia.web.services.BasicFunctionsService.getRandomString2;

public class WorkspaceService {
    public static String originalName;
    public static String newName;


    public static void randomProyect() {
        String randomName = getRandomString2(10);
        WebActionManager.setInput(WorkspaceConstants.SET_INPUT_WORKSPACE_NAME, randomName);
    }

    public static void renameWorkspace() {
        originalName = WebActionManager.getAttribute(WorkspaceConstants.SET_INPUT_WORKSPACE_NAME_FROM_SETTINGS, "value");
        WebDriver driver = DriverManager.getDriverInstance();
        WebElement element = WebActionManager.getElement(WorkspaceConstants.SET_INPUT_WORKSPACE_NAME_FROM_SETTINGS);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
        String randomName = getRandomString2(10);
        WebActionManager.setInput(WorkspaceConstants.SET_INPUT_WORKSPACE_NAME_FROM_SETTINGS, randomName);
        dropDownWorkspace();
        newName = WebActionManager.getAttribute(WorkspaceConstants.SET_INPUT_WORKSPACE_NAME_FROM_SETTINGS, "value");
    }

    public static void dropDownWorkspace() {
        WebActionManager.click(WorkspaceConstants.DROP_DOWN_WORKSPACE_SELECTOR_BUTTON);
    }

    public static void prepareData(String locator) throws InterruptedException {
        String replaceLocator = BasicFunctionsService.removeQuotes(locator);
        List<WebElement> settingsButtons = getSettingsButtons(replaceLocator);
        lastButton(settingsButtons);
    }

    public static void prepareFirstData(String locator) throws InterruptedException {
        String replaceLocator = BasicFunctionsService.removeQuotes(locator);
        List<WebElement> settingsButtons = getSettingsButtons(replaceLocator);
        firstButton(settingsButtons);
    }

    public static void firstButton(List<WebElement> buttons) throws InterruptedException {
        if (!buttons.isEmpty()) {
            WebDriver driver = DriverManager.getDriverInstance();
            WebElement firstButton = buttons.get(0);
            WebDriverWait wait = new WebDriverWait(driver, 10);
            wait.until(ExpectedConditions.visibilityOf(firstButton));
            Thread.sleep(1000);
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", firstButton);
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", firstButton);

        } else {
            System.out.println("No se encontraron botones 'Settings'.");
        }
    }

    public static void lastButton(List<WebElement> buttons) throws InterruptedException {
        if (!buttons.isEmpty()) {
            WebDriver driver = DriverManager.getDriverInstance();
            WebElement lastButton = buttons.get(buttons.size() - 1);
            WebDriverWait wait = new WebDriverWait(driver, 10);
            wait.until(ExpectedConditions.visibilityOf(lastButton));
            Thread.sleep(1000);
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", lastButton);
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", lastButton);

        } else {
            System.out.println("No se encontraron botones 'Settings'.");
        }
    }

    public static List<WebElement> getSettingsButtons(String locator) {
        WebDriver driver = DriverManager.getDriverInstance();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        String xpath = String.format(WorkspaceConstants.CONTENEDOR_ULTIMO_WORKSPACE, locator);
        return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(xpath)));
    }

    public static void validacionesWorkspace() {
        Assert.assertNotEquals(originalName, newName);
        Assert.assertEquals(newName, WebActionManager.getAttribute(WorkspaceConstants.SET_INPUT_WORKSPACE_NAME_FROM_SETTINGS, "value"));
    }

    public static void clickOnTimer() {
        MobileActionManager.click(WorkspaceConstants.TIMER_WORKSPACE);
    }

    public static void irAlHome() throws InterruptedException {
        Thread.sleep(500);
        WebDriver driver = DriverManager.getDriverInstance();
        driver.navigate().to("https://app.clockify.me/workspaces");
    }
}