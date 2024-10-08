package Prueba_tecnica1;

/**
 *
 * @author tracs
 */
public class Prueba_Tecnica1 {
    
    char asientos [][] = new char [10][10];
    
    public void LLenarMatriz(){
        for (int f = 0; f < 10; f++) {
            for (int c = 0; c < 10; c++) {
                asientos[f][c]= 'L';
            }
        }
    }
    
    public void MostrarMatriz(){
        System.out.println("");
        for (int f = 0; f < 10; f++) {
            for (int c = 0; c < 10; c++) {
                System.out.print("["+asientos[f][c]+"],");
            }
            System.out.println("");
        }
    }
    
    public void Ingreso_de_entrada(int fila, int colu){
        if(asientos[fila][colu]=='L'){
            System.out.println("Asiento asignado correctamente!!!");
            asientos[fila][colu]='X';
        }else{
            System.out.println("Asiento ya esta ocupado");
        }    
    }
    
}
   
//import java.util.Scanner;
//import Prueba_tecnica1.Prueba_Tecnica1;

/*IMPLEMENTACION EN CLASE MAIN 
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
        
*/
