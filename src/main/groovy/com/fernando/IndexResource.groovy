//file:noinspection ClassJavadoc
package com.fernando

import com.fernando.services.MyService
import groovy.transform.CompileStatic
import jakarta.inject.Inject
import jakarta.ws.rs.GET
import jakarta.ws.rs.Path

@CompileStatic
@Path('/index')
class IndexResource {

    @Inject
    MyService myService

    @GET
    Map<String, String> gerarNome() {
        String name = myService.gerarNome()
        return [name:name]
    }

}
