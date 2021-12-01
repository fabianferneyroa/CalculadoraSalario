package com.veterinaria.salarios;

import junit.framework.TestCase;

public class OperacionesTest extends TestCase {
Operaciones op= new Operaciones();

    public void testCalcularSalario() {


        assertEquals(480000.0,op.calcularSalario(1,40));
    }
}