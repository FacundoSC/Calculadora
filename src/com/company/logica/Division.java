package com.company.logica;

import com.company.util.Constantes;

public class Division implements Operacion {
    private double operando1;
    private double operando2;


    public Division (double operando1, double operando2){
        this.operando1=operando1;
        this.operando2=operando2;
    }

    @Override
    public double operar() throws ArithmeticException {
        if(operando2 == 0.0){
                throw new ArithmeticException(Constantes.MENSAJE_DIVISOR_CERO);

        }else {
            return  operando1 / operando2;
        }
    }

    @Override
    public double obtenerOperando1() {
        return this.operando1;
    }

    @Override
    public double obtenerOperando2() {
        return this.operando2;
    }

    @Override
    public String obtenerNombreOperacion() {
        return this.getClass().getSimpleName().toLowerCase();
    }



}
