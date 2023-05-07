//file:noinspection ClassJavadoc
//file:noinspection JUnitTestMethodWithoutAssert
package com.fernando

import static io.restassured.RestAssured.given
import static org.hamcrest.Matchers.notNullValue;
import groovy.transform.CompileStatic
import io.quarkus.test.junit.QuarkusTest
import org.junit.jupiter.api.Test


@CompileStatic
@QuarkusTest
class IndexResourceTest {

    @Test
    void test() {
        given()
                .get('/index')
                .then()
                .statusCode(200)
                .body('name', notNullValue())
    }

}
