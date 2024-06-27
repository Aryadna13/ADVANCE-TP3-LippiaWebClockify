package lippia.web.services;

import com.crowdar.core.actions.WebActionManager;
import io.lippia.api.service.CommonService;
import lippia.web.constants.CommonConstants;
import lippia.web.constants.TimeTrackerConstants;
import org.joda.time.base.BaseSingleFieldPeriod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static lippia.web.constants.TimeTrackerConstants.EDIT_INPUT_BEGGINIG_HOUR;
import static lippia.web.services.BasicFunctionsService.getRandomString2;

public class TimeTrackerService {
    public static String hora_inicio = "";
    public static String hora_fin = "";
    public static String hora_editada = "";

    public static void manualButton() {
        WebActionManager.click(TimeTrackerConstants.MANUAL_REGISTER_DATE_BUTTON);
    }

    public static void proyectName() {
        String randomName = getRandomString2(10);
        WebActionManager.setInput(TimeTrackerConstants.INPUT_PROJECT_NAME, randomName);

    }

    public static void timeEntry(String beggining) {
        WebActionManager.setInput(TimeTrackerConstants.INPUT_BEGGINIG_TIME, beggining);
    }


    public static void dateEntry(String fecha) {
        WebActionManager.setInput(TimeTrackerConstants.CALENDAR, "26/02/2024", fecha);
    }

    public static void relojitoButton() {
        WebActionManager.click(TimeTrackerConstants.TIMER_BUTTON);
    }

    public static void puntitoslaterales() throws InterruptedException {
        Thread.sleep(500);
        BasicFunctionsService.genericTouch(TimeTrackerConstants.TRES_PUNTOS_LATERALES);
    }

    public static void validarTimeEntryCancelado() {
        Assert.assertEquals(WebActionManager.getText(CommonConstants.CANCELLED_MESSAGE_XPATH), "Timer cancelled");
    }

    public static void editTimeEntry(String hora, String locatorValue) throws InterruptedException {
        saveOriginalTimes(locatorValue);
        WebActionManager.click(TimeTrackerConstants.EDIT_INPUT_HOUR, locatorValue);
        WebActionManager.clean();
        WebActionManager.setInput(TimeTrackerConstants.EDIT_INPUT_HOUR, hora, locatorValue);
        Thread.sleep(1000);
    }
    public static void editCalendar() {
        BasicFunctionsService.genericTouch(TimeTrackerConstants.EDIT_CALENDAR_BUTTON);
        WebActionManager.click(TimeTrackerConstants.DAY_13_BUTTON);
    }

    public static void saveOriginalTimes(String locatorValue) {
        switch (locatorValue) {
            case "1":
                hora_inicio = WebActionManager.getAttribute(TimeTrackerConstants.EDIT_INPUT_HOUR, "value", locatorValue);
                break;
            case "2":
                hora_fin = WebActionManager.getAttribute(TimeTrackerConstants.EDIT_INPUT_HOUR, "value", locatorValue);
                break;
        }
    }

    public static void tagButton() {
        WebActionManager.click(TimeTrackerConstants.TAG_BUTTON);
    }

    public static void validaciones(){
        hora_editada = WebActionManager.getAttribute(TimeTrackerConstants.EDIT_INPUT_HOUR, "value", "1");
        Assert.assertNotEquals(hora_inicio, hora_editada);
        hora_editada = WebActionManager.getAttribute(TimeTrackerConstants.EDIT_INPUT_HOUR, "value", "2");
        Assert.assertNotEquals(hora_fin, hora_editada);
        Assert.assertTrue(WebActionManager.isEnabled(CommonConstants.COMMON_BUTTON, " $ "));
    }

    public static void restauracion() {
        WebActionManager.click("xpath://div[@dropdownkeybutton='' and @tabindex='0' and contains(@class, 'pointer') and contains(@class, 'cl-non-selectable') and contains(@class, 'cl-component-divided-left') and contains(@class, 'cl-d-flex') and contains(@class, 'cl-dropdown-toggle') and contains(@class, 'cl-no-arrow')]");
        WebActionManager.click("xpath://a[@tabindex='-1' and @clickclosedropdown='' and @data-cy='delete-button' and contains(@class, 'cl-dropdown-item') and contains(@class, 'cl-text-danger')]");
        WebActionManager.click("xpath://button[@type='button' and @ngbautofocus='false' and contains(@class, 'cl-btn') and contains(@class, 'cl-btn-danger') and text()=' Delete ']");
    }
}
