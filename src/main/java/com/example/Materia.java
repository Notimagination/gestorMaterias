package com.example;

import java.util.HashMap;

public class Materia {

    String nombre;
    static HashMap<Integer, String> correlativas = new HashMap<>();

    public static void Materias() {

        correlativas.put(120, "Programación I");
        correlativas.put(121, "Programación II");
        correlativas.put(122, "Programación III");
        correlativas.put(123, "Inglés I");
        correlativas.put(124, "Inglés II");
        correlativas.put(125, "Matemática I");
        correlativas.put(126, "Matemática II");

    }
    
}
