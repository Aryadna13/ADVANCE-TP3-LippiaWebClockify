package lippia.web.constants;

public class TimeTrackerConstants {

    public static final  String INPUT_PROJECT_NAME = "xpath://input[@name=\"autocomplete-input\"]";

    //RELOJITO
    public static final String TIMER_BUTTON = "xpath://a[@data-cy=\"timer-mode\"]/img";
    public static final String TRES_PUNTOS_LATERALES = "xpath:(//div[contains(@class, 'cl-dropdown cl-tree-dots')])[1]";


    //MANUAL
    public static final String MANUAL_REGISTER_DATE_BUTTON = "xpath://*[@id=\"manual-mode\"]";
    public static final String INPUT_BEGGINIG_TIME = "xpath:(//*[@id=\"layout-main\"]//input-time-ampm[1]//input)[1]";
    public static final String INPUT_ENDING_TIME = "xpath:(//*[@id=\"layout-main\"]//single-date-picker2//input-time-ampm[2])[1]";
    public static final String CALENDAR = "xpath:(//*[@id=\"layout-main\"]//single-date-picker2//input)[3]";


    //EDIT_TIME_ENTRY
    public static final String PROJECT_BUTTON = "xpath:(//span[@tooltipiftexttoolong='' and contains(@class, 'cl-first-letter-uppercase') and text()='Project'])[2]";

    public static final String TAG_BUTTON = "xpath://*[@id='layout-main']//entry-group[1]//parent-tracker-entry//tag-names";
    public static final String EDIT_INPUT_BEGGINIG_HOUR = "xpath://*[@id=\"layout-main\"]//entry-group//time-tracker-entry//div[4]//single-date-picker2//input-time-ampm[1]/input";
    public static final String EDIT_INPUT_ENDING_HOUR = "xpath://*[@id=\"layout-main\"]//entry-group//time-tracker-entry//div[4]//single-date-picker2//input-time-ampm[2]/input";

    public static final String EDIT_CALENDAR_BUTTON = "xpath://input-single-date/span[@tabindex=\"0\"]";
}
