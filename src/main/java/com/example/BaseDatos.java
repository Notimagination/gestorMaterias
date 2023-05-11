package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class BaseDatos {

    Connection conectar = null;

    String usuario = "root";
    String contraseña = "root";
    String bd = "db_tp_final";
    String ip = "localhost";
    String puerto = "3306";
    String ruta = "jdbc:mysql://" + ip + ":" + puerto + "/" + bd;

    ArrayList<String> estudiantes = new ArrayList<String>();
    ArrayList<Integer> legajos = new ArrayList<Integer>();

    String nombre;
    int legajo;
    String salir[] = {"Salir"};

    Icon iconCheck = new ImageIcon("C:\\Users\\User\\Desktop\\CursadaUni\\resources\\check.png");
    Icon iconError = new ImageIcon("C:\\Users\\User\\Desktop\\CursadaUni\\resources\\error.png");


    public Connection comprobarDatos() {

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            conectar = DriverManager.getConnection(ruta, usuario, contraseña);

            java.sql.Statement stmt = conectar.createStatement();

            ResultSet rs = stmt.executeQuery("SELECT * FROM alumnos");

            while(rs.next()) {

                if(rs.getInt("lejago") == Inscripciones.getLegajo() 
                || rs.getInt("lejago") == ConsultaCursada.getLegajo()) {

                    estudiantes.add(rs.getString("nombre"));
                    legajos.add(rs.getInt("lejago"));

                } 

            }

            String soloEstetica = estudiantes.toString().replace("[", "").replace("]", "");
            nombre = soloEstetica;
            legajo = legajos.get(0);

        } catch (Exception e) {

        }

        return conectar;

    }

    public Connection registrarDatos() {

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            conectar = DriverManager.getConnection(ruta, usuario, contraseña);

            JOptionPane.showOptionDialog (

                null, 
                "El alumno ha sido correctamente inscripto a la universidad.\n\nDatos registrados:\n\nNombre: " + Inscripciones.getNombre() + 
                "\nLegajo: " + Inscripciones.getLegajo() + 
                "\n\nAhora podés inscribirte a las materias desde el menú principal.",
                 "Registro exitoso", 
                 JOptionPane.YES_NO_CANCEL_OPTION, 
                 JOptionPane.PLAIN_MESSAGE, 
                 iconCheck, 
                 salir, 
                 0);

            java.sql.Statement stmt = conectar.createStatement();

            stmt.executeUpdate("INSERT INTO alumnos VALUES(\"" + Inscripciones.getNombre() + "\", \"" + Inscripciones.getLegajo() + "\", 0)");

            conectar.close();

        } catch (Exception e) {

            JOptionPane.showOptionDialog (

                null, 
                "Hubo un error al conectar con la base de datos. No se ha podido completar el registro.\n\nCódigo de error: " + e,
                 "Error al registrar", 
                 JOptionPane.YES_NO_CANCEL_OPTION, 
                 JOptionPane.PLAIN_MESSAGE, 
                 iconError, 
                 salir, 
                 0);

        }

        return conectar;
    }

    public Connection editarDatos() {

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            conectar = DriverManager.getConnection(ruta, usuario, contraseña);

            JOptionPane.showOptionDialog (

                null, 
                "¡Te inscribiste exitosamente a la materia!\n\nMateria: "+ Inscripciones.getAlmacenar() + 
                "\nCódigo: " + Inscripciones.getAlmacenarCod(), 
                "Registro exitoso", 
                JOptionPane.YES_NO_CANCEL_OPTION, 
                JOptionPane.PLAIN_MESSAGE, 
                iconCheck, 
                salir, 
                0);

            java.sql.Statement stmt = conectar.createStatement();

            stmt.executeUpdate("UPDATE alumnos set materias = \"" + Inscripciones.getAlmacenarCod() + "\" where lejago = \"" + Inscripciones.getLegajo() + "\"");

            conectar.close();

        } catch (Exception e) {

            JOptionPane.showOptionDialog (

                null, 
                "Hubo un error al conectar con la base de datos. No se han podido actualizar los datos.\n\nCódigo de error: " + e, 
                "Error al modificar", 
                JOptionPane.YES_NO_CANCEL_OPTION, 
                JOptionPane.PLAIN_MESSAGE, 
                iconError, 
                salir, 
                0);
        }

        return conectar;
        
    }

    public String getNombre() {
        return nombre;
    }

    public int getLegajo() {
        return legajo;
    }

}
