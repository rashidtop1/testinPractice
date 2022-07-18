package сom.rashid.RESTAssured;

import org.junit.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.lessThan;

public class HeadersTest {
    private final static String URL = "https://postman-echo.com/";


    @Test
    public void checkStatus() {
        given()
                .baseUri(URL)
                .when()
                .get("get")
                .then()
                .assertThat()
                .statusCode(200);
    }

    @Test
    public void checkRuntime() {
        when().get(URL + "get").then().time(lessThan(2000L));
    }
}
