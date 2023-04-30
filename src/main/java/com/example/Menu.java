package com.example;

import javax.swing.JOptionPane;

public class Menu {

    public static void datos() {

        int opcion;
        
        do {
            
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingresá una opción\n\n[1] Ingresar datos\n[2] Inscripción a materias\n[3] Verificar inscripciones\n[4] Cerrar menú"));
        
        } while(opcion  < 1 || opcion > 4);
        
        switch(opcion) {
            
            case 1: Alumno.agregarDatos();
                    break;
            case 2: Inscripcion.InscripcionMat();
                    break;
            case 3:
                    break;

            }

        }

    }


