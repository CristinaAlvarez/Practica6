package com.icai.practicas.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DNITest {

    private DNI dni;

    @Test
    void returnOK() {

        dni= new DNI("05458317A"); //OK
        Boolean expectedResult= true;
        Boolean result = dni.validar();

        Assertions.assertEquals(expectedResult,result);

    }
    @Test
    void returnNotOK1() {

        dni= new DNI("as0545831s79"); //Mal introducido
        Boolean expectedResult=false;
        Boolean result = dni.validar();

        Assertions.assertEquals(expectedResult,result);

    }
    @Test
    void returnNotOK2() {

        dni= new DNI("05458317Ai"); //La letra no esta aceptada
        Boolean expectedResult= false;
        Boolean result = dni.validar();

        Assertions.assertEquals(expectedResult,result);

    }
    @Test
    void returnNotOK3() {

        dni= new DNI("00000001R"); //Inválido
        Boolean expectedResult= false;
        Boolean result = dni.validar();

        Assertions.assertEquals(expectedResult,result);

    }
}