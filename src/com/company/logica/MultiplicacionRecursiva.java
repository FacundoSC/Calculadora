package com.company.logica;

public class MultiplicacionRecursiva implements  Operacion{
    private double operando1;
    private double operando2;

    public MultiplicacionRecursiva(double operando1, double operando2) {
        this.operando1 = operando1;
        this.operando2 = operando2;
    }

    @Override
    public double operar() {
        if(this.operando1 == 0 || this.operando2 == 0){
            return 0.0;
        }
        else{
              --operando2;
            return  operando1 + this.operar();

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
