package com.example;

import java.awt.event.*;  
import javax.swing.*;  

public class Menu {
    
    public static void menuPrincipal() {
        
        JFrame menuPrincipal = new JFrame("Menú principal");
        ImageIcon img = new ImageIcon("C:\\Users\\User\\Desktop\\CursadaUni\\resources\\menu.png");
        
        JButton primerBoton = new JButton("Inscribirse a materias");
        JButton segundoBoton = new JButton("Consultar estado de cursada");
        JButton tercerBoton = new JButton("Salir del menu");

        primerBoton.setBounds(50,20,200,30);
        segundoBoton.setBounds(50,60,200,30);
        tercerBoton.setBounds(50,100,200,30);

        menuPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        primerBoton.addActionListener(new ActionListener() {  
            
            public void actionPerformed(ActionEvent e){  
                
                Inscripciones.agregarDatos();

            }
        
        });

        menuPrincipal.setResizable(false);
        menuPrincipal.setIconImage(img.getImage());
        menuPrincipal.add(primerBoton);
        menuPrincipal.add(segundoBoton);
        menuPrincipal.add(tercerBoton);
        menuPrincipal.setSize(300,200);
        menuPrincipal.setLocationRelativeTo(null);  
        menuPrincipal.setLayout(null);
        menuPrincipal.setVisible(true);
   
        segundoBoton.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e){
                
                ConsultaCursada.InscripcionMat();
            
            }
        
        });
        
        tercerBoton.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e){

                System.exit(0);
            
            }
        
        });
    
    }

}
