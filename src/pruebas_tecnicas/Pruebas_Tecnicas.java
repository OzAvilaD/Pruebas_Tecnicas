/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebas_tecnicas;

import Prueba_tecnica1.Prueba_Tecnica1;
import java.util.Scanner;

/**
 *
 * @author tracs
 */
public class Pruebas_Tecnicas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Prueba_Tecnica1 Pru = new Prueba_Tecnica1();
        Pru.LLenarMatriz();
        
        System.out.println("-----------BIENVENIDO----------------------------");
        boolean bandera = false;
        Scanner teclado = new Scanner(System.in);
        int fila,colu;
        String respuesta;
        
        while (bandera!=true) {            
            
            System.out.println("Para salir presione s o para mostrar m");
            respuesta = teclado.next();
            if(respuesta.equalsIgnoreCase("s")){
                bandera = true;
            }
            if(respuesta.equalsIgnoreCase("m")){
                Pru.MostrarMatriz();
            }
            
            
            System.out.println("");
            System.out.println("Ingrese la fila a ocupar");
            System.out.println("");
            fila = teclado.nextInt();
            System.out.println("Ingrese la asiento a ocupar");
            colu = teclado.nextInt();
            Pru.Ingreso_de_entrada(fila,colu);
            
            
            
        }
        
    }
    
}
