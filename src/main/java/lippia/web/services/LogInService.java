package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.CommonConstants;
import lippia.web.constants.LogInConstants;
import lippia.web.constants.MyAccountConstants;
import lippia.web.constants.WorkspaceConstants;
import org.testng.Assert;

import static com.crowdar.core.actions.WebActionManager.navigateTo;

public class LogInService extends ActionManager {
    public static void urlBase() {
        navigateTo(PropertyManager.getProperty("web.base.url"));
    }

    public static void commonButton(String botonGenerico) {
        String boton = BasicFunctionsService.removeQuotes(botonGenerico);
        click(CommonConstants.COMMON_BUTTON, boton);
    }

    public static void lastButton(String botonGenerico) {
        String boton = BasicFunctionsService.removeQuotes(botonGenerico);
        click(WorkspaceConstants.CONTENEDOR_ULTIMO_WORKSPACE, boton);
    }

    public static void usuarioyPassword(String usuario, String password) {
        BasicFunctionsService.usuarioyPassword(usuario, password);
        click(LogInConstants.BUTTON_LOGIN_XPATH);
    }

    public static void myAccountPresent() {
        //Assert.assertTrue(Boolean.parseBoolean(MyAccountConstants.MY_ACCOUNT_BUTTON));
    }

}
