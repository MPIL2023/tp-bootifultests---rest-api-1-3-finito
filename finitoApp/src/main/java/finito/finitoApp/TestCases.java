package finito.finitoApp;


import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static io.restassured.RestAssured.given;

@SpringBootTest
public class TestCases {

    int port=8080;



    @Test
    public void firstTestCase() {
        String url = "http://localhost:8080/adder/add/?num=3";
        given()
                .when()
                .get(url)
                .then()
                .assertThat()
                .statusCode(200);
    }



}