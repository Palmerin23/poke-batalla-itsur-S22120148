/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokebatalla.movimiento;

/**
 *
 * @author stacy
 */
public class Refugio extends MovimientoEstado{
    public Refugio(){
        this.tipo = TiposDeMovimiento.AGUA;
        this.potencia = 0;
        this.precision = 0;
        this.puntosPoder = 40;
    }
    
}
