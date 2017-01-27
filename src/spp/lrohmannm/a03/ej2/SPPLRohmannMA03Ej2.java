/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.lrohmannm.a03.ej2;
import java.util.Scanner;
/**
 *
 * @author lisdyrohmann
 */
public class SPPLRohmannMA03Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Función matemática: "Pow" y "PI"
       Scanner Sca = new Scanner(System.in);
        System.out.println("Cálculo del área de un círculo");
        System.out.println("Ingrese el radio del círculo");
        

double radio = Sca.nextInt();

double Resultado = Math.PI * Math.pow(radio,2);

System.out.print("El area del circulo es: " + Resultado);
    }
    
}
