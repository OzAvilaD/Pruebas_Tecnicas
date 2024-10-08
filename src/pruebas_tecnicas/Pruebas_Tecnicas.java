/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebas_tecnicas;


import Prueba_tecnica2.Ticket;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
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
            List<Ticket> ListaTickets = new ArrayList();
            
            Ticket tick = new Ticket(12, 2, 3, 1500, new Date(), new Date());
            Ticket tick2 = new Ticket(13, 3, 4, 1500,new Date(), new Date());
            
            Ticket tick3 = new Ticket();
            
            tick3.setNumero(20);
            tick3.setFila(3);
            tick3.setAsiento(1);
            tick3.setPrecio(2300);
            tick3.setFechaCompra(new Date());
            tick3.setFechaValides(new Date());
            
            ListaTickets.add(tick);
            ListaTickets.add(tick2);
            ListaTickets.add(tick3);
            
            
//            Suma de Precios
            double suma = 0;
            for(Ticket ticket : ListaTickets){
                suma = suma + ticket.getPrecio();
            }
            System.out.println("la suma de los tickets es: Q"+ String.format("%.2f", suma));
            
            Scanner teclado = new Scanner(System.in);
            
            System.out.println("ingrese la fila de la que desea ver tickets: ");
            int fila = teclado.nextInt();
            boolean bandera = false;
            
            for(Ticket ticket : ListaTickets){
                if (ticket.getFila()==fila) {
                    System.out.println(ticket.toString());
                    bandera = true;
                }
            }
            
            if (bandera == false) {
                System.out.println("NO Se encontraron datos");
        }
    }
    
}
