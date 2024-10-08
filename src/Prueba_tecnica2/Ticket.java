package Prueba_tecnica2;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author tracs
 */
public class Ticket {
    
    private int numero;
    private int fila;
    private int asiento;
    private double precio;
    private Date fechaCompra;
    private Date fechaValides;

    public Ticket() {
    }

    public Ticket(int numero, int fila, int asiento, double precio, Date fechaCompra, Date fechaValides) {
        this.numero = numero;
        this.fila = fila;
        this.asiento = asiento;
        this.precio = precio;
        this.fechaCompra = fechaCompra;
        this.fechaValides = fechaValides;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getAsiento() {
        return asiento;
    }

    public void setAsiento(int asiento) {
        this.asiento = asiento;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Date getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(Date fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public Date getFechaValides() {
        return fechaValides;
    }

    public void setFechaValides(Date fechaValides) {
        this.fechaValides = fechaValides;
    }

    @Override
    public String toString() {
        return "Ticket{" + "numero=" + numero + ", fila=" + fila + ", asiento=" + asiento + ", precio=" + precio + ", fechaCompra=" + fechaCompra + ", fechaValides=" + fechaValides + '}';
    }

    
    
}
