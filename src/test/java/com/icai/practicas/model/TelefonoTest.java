package com.icai.practicas.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TelefonoTest {


    private Telefono telefono;

    @Test
    void returnOK() {

        telefono= new Telefono("912345678"); //OK
        Boolean expectedResult= true;
        Boolean result = telefono.validar();

        Assertions.assertEquals(expectedResult,result);

    }
    @Test
    void returnNotOK() {

        telefono= new Telefono("9134far56780"); //not Ok
        Boolean expectedResult= false;
        Boolean result = telefono.validar();

        Assertions.assertEquals(expectedResult,result);

    }
}