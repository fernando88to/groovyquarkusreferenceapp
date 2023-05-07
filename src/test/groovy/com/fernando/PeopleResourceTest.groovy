//file:noinspection ClassJavadoc
//file:noinspection JUnitTestMethodWithoutAssert
package com.fernando

import static io.restassured.RestAssured.given
import static org.hamcrest.CoreMatchers.is
import groovy.transform.CompileStatic
import io.quarkus.test.junit.QuarkusTest
import org.junit.jupiter.api.Test



@CompileStatic
@QuarkusTest
class PeopleResourceTest {

    @Test
    void testHelloEndpoint() {
        given()
                .when()
                .get('/people')
                .then()
                .body(is('hello'))
    }

}
