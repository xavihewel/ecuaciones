package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EcuacionPrimerGradoIntegrationTest {

    EcuacionPrimerGrado ecuacion = new EcuacionPrimerGrado();

    @Test
    public void solucionaEcuacionConMenos(){
        Double result = ecuacion.obtenerResultado("2x - 1 = 0");
        Double valueExpeded = 0.5;
        assertEquals(valueExpeded, result);
    }

    @Test
    public void solucionaEcuacionConMas(){
        Double result = ecuacion.obtenerResultado("2x + 1 = 0");
        Double valueExpected = -0.5;
        assertEquals(valueExpected, result);
    }

    @Test
    public void solucinaEcuacionConParte3Mayor0(){
        Double result = ecuacion.obtenerResultado("2x + 1 = 10");
        Double valueExpeted = 4.5;
        assertEquals(valueExpeted, result);
    }
}
