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
    static String almacenar;
    static String almacenarCod;
    static String masteriasInscribir[] = {"Inscribirse", "Salir"};

    /*WELL, THIS OBVIOSLY CAN BE OPTIMIZED USING HASMAPS, BUT I HAVE NO I IDEA HOW TO DO THAT
     * IF IN SOME MOMENT A IDEA DROPS IN MY HEAD, WILL FIX IT
     * BUT, AT THIS MOMENT, EVERYTHING WORKS FINE     * 
    */

    static String materias[] = {
        
        "Introducción a la Programación",
        "Álgebra y Lógica Computacional",
        "Introducción a los Sistemas de Información",
        "Organización de Computadoras",
        "Inglés I",
        "Matemática Discreta", 
        "Programación I",
        "Arquitectura de Computadoras",
        "Análisis Matemático I",
        "Programación II",
        "Sistemas de Información I",
        "Inglés II",
        "Análisis Matemático II",
        "Sistemas Operativos",
        "Programación Orientada a Objetos",
        "Base de Datos I",
        "Sistemas de Información II",
        "Teleinformática y Redes",
        "Estadística y Probabilidad",
        "Programación Funcional y Lógica",
        "Sistemas de Información III",
        "Base de Datos II",
        "Aspectos Profesionales y Sociales",
        "Administración y Gestión de Redes",
        "Modelos, Simulación y Teoría de la Decisión",
        "Sistemas Distribuidos y Programación Paralela",
        "Programación en Ambiente Web",
        "Seminario de Integración Profesional"

    };

    static String materiasCodigo[] = {
        
        "11071",
        "11072",
        "21052",
        "41407",
        "31971",
        "11073", 
        "11074",
        "41406",
        "11081",
        "11075",
        "11056",
        "31072",
        "11082",
        "11410",
        "11076",
        "11077",
        "11058",
        "10040",
        "11083",
        "11079",
        "11059",
        "11078",
        "21057",
        "11085",
        "41408",
        "41409",
        "11086",
        "11087"

    };

    /*I KNOW I KNOW, IT DOESN'T LOOK COOL, I SAID IT TO YOU, JUST WAIT FOR A IDEA */

    static Icon iconDB = new ImageIcon("C:\\Users\\User\\Desktop\\CursadaUni\\resources\\database.png");
    static Icon iconReg = new ImageIcon("C:\\Users\\User\\Desktop\\CursadaUni\\resources\\login.png");
    static Icon iconColle = new ImageIcon("C:\\Users\\User\\Desktop\\CursadaUni\\resources\\college.png");
    static Icon iconSubjects = new ImageIcon("C:\\Users\\User\\Desktop\\CursadaUni\\resources\\subjects.png");

    public static void agregarDatos() {

        do {
            
            legajo = Integer.parseInt((String) JOptionPane.showInputDialog(
                
                null,
                "Ingresá tu legajo para continuar", 
                "Inscripción a materias", 
                JOptionPane.INFORMATION_MESSAGE, 
                iconColle, 
                null,
                ""));
        
        } while(Integer.toString(legajo).length() < 5 || Integer.toString(legajo).length() > 5);

        BaseDatos getLegajo = new BaseDatos();
        getLegajo.comprobarDatos();

        if(legajo == getLegajo.getLegajo()) {

            BaseDatos getNombre = new BaseDatos();
            getNombre.comprobarDatos();

            Object anotarMaterias =JOptionPane.showInputDialog(

                null,
                "¡Hola, "+ getNombre.getNombre() +"!\n\nSolo vas a poder anotarte en las materias correlativas.\n\nActualmente te podés anotar en:\n\n• Matematica\n\nEstas son todas las materias disponoibles.\n ",
                "Inscripción a materias", 
                JOptionPane.QUESTION_MESSAGE, 
                iconSubjects,
                 materias, 
                 "Introducción a la Programación");

                 try {
                 
                 for (int i = 0; i <= materias.length; i++) {
                    
                    if(anotarMaterias == materias[i]) {
                        
                        almacenar = materias[i];
                        almacenarCod = materiasCodigo[i];
                        getLegajo.editarDatos();
                    
                    }}

                } catch (Exception e) {

                }
                
                } else {
                    
                    inscripcion = JOptionPane.showOptionDialog (
                        
                    null, 
                    "El legajo ingresado no se encuentra en la base de datos de la institución.\nRevisá que lo hayas escrito correctamente.\n\nEn caso de que no seas alumno, podés inscribirte dándole al botón.", 
                    "Legajo no registrado", 
                    JOptionPane.YES_NO_CANCEL_OPTION, 
                    JOptionPane.PLAIN_MESSAGE, 
                    iconDB,
                    opciones,
                    0);
                    
                    if(inscripcion == 0) {
                        
                        nombre = (String) JOptionPane.showInputDialog(

                            null,
                            "Ingresá tu nombre",
                            "Inscripción a la universidad", 
                            JOptionPane.INFORMATION_MESSAGE, 
                            iconReg, 
                            null,
                            "");
                            
                            do {
                                
                                legajo = Integer.parseInt((String) JOptionPane.showInputDialog(
                                    
                                null,
                                "Ingresá tu legajo",
                                "Inscripción a la universidad", 
                                JOptionPane.INFORMATION_MESSAGE, iconReg, 
                                null,
                                ""));
                            
                            } while(Integer.toString(legajo).length() < 5 || Integer.toString(legajo).length() > 5);
                            
                            BaseDatos ifExist = new BaseDatos();
                            ifExist.comprobarDatos();
                            
                            if(legajo == ifExist.getLegajo()) {
                                
                                JOptionPane.showOptionDialog (

                                    null, 
                                    "Ya existe una persona inscripta con ese número de legajo\n\nVerificá que lo hayas escrito correctamente.", 
                                    "Usuario inscripto", 
                                    JOptionPane.YES_NO_CANCEL_OPTION, 
                                    JOptionPane.PLAIN_MESSAGE, 
                                    iconDB, 
                                    salir, 
                                    0);
                                
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
                    
                    public static String getAlmacenar() {
                        
                        return almacenar;
                    
                    }
                    
                    public static String getAlmacenarCod() {
                        
                        return almacenarCod;
                    
                    }
                
                }
