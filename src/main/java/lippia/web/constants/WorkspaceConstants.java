package lippia.web.constants;

public class WorkspaceConstants {
    public static final String SET_INPUT_WORKSPACE_NAME = "xpath:(//input[@type='text' and @formcontrolname='name'])[1]";

    public static final  String DROP_DOWN_WORKSPACE_SELECTOR_BUTTON = "xpath:( //div[@triggers=\"manual\" and @data-cy=\"workspace-dropdown\"])";

    public static final String CONTENEDOR_ULTIMO_WORKSPACE = "xpath = (//*[text()='%s'])[last()]";
}
