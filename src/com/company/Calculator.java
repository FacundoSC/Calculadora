package com.company;

import com.company.logica.*;
import com.company.presentacion.Menu;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Menu menu = new Menu();
        Scanner sc = new Scanner(System.in);
        Opcion op = new Opcion(menu,sc);
        MenuControl menuControl = new MenuControl(menu,op,sc);

        menuControl.iniciar();





    }


}
