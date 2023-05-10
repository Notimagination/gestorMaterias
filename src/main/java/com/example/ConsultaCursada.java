package com.example;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ConsultaCursada {

    static int materia;
    static int legajo;
    static String alumno;
    static String salir[] = {"Salir"};

    static Icon iconDB = new ImageIcon("C:\\Users\\User\\Desktop\\CursadaUni\\resources\\database.png");
    static Icon iconReg = new ImageIcon("C:\\Users\\User\\Desktop\\CursadaUni\\resources\\login.png");
    static Icon iconStu = new ImageIcon("C:\\Users\\User\\Desktop\\CursadaUni\\resources\\student.png");

    public static void InscripcionMat() {

        do {
            
            legajo = Integer.parseInt((String) JOptionPane.showInputDialog(null,"Ingresá tu legajo para continuar","Consultar cursadas", JOptionPane.INFORMATION_MESSAGE, iconReg, null,""));
        
        } while(Integer.toString(legajo).length() < 5 || Integer.toString(legajo).length() > 5);

        BaseDatos getLegajo = new BaseDatos();
        getLegajo.comprobarDatos();

        if(legajo != getLegajo.getLegajo()) {

            JOptionPane.showOptionDialog (null, "El estudiante con el legajo ingresado no se encuentra en la base de datos.\nVerificá que lo escribiste correctamente e intentalo nuevamente.", "Legajo no registrado", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, iconDB, salir, 0);
        
        } else {

            BaseDatos nombre = new BaseDatos();
            nombre.comprobarDatos();

            JOptionPane.showOptionDialog (null, "¡Hola de nuevo, "+ nombre.getNombre() +"!\n\nEsta es una breve información sobre tu situación\n\nActualmente cursando:\n\n• Física\n\nMaterias que podés cursar:\n\n• Ingés\n• Física II", "Consulta sobre cursada", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, iconStu, salir, 0);
    }}

    public static int getMateria() {

        return materia;

    }

    public static void setMateria(int materia) {

        ConsultaCursada.materia = materia;

    }

    public static int getLegajo() {

        return legajo;

    }

    public static void setLegajo(int legajo) {

        ConsultaCursada.legajo = legajo;

    }

    public static String getAlumno() {

        return alumno;

    }

    public static void setAlumno(String alumno) {
        
        ConsultaCursada.alumno = alumno;

    }
    
}
