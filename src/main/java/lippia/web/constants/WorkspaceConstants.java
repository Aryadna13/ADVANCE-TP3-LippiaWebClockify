package lippia.web.constants;

public class WorkspaceConstants {
    public static final String SET_INPUT_WORKSPACE_NAME = "xpath:(//input[@type='text' and @formcontrolname='name'])[1]";

    public static final String SET_INPUT_WORKSPACE_NAME_FROM_SETTINGS = "xpath://*[@id=\"workspaceName\"]";
    public static final  String DROP_DOWN_WORKSPACE_SELECTOR_BUTTON = "xpath:(//*[@id=\"topbar-menu\"]//app-topbar-options//a)[1]";

    public static final String CONTENEDOR_ULTIMO_WORKSPACE = "//button[contains(@class, 'cl-btn-primary') and text()='%s']";
    public static final String TIMER_WORKSPACE = "XPATH://span[@stopwatch-seconds='' and contains(@class, 'ng-star-inserted')]";



}
