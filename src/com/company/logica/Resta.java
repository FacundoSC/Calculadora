package com.company.logica;


import com.company.presentacion.Menu;

public class Resta implements  Operacion{
    private double operando1;
    private  double operando2;
    private Menu menu;
    public Resta(double operando1, double operando2, Menu menu) {
        this.operando1= operando1;
        this.operando2 = operando2;
        this.menu = menu;
    }

    @Override
    public double operar() {
        double resultado = operando1- operando2;
        menu.operacionExitosa(operando1,operando2,resultado,this.getClass().getSimpleName().toLowerCase());
        return resultado;
    }
}
