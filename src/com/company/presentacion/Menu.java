package com.company.presentacion;

public class Menu {

    public void ShowMostrar(){
        System.out.println("0.Salir");
        System.out.println("1.Suma");
        System.out.println("2.Resta");
        System.out.println("3.multiplicacion");
        System.out.println("4.Division");
    }


    public  void finalizar(){
        System.out.println("Exit");
    }

    public  void opcionInvalido(){
        System.out.println("opcion invalida");
    }
    public  void mensajeOpcion(){
        System.out.println("seleccionar operacion");
    }

    public void operacionExitosa(double operando1 , double operando2 , double resultado, String operacion){
        System.out.println(String.format("el resultado de  la %s  de  %.2f  en  %.2f es %.2f ",operacion,operando1,operando2, resultado));
    }

}
