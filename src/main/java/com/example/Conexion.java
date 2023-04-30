package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Random;
import javax.swing.JOptionPane;

public class Conexion {

    Connection conectar = null;

    String usuario = "root";
    String contraseña = "root";
    String bd = "db_tp_final";
    String ip = "localhost";
    String puerto = "3306";
    String ruta = "jdbc:mysql://" + ip + ":" + puerto + "/" + bd;

    public Connection estableceConexion() {

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            conectar = DriverManager.getConnection(ruta, usuario, contraseña);

            JOptionPane.showMessageDialog(null, "Se conectó exitosamente a la base de datos. Toda modificación que se haya hecho, se guardó");

            java.sql.Statement stmt = conectar.createStatement();

            /*Bueno, paso a explicar esta parte porque es un choclo que hice
             * 
             * Dado que no sé si no entendí bien al consigna o qué, no entendí cómo hacerl el tema de las materias
             * Por lo cual, a cada usuario que se registre, se le asignará un número aleatorio, el cual corresponde a x materia
             * Ejemplo, si se le asignó el número 120, que es de la materia "Programación I"
             * Cuando elija anotarse en otra materia, y elija, por ejemplo, el número 122
             * Que es de "Programación III", le dará un error diciendo que no puede anotarse en esa
             * Ya que no pasó por "Programación II"
             * De todos modos se puede ver la idea en sí en las demás funciones
             * 
             * 
             * El código es completamente funcional, solo que no cumple con lo pedido, ya que me quedé estancado
             * En la parte de comparar datos entre el código y la db
             */

            Random random = new Random();
            int menor = 120;
            int mayor = 126;
            int materiaRandom = random.nextInt(mayor-menor) + menor;

            stmt.executeUpdate("INSERT INTO alumnos VALUES(\"" + Alumno.getNombre() + "\", \"" + Alumno.getLegajo() + "\", \"" + materiaRandom + "\")");

            ResultSet rs = stmt.executeQuery("SELECT nombre FROM alumnos WHERE \"" + materiaRandom + "\"");

            conectar.close();

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Hubo un error al conectar con la base de datos\nCódigo de error: " + e);

        }

        return conectar;
        
    }

}
