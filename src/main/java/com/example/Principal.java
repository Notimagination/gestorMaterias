package com.example;

public class Principal

{
    public static void main(String[] args ) {

        Menu.datos();

        Conexion dataBase = new Conexion();
        dataBase.estableceConexion();

    }
    
}
