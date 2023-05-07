//file:noinspection ClassJavadoc
//file:noinspection MethodName
package com.fernando

import groovy.transform.CompileStatic
import org.junit.jupiter.api.Test
import static org.junit.jupiter.api.Assertions.assertEquals

@CompileStatic
class MyTest {

    @Test
    void 'teste simples'() {
        assertEquals(true, true, 'true deve ser true')
    }

}
