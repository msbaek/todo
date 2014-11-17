package net.daumkakao.todo.web;

import com.jayway.restassured.RestAssured;
import net.daumkakao.todo.Application;
import org.apache.http.HttpStatus;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import static com.jayway.restassured.RestAssured.given;
import static com.jayway.restassured.RestAssured.when;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.CoreMatchers.nullValue;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebAppConfiguration
@IntegrationTest("server.port:9000")
public class TodoControllerIntegrationTest {
    @Before
    public void setUp() throws Exception {
        RestAssured.port = 9000;
    }

    @Test
    public void createTodo() {
        given().
                param("name", "name01").
                param("dueDate", "2014-12-01").
        when().
                post("/todo").
        then().
                statusCode(HttpStatus.SC_OK)
                .body("id", equalTo("1"))
                .body("name", equalTo("name01"))
                .body("dueDate", equalTo("2014-12-01"))
        ;
    }
}