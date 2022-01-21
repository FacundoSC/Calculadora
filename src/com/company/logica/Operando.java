package com.company.logica;

import java.util.Scanner;

public  class Operando {

    public static double getOperando(Scanner sc){
        return validar(sc, (byte) 0);
    }

    private static double validar(Scanner sc, byte bandera){
        String operando = "";
        double ope =  0.0;
        do {
            System.out.println("ingresar un operando");
            operando = sc.next();
            try {
                ope = Long.parseLong(operando);
                bandera = 1;

            }catch (NumberFormatException nFE){
                System.out.println("invalido");
            }
        } while(bandera == 0);
        return ope;
    }





}
