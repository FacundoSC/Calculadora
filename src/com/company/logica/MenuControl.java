package com.company.logica;

import com.company.presentacion.Menu;

import java.util.Scanner;

public class MenuControl {
    private Menu menu;
    private Opcion op;
    private Scanner scanner;


    public MenuControl(Menu menu, Opcion op, Scanner scanner) {
        this.menu = menu;
        this.op = op;
        this.scanner = scanner;
    }


    public void iniciar() {
        Operacion operacion;
        int opcion = 99;
        while (opcion != 0) {
            menu.ShowMostrar();
            opcion = op.getOpcion();
            switch (opcion) {
                case 0:
                    menu.finalizar();
                    break;
                case 1:
                    try {
                        operacion = new Suma(Operando.getOperando(scanner), Operando.getOperando(scanner));
                        menu.operacionExitosa(operacion.obtenerOperando1(), operacion.obtenerOperando2(), operacion.operar(), operacion.obtenerNombreOperacion());
                    } catch (ArithmeticException arithmeticException) {
                        System.out.println(arithmeticException.getMessage());
                    }
                    break;
                case 2:
                    try {
                        operacion = new Resta(Operando.getOperando(scanner), Operando.getOperando(scanner));
                        menu.operacionExitosa(operacion.obtenerOperando1(), operacion.obtenerOperando2(), operacion.operar(), operacion.obtenerNombreOperacion());
                    } catch (ArithmeticException arithmeticException) {
                        System.out.println(arithmeticException.getMessage());
                    }
                    break;
                case 3:
                    try {
                        operacion = new MultiplicacionRecursiva(Operando.getOperando(scanner), Operando.getOperando(scanner));
                        menu.operacionExitosa(operacion.obtenerOperando1(), operacion.obtenerOperando2(), operacion.operar(), operacion.obtenerNombreOperacion());
                    } catch (ArithmeticException arithmeticException) {
                        System.out.println(arithmeticException.getMessage());
                    }
                    break;
                case 4:
                    try {
                        operacion = new Division(Operando.getOperando(scanner), Operando.getOperando(scanner));
                        menu.operacionExitosa(operacion.obtenerOperando1(), operacion.obtenerOperando2(), operacion.operar(), operacion.obtenerNombreOperacion());
                    } catch (ArithmeticException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                default:
                    menu.opcionInvalido();
                    break;
            }

        }
    }
}
