/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokebatalla.movimiento;

/**
 *
 * @author stacy
 */
public class RayoConfuso extends MovimientoEstado{
    public RayoConfuso(){
        this.tipo = TiposDeMovimiento.FANTASMA;
        this.potencia = 0;
        this.precision = 100;
        this.puntosPoder = 10;
    }
    
}
