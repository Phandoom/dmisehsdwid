package com.BuriTM;

import org.junit.Test;

import static org.junit.Assert.*;

public class ViereckTest {

    Viereck v = new Viereck(0, 0, 2, 2);

    @Test
    public void berechneUmfang() {
        assertEquals(8, v.berechneUmfang(), 0);
    }

    @Test
    public void berechneFlaeche() {
        assertEquals(4, v.berechneFlaeche(), 0);
    }

}