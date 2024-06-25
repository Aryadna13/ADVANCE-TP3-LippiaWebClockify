package lippia.web.steps;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ApiHelper {

    public static Response sendPostRequest(String url, String body) {
        return RestAssured
                .given()
                .header("Content-Type", "application/json")
                .header("x-api-key", "MTc1YTM3NzMtMmM4YS00NmY1LTg4NGQtZWFiYzE1YjE5ZDUx")
                .body(body)
                .post(url);
    }

    public static Response sendPutRequest(String url, String body) {
        return RestAssured
                .given()
                .header("Content-Type", "application/json")
                .body(body)
                .put(url);
    }

    public static Response sendGetRequest(String url) {
        return RestAssured
                .given()
                .header("Content-Type", "application/json")
                .get(url);
    }

    public static Response sendDeleteRequest(String url) {
        return RestAssured
                .given()
                .header("Content-Type", "application/json")
                .delete(url);
    }
}