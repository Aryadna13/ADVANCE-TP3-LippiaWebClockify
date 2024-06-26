package lippia.web.constants;

public class WorkspaceConstants {
    public static final String SET_INPUT_WORKSPACE_NAME = "xpath:(//input[@type='text' and @formcontrolname='name'])[1]";

    public static final String SET_INPUT_WORKSPACE_NAME_FROM_SETTINGS = "xpath://*[@id=\"workspaceName\"]";
    public static final  String DROP_DOWN_WORKSPACE_SELECTOR_BUTTON = "xpath:(//*[@id=\"topbar-menu\"]//app-topbar-options//a)[1]";

    public static final String CONTENEDOR_ULTIMO_WORKSPACE = "(//*[text()=\" Settings \"])[last()]";
}
