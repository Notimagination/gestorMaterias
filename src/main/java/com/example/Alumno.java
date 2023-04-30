package com.example;

import javax.swing.JOptionPane;

public class Alumno {

    static String nombre;
    static int legajo;

    public static void agregarDatos() {

        nombre = JOptionPane.showInputDialog("Ingresá el nombre del alumno");
        
        do {
            
            legajo = Integer.parseInt(JOptionPane.showInputDialog("Ingresá el legajo (5 números)"));
        
        } while(Integer.toString(legajo).length() < 5 || Integer.toString(legajo).length() > 5);

    }

    public static String getNombre() {

        return nombre;
    }

    public void setNombre(String nombre) {

        Alumno.nombre = nombre;
    
    }

    public static int getLegajo() {

        return legajo;

    }

    public void setLegajo(int legajo) {

        Alumno.legajo = legajo;

    }
    
}
