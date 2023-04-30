package com.example;

import javax.swing.JOptionPane;

public class Inscripcion {

    static int materia;
    static int alumno;

    public static void InscripcionMat() {

        do {
            
            alumno = Integer.parseInt(JOptionPane.showInputDialog("Ingresá el legajo (5 números)"));
        
        } while(Integer.toString(alumno).length() < 5 || Integer.toString(alumno).length() > 5);

        do {

            materia = Integer.parseInt(JOptionPane.showInputDialog("Ingresá el código de la materia a inscribir\n\n120 - Programación I\n121 - Programación  II\n122 - Programación III\n123 - Inglés I\n124 - Inglés II\n125 - Matemática I\n126 - Matemática II"));

        } while(materia < 120 || materia > 126);



        /*Trabado en las condicionales y el checkeo de datos */
        
    }
    
}
