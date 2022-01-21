package com.company.logica;

import com.company.presentacion.Menu;

import java.util.Scanner;

public class MenuControl {
    private Menu menu ;
    private Opcion op;
    private Scanner scanner;


    public MenuControl(Menu menu,Opcion op,Scanner scanner){
        this.menu = menu;
        this.op = op;
        this.scanner = scanner;
    }


    public void iniciar () {
        Operacion operacion;
        int opcion =99;
        while(opcion != 0){
            menu.ShowMostrar();
            opcion= op.getOpcion();
            switch (opcion){
                case 0 : menu.finalizar();
                    break;
                case 1: operacion = new Suma(Operando.getOperando(scanner),Operando.getOperando(scanner),menu);
                        operacion.operar();
                    break;
                case 2: operacion = new Resta(Operando.getOperando(scanner),Operando.getOperando(scanner),menu);
                        operacion.operar();
                         break;
                case 3: operacion = new Multiplicacion(Operando.getOperando(scanner),Operando.getOperando(scanner),menu);
                         operacion.operar();
                         break;
                case 4: operacion = null;/*new Division(Operando.getOperando(scanner),Operando.getOperando(scanner),menu);*/
                    //operacion.operar();
                    break;
                default:
                    menu.opcionInvalido();
                    break;
            }

        }
    }
}
