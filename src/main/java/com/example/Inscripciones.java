package com.example;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Inscripciones {

    static String nombre;
    static int legajo;
    static int inscripcion = 0;
    static String opciones[] = {"Inscribirse", "Salir"};
    static String salir[] = {"Salir"};
    static String masteriasInscribir[] = {"Inscribirse", "Salir"};

    static String materias[] = {
        
        "11071 - Introducción a la Programación",
        "11072 - Álgebra y Lógica Computacional",
        "21052 - Introducción a los Sistemas de Información",
        "41407 - Organización de Computadoras",
        "31971 - Inglés I",
        "11073 - Matemática Discreta", 
        "11074 - Programación I",
        "41406 - Arquitectura de Computadoras",
        "11081 - Análisis Matemático I",
        "11075 - Programación II",
        "11056 - Sistemas de Información I",
        "31072 - Inglés II",
        "11082 - Análisis Matemático II",
        "11410 - Sistemas Operativos",
        "11076 - Programación Orientada a Objetos",
        "11077 - Base de Datos I",
        "11058 - Sistemas de Información II",
        "10040 - Teleinformática y Redes",
        "11083 - Estadística y Probabilidad",
        "11079 - Programación Funcional y Lógica",
        "11059 - Sistemas de Información III",
        "11078 - Base de Datos II",
        "21057 - Aspectos Profesionales y Sociales",
        "11085 - Administración y Gestión de Redes",
        "41408 - Modelos, Simulación y Teoría de la Decisión",
        "41409 - Sistemas Distribuidos y Programación Paralela",
        "11086 - Programación en Ambiente Web",
        "11087 - Seminario de Integración Profesional"

    };

    static Icon iconDB = new ImageIcon("C:\\Users\\User\\Desktop\\CursadaUni\\resources\\database.png");
    static Icon iconReg = new ImageIcon("C:\\Users\\User\\Desktop\\CursadaUni\\resources\\login.png");
    static Icon iconColle = new ImageIcon("C:\\Users\\User\\Desktop\\CursadaUni\\resources\\college.png");
    static Icon iconSubjects = new ImageIcon("C:\\Users\\User\\Desktop\\CursadaUni\\resources\\subjects.png");

    public static void agregarDatos() {

        do {
            
            legajo = Integer.parseInt((String) JOptionPane.showInputDialog(null,"Ingresá tu legajo para continuar", "Inscripción a materias", JOptionPane.INFORMATION_MESSAGE, iconColle, null,""));
        
        } while(Integer.toString(legajo).length() < 5 || Integer.toString(legajo).length() > 5);

        BaseDatos getLegajo = new BaseDatos();
        getLegajo.comprobarDatos();

        if(legajo == getLegajo.getLegajo()) {

            BaseDatos getNombre = new BaseDatos();
            getNombre.comprobarDatos();

            JOptionPane.showInputDialog(null,"¡Hola, "+ getNombre.getNombre() +"!\n\nSolo vas a poder anotarte en las materias correlativas.\n\nActualmente te podés anotar en:\n\n• Matematica\n\nEstas son todas las materias disponoibles. ¡Buena cursada!\n ","Inscripción a materias", JOptionPane.QUESTION_MESSAGE, iconSubjects, materias, 0);

            /*if(inscripcion == 0) {

                getLegajo.editarDatos();

            } else if(inscripcion == 0) {

                getLegajo.editarDatos();

            } else if(inscripcion == 0) {

                getLegajo.editarDatos();

            } else if(inscripcion == 0) {

                getLegajo.editarDatos();

            } else if(inscripcion == 0) {

                getLegajo.editarDatos();

            } else if(inscripcion == 0) {

                getLegajo.editarDatos();
                
            } else if(inscripcion == 0) {

                getLegajo.editarDatos();

            } else if(inscripcion == 0) {

                getLegajo.editarDatos();

            } else if(inscripcion == 0) {

                getLegajo.editarDatos();

            } else if(inscripcion == 0) {

                getLegajo.editarDatos();

            } else if(inscripcion == 0) {

                getLegajo.editarDatos();
            }*/

        } else {

            inscripcion = JOptionPane.showOptionDialog (null, "El legajo ingresado no se encuentra en la base de datos de la institución.\nRevisá que lo hayas escrito correctamente.\n\nEn caso de que no seas alumno, podés inscribirte dandole al botón.", "Legajo no registrado", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, iconDB, opciones, 0);
            
            if(inscripcion == 0) {

                nombre = (String) JOptionPane.showInputDialog(null,"Ingresá tu nombre","Inscripción a la universidad", JOptionPane.INFORMATION_MESSAGE, iconReg, null,"");
            
                do {
                    
                    legajo = Integer.parseInt((String) JOptionPane.showInputDialog(null,"Ingresá tu legajo","Inscripción a la universidad", JOptionPane.INFORMATION_MESSAGE, iconReg, null,""));
                
                } while(Integer.toString(legajo).length() < 5 || Integer.toString(legajo).length() > 5);
    
                BaseDatos ifExist = new BaseDatos();
                ifExist.comprobarDatos();
    
                if(legajo == ifExist.getLegajo()) {
    
                    JOptionPane.showOptionDialog (null, "Ya existe una persona inscripta con ese número de legajo\n\nVerificá que lo hayas escrito correctamente.", "Usuario inscripto", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, iconDB, salir, 0);
    
                } else {
    
                    BaseDatos dataBase = new BaseDatos();
                    dataBase.registrarDatos();
                
                }
            
            }
        
        }
    
    }
    
    public static String getNombre() {

        return nombre;
    }

    public void setNombre(String nombre) {

        Inscripciones.nombre = nombre;
    
    }

    public static int getLegajo() {

        return legajo;

    }

    public void setLegajo(int legajo) {

        Inscripciones.legajo = legajo;

    }
    
}
