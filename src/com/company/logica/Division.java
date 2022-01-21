package com.company.logica;

import com.company.presentacion.Menu;
import com.company.util.Constantes;

public class Division implements Operacion {
    private double operando1;
    private double operando2;
    private Menu menu;

    public Division (double operando1, double operando2){
        this.operando1=operando1;
        this.operando2=operando2;
        this.menu = menu;
    }

    @Override
    public double operar() throws ArithmeticException {
        if(operando2 == 0.0){
                throw new ArithmeticException(Constantes.MENSAJE_DIVISOR_CERO);

        }else {
            double resultado = operando1 / operando2;
            menu.operacionExitosa(operando1,operando2,resultado,this.getClass().getSimpleName().toLowerCase());
            return resultado;
        }
    }


}
