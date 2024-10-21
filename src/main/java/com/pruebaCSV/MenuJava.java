package com.pruebaCSV;

import com.opencsv.CSVReader;

import java.io.FileReader;
import java.util.ArrayList;

public class MenuJava extends ArrayList<Pokemon> {
    public MenuJava(String nombreArchivo) {
        try {
            CSVReader csvReader = new CSVReader(new FileReader(nombreArchivo));
            String[] fila = null;
            fila = csvReader.readNext();
            while((fila = csvReader.readNext()) != null) {
                Pokemon miPokemon = new Pokemon(fila);
                this.add(miPokemon);
            }
            csvReader.close();
        } catch (Exception ex) {
            System.out.print(ex.getMessage());
        }
    }
    public void listaTodos(){
        this.forEach((p) -> System.out.println(p.getName()));
    }
}
