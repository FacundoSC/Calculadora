package com.company.logica;

public interface Operacion {

    double operar() throws ArithmeticException;
    double obtenerOperando1();
    double  obtenerOperando2();
    String obtenerNombreOperacion();
}
