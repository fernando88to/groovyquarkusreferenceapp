//file:noinspection ClassJavadoc
package com.fernando

import groovy.transform.CompileStatic
import jakarta.ws.rs.GET
import jakarta.ws.rs.Path
import jakarta.ws.rs.Produces
import jakarta.ws.rs.core.MediaType


@CompileStatic
@Path('/people')
class PeopleResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    String hello() {
        return 'hello'
    }

}
