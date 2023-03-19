/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cajero.automatico;

import javax.swing.JOptionPane;

/**
Hacer un programa que simule un cajero automaticocon un saldo inicial de 1000 dolares
con el siguiente menu de opciones
 1. Ingresar dinero a la cuenta
 2. Retirar dinero de la cuenta
 3. Salir
 */
public class CajeroAutomatico {

  
    public static void main(String[] args) {
       final int saldoInicial = 1000;
       int opcion;
       float ingreso,saldoActual,retiro;
       
       opcion = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido a su cajero automatico\n"
       + "1. Ingresar dinero a la cuenta\n"
       + "2. Retirar dinero de la cuenta\n"
       + "3. Salir"));
       
        switch (opcion){
            case 1: ingreso = Float.parseFloat(JOptionPane.showInputDialog("Cuanto desea ingresar a la cuenta: "));       
                    saldoActual = saldoInicial + ingreso;
                    JOptionPane.showMessageDialog(null,"Saldo disponible: "+saldoActual);
                    break;
            case 2: retiro = Float.parseFloat(JOptionPane.showInputDialog("Cuanto sea retirar: "));
                    
           if(retiro>saldoInicial){
           JOptionPane.showMessageDialog(null,"No cuenta con el dinero disponible para este retiro");
           }
           else {
             saldoActual = saldoInicial - retiro;
             JOptionPane.showMessageDialog(null,"Dinero en cuenta"+saldoActual);
           }
                    break;
            case 3: break;
            default: JOptionPane.showMessageDialog(null,"Eligio una opcion incorrecta");
        }
        
        
    }
    
}
