//file:noinspection ClassJavadoc
package com.fernando.services

import groovy.transform.CompileStatic
import jakarta.enterprise.context.ApplicationScoped

import java.security.SecureRandom

@ApplicationScoped
@CompileStatic
class MyService {

    private final String[] firstNames = ['João', 'Maria', 'Pedro', 'Ana', 'Carlos',
                                         'Fernanda', 'Lucas', 'Juliana', 'Gabriel',
                                         'Carolina']
    private final String[] lastNames = ['Silva', 'Santos', 'Oliveira', 'Souza',
                                        'Pereira', 'Rodrigues', 'Ferreira', 'Lima', 'Costa',
                                        'Ribeiro']

    String gerarNome() {
        SecureRandom random = new SecureRandom()
        int randomFirstNameIndex = random.nextInt(firstNames.length)
        int randomLastNameIndex = random.nextInt(lastNames.length)
        return firstNames[randomFirstNameIndex] + ' ' + lastNames[randomLastNameIndex]
    }

}
