/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller1;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
/**
 *
 * @author Usuario
 */
public class Taller1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DecimalFormatSymbols simbolos = new DecimalFormatSymbols();
        simbolos.setDecimalSeparator('.');
        DecimalFormat formateador = new DecimalFormat("####.####",simbolos);
        java.util.Scanner leer=new java.util.Scanner (System.in);
        double largo=leer.nextDouble(); 
    }
}
