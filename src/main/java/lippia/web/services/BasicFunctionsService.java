package lippia.web.services;

import com.crowdar.core.actions.WebActionManager;
import com.crowdar.driver.DriverManager;
import lippia.web.constants.CommonConstants;
import lippia.web.constants.LogInConstants;
import lippia.web.constants.MyAccountConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.io.InputStream;
import java.util.Properties;
import java.util.Random;

import static com.crowdar.core.actions.ActionManager.setInput;

public class BasicFunctionsService {


    public static String removeQuotes(String str) {

        if (str.startsWith("\"") && str.endsWith("\"")) {

            return str.substring(1, str.length() - 1);
        } else {

            return str;
        }
    }


    public static void usuarioyPassword(String usuario, String password) {

        Properties properties = new Properties();
        InputStream input = null;

        try {
            input = BasicFunctionsService.class.getClassLoader().getResourceAsStream("config.properties");

            properties.load(input);

            usuario = properties.getProperty("clocky.user");
            password = properties.getProperty("clocky.password");

            setInput(LogInConstants.INPUT_EMAIL_NAME, usuario);
            setInput(LogInConstants.INPUT_PASSWORD_NAME, password);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

        }
    }


    public static String getRandomString2(int length) {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            char c = (char) (random.nextInt(26) + 'a');
            sb.append(c);
        }
        return sb.toString();
    }

    public static void scroll(WebElement element) {
        JavascriptExecutor jse = DriverManager.getDriverInstance();
        jse.executeScript("arguments[0].scrollIntoView()", new Object[]{element});
    }


    public static void validCheck(String chek) {
        Assert.assertTrue(WebActionManager.isPresent(CommonConstants.VALID_MESSAGE_XPATH), chek);
    }

    public static void verifyLanguage(String language) {
        WebActionManager.click(MyAccountConstants.MY_ACCOUNT_BUTTON);
        System.out.println("do it 1");
        WebActionManager.click(MyAccountConstants.SETTINGS_BUTTON);
        System.out.println("do it 2");
      WebActionManager.click(MyAccountConstants.LANGUAGE_BUTTON);
        System.out.println("do it 3");
        WebDriver driver = new ChromeDriver();
        driver = DriverManager.getDriverInstance();
        WebElement element = driver.findElement(By.xpath(MyAccountConstants.LANGUAGE_BUTTON));
        scroll(element);
      /*    switch (language) {
            case "es":
                WebActionManager.setDropdownByIndex(MyAccountConstants.LANGUAGE_SELECTOR,3,"3");
                System.out.println("do it 4");
                break;
            case "en":
                WebActionManager.setDropdownByIndex(MyAccountConstants.LANGUAGE_SELECTOR,2,"2");
                System.out.println("do it 4");
                break;
        }*/

        switch (language) {
            case "es":
                WebActionManager.click(MyAccountConstants.LANGUAGE_SELECTOR);
                System.out.println("do it 4");
                break;
            case "en":
                WebActionManager.click(MyAccountConstants.LANGUAGE_BUTTON);
                System.out.println("do it 4");
                break;
        }



    }
}

