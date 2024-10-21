package com.pruebaCSV;

import java.awt.*;
import java.util.Scanner;

public class PruebaCSV {

    public static void main(String[] args) {
        //LectorCSV miLector = new LectorCSV();
        //miLector .leeCSV("src/main/resources/datos/pokemon.csv");

        MenuJava miMenu = new MenuJava("src/main/resources/datos/pokemon.csv");
        int seleccion = -1;
        Scanner s = new Scanner(System.in);
        while(seleccion != 0){
            System.out.println("Seleccione una opcion: ");
            if(s.hasNextInt()){
                seleccion = s.nextInt();
            }
            switch(seleccion){
                case 5: miMenu.listaTodos();break;
                default: System.out.println("Opcion no valida");break;
            }
        }

    }
}
