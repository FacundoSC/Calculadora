package com.company.logica;


import com.company.presentacion.Menu;

public class Resta implements  Operacion{
    private double operando1;
    private  double operando2;


    public Resta(double operando1, double operando2) {
        this.operando1 = operando1;
        this.operando2 = operando2;
    }

    @Override
    public double operar() {
        return operando1- operando2;
    }

    @Override
    public double obtenerOperando1() {
        return operando1;
    }

    @Override
    public double obtenerOperando2() {
        return operando2;
    }

    @Override
    public String obtenerNombreOperacion() {
        return this.getClass().getSimpleName().toLowerCase();
    }

}
