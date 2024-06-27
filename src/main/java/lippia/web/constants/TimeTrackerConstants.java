package lippia.web.constants;

import com.sun.org.apache.bcel.internal.generic.PUSH;

public class TimeTrackerConstants {

    public static final  String INPUT_PROJECT_NAME = "xpath://input[@name=\"autocomplete-input\"]";

    //RELOJITO
    public static final String TIMER_BUTTON = "xpath://a[@data-cy=\"timer-mode\"]/img";
    public static final String TRES_PUNTOS_LATERALES = "//div[@placement='bottom' and @container='body' and @triggers='manual' and contains(@class, 'pointer') and contains(@class, 'cl-non-selectable') and contains(@class, 'cl-d-flex') and contains(@class, 'cl-dropdown-toggle') and contains(@class, 'cl-no-arrow')]";


    //MANUAL
    public static final String MANUAL_REGISTER_DATE_BUTTON = "xpath://img[@alt='Add time manually not selected' and @src='assets/ui-icons/list-gray.svg' and contains(@class, 'ng-star-inserted')]";
    public static final String INPUT_BEGGINIG_TIME = "xpath:(//*[@id=\"layout-main\"]//input-time-ampm[1]//input)[1]";
    public static final String INPUT_ENDING_TIME = "xpath:(//*[@id=\"layout-main\"]//single-date-picker2//input-time-ampm[2])[1]";
    public static final String CALENDAR = "xpath:(//*[@id=\"layout-main\"]//single-date-picker2//input)[3]";

    public static final String DISCARD = "xpath://button[@type='button' and @tabindex='0' and @ngbautofocus='false' and contains(@class, 'cl-btn') and contains(@class, 'cl-btn-primary') and text()=' Discard ']";


    //EDIT_TIME_ENTRY
    public static final String PROJECT_BUTTON = "(//div[@tabindex='0' and .//span[text()='Project']])[2]";
    public static final String TAG_BUTTON = "xpath:(//div[contains(@class, 'cl-component-divided-left')  and .//a[text()='Add tags']])[2]";
    public static final String CROWDAR_TAG = "xpath://div[@class='cl-custom-control cl-custom-checkbox']//input[@type='checkbox' and @id='checkbox_667bb7d07a59b3317d074410']";
    public static final String EDIT_INPUT_BEGGINIG_HOUR = "xpath:(//input[@type='text' and contains(@class, 'cl-input-time-picker')])[1]";
    public static final String EDIT_INPUT_ENDING_HOUR = "xpath:(//input[@type='text' and contains(@class, 'cl-input-time-picker')])[2]";
    public static final String EDIT_INPUT_HOUR = "xpath:(//input[@type='text' and contains(@class, 'cl-input-time-picker')])[%s]";
    public static final String EDIT_CALENDAR_BUTTON = "//entry-group[1]/div/time-tracker-entry/div/div[4]/div/single-date-picker2/div[2]";
    public static final String DAY_13_BUTTON = "xpath://td[contains(@class, 'start-date')  and @data-title='r2c3']";
}
