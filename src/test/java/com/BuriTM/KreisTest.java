package com.BuriTM;

import org.junit.Test;

import static org.junit.Assert.*;

public class KreisTest {

    Kreis k = new Kreis(2, 2, 4.0);

    @Test
    public void berechneUmfang() {
        assertEquals(25.132741228718345, k.berechneUmfang(), 0);
    }

    @Test
    public void berechneFlaeche() {

        assertEquals(50.26548245743669, k.berechneFlaeche(), 0);
    }
}