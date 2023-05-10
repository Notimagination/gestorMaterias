package com.example;

import java.util.HashMap;

public class Materias {

    static HashMap<Integer, String> materiasSinCorrelativas = new HashMap<>();
    static HashMap<Integer, String> materiasCorrelativas = new HashMap<>();

    public String MateriasSinCorrelativas() {
        
        materiasSinCorrelativas.put(11071, "Introducción a la Programación");
        materiasSinCorrelativas.put(11072, "Álgebra y Lógica Computacional");
        materiasSinCorrelativas.put(21056, "Introducción a los Sistemas de Información");
        materiasSinCorrelativas.put(41407, "Organización de Computadoras");
        materiasSinCorrelativas.put(31971, "Inglés I");

       return null;

    }

    public String MateruiasCorrelativas() {
        
        materiasCorrelativas.put(11073, "Matemática Discreta");
        materiasCorrelativas.put(11074, "Programación I");
        materiasCorrelativas.put(41406, "Arquitectura de Computadoras");
        materiasCorrelativas.put(11081, "Análisis Matemático I");
        materiasCorrelativas.put(11075, "Programación II");
        materiasCorrelativas.put(11056, "Sistemas de Información I");
        materiasCorrelativas.put(31972, "Inglés II");
        materiasCorrelativas.put(11082, "Análisis Matemático II");
        materiasCorrelativas.put(11410, "Sistemas Operativos");
        materiasCorrelativas.put(11076, "Programación Orientada a Objetos");
        materiasCorrelativas.put(11077, "Base de Datos I");
        materiasCorrelativas.put(11058, "Sistemas de Información II");
        materiasCorrelativas.put(10040, "Teleinformática y Redes");
        materiasCorrelativas.put(11083, "Estadística y Probabilidad");
        materiasCorrelativas.put(11079, "Programación Funcional y Lógica");
        materiasCorrelativas.put(11059, "Sistemas de Información III");
        materiasCorrelativas.put(11078, "Base de Datos II");
        materiasCorrelativas.put(21057, "Aspectos Profesionales y Sociales");
        materiasCorrelativas.put(11085, "Administración y Gestión de Redes");
        materiasCorrelativas.put(41408, "Modelos, Simulación y Teoría de la Decisión");
        materiasCorrelativas.put(41409, "Sistemas Distribuidos y Programación Paralela");
        materiasCorrelativas.put(11086, "Programación en Ambiente Web");
        materiasCorrelativas.put(11087, "Seminario de Integración Profesional");
        
        return null;

    }

}
