package com.company.logica;

import com.company.presentacion.Menu;

import java.util.Scanner;

public class Opcion {
    private Menu menu;
    private Scanner sc;
    public Opcion(Menu menu, Scanner scanner){
        this.menu = menu;
        this.sc = scanner;
    }

    public int getOpcion(){
        menu.mensajeOpcion();
        return sc.nextInt();
    }
}
