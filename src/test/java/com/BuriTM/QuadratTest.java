package com.BuriTM;

import org.junit.Test;

import static org.junit.Assert.*;

public class QuadratTest {

    Quadrat q = new Quadrat(0, 0, 2, 2);

    @Test
    public void berechneUmfang() {
        assertEquals(8, q.berechneUmfang(), 0);
    }

    @Test
    public void berechneFlaeche() {
        assertEquals(4, q.berechneFlaeche(), 0);
    }
}