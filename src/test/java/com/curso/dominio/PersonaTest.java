package com.curso.dominio;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Random;

import org.junit.jupiter.api.Test;

public class PersonaTest {
    @Test
    void testHBirthday() {

        Random random = new Random();
        int initAge = random.nextInt();
        
        Persona instance = new Persona("a","b",initAge,false);
        instance.hBirthday();
        int expResultD=initAge;
        int resultD = instance.getEdad();

        instance.setVivo(true);
        instance.hBirthday();
        
        int expResultA=initAge +1;
        int resultA = instance.getEdad();        
        
        assertEquals(expResultD, resultD);
        assertEquals(expResultA, resultA);

    }

    @Test
    void testMayorDeEdad() {
        Persona persona17 = new Persona("a","b",17);
        Persona persona18 = new Persona("a","b",18);
        Persona persona19 = new Persona("a","b",19);
        
        boolean result17 = persona17.mayorDeEdad();
        boolean result18 = persona18.mayorDeEdad();
        boolean result19 = persona19.mayorDeEdad();
        
        boolean expResult17 = false;
        boolean expResult18 = true;
        boolean expResult19 = true;
        
        assertEquals(result17, expResult17);       
        assertEquals(result18, expResult18);
        assertEquals(result19, expResult19);
    }
}
