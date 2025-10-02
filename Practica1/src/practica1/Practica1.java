/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica1;

import javax.swing.JOptionPane;

/**
 *
 * @author justi
 */
public class Practica1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String Nombre ="";
        String Apellido ="";
        String lectura;
        Nombre=JOptionPane.showInputDialog("Digite su Nombre =");
        Apellido=JOptionPane.showInputDialog("Digite su apellido =");
    lectura =JOptionPane.showInputDialog("Digite su salario mensual ="));
        Salario = Double.parseDouble(lectura)
        SEM=Salario*0.0925
        IVM=Salario*0.0508
        ASO=Salario*0.025
    if (Salario>2373000){
        Impuesto=(Salario-273000)*0.2
    }
    if (Salario>=1352000 || Salario<=2373000){
        Impuesto=(Salario-1352000)*0.15
    }
    if (Salario>=922000 || Salario<=1352000){
        Impuesto=(Salario-92000)*0.1
    }
    else{
    }
    JOptionPane.showMessageDialog("su salario con deducciones es="+Salario"-"+SEM"-"+IVM"-"+ASO.);
    }
}