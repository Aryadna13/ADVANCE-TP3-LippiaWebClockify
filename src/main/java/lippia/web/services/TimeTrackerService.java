package lippia.web.services;

import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.CommonConstants;
import lippia.web.constants.TimeTrackerConstants;
import org.testng.Assert;
import sun.security.pkcs11.P11Util;

import java.util.Random;

import static lippia.web.services.BasicFunctionsService.getRandomString2;

public class TimeTrackerService {

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

    public static void timeEntryfinal(String ending) {
        // WebActionManager.setInput(TimeTrackerConstants.INPUT_ENDING_TIME,ending);
    }

    public static void dateEntry(String fecha) {
        WebActionManager.setInput(TimeTrackerConstants.CALENDAR, "26/02/2024", fecha);
    }

    public static void relojitoButton() {
        WebActionManager.click(TimeTrackerConstants.TIMER_BUTTON);
    }

    public static void puntitoslaterales() {
        WebActionManager.click(TimeTrackerConstants.TRES_PUNTOS_LATERALES);
    }

    public static void validarTimeEntryCancelado() {
        Assert.assertEquals(WebActionManager.getText(CommonConstants.CANCELLED_MESSAGE_XPATH), "Timer cancelled");
    }

    public static void editBegginigTimeEntry(String inicio){
        WebActionManager.click(TimeTrackerConstants.EDIT_INPUT_BEGGINIG_HOUR);
        WebActionManager.setInput(TimeTrackerConstants.EDIT_INPUT_BEGGINIG_HOUR,inicio);
    }

    public static void editEndingTimeEntry(String fin){
        WebActionManager.click(TimeTrackerConstants.EDIT_INPUT_ENDING_HOUR);
        WebActionManager.setInput(TimeTrackerConstants.EDIT_INPUT_ENDING_HOUR,fin);
    }

    public static void editCalendar(){
        WebActionManager.click(TimeTrackerConstants.EDIT_CALENDAR_BUTTON);
    }

    public static void projectSelect(){try {
        // Espera de 2 segundos (2000 milisegundos)
        Thread.sleep(2000);
    } catch (InterruptedException e) {
        // Manejo de la excepción
        e.printStackTrace();
    }
        WebActionManager.click(TimeTrackerConstants.PROJECT_BUTTON);
    }

    public static void tagButton(){

        WebActionManager.click(TimeTrackerConstants.TAG_BUTTON);
    }

}
