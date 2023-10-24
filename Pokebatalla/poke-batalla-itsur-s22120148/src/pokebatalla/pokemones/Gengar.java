/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokebatalla.pokemones;

import pokebatalla.movimiento.Tinieblas;
import pokebatalla.movimiento.Movimiento;
import pokebatalla.movimiento.RayoConfuso;
import pokebatalla.movimiento.Lenguetazo;

/**
 *
 * @author STACY CHAVEZ PALMERIN
 */

public class Gengar extends Pokemon{
    
    public enum Movimientos{
        TINIEBLAS,
        RAYOCONFUSO,
        LENGUETAZO,
    }
    
    public Gengar(){
       this.tipo = "FANTASMA/VENENO";
       this.hp = 60;
       this.ataque = 65;
       this.defensa = 60;
       this.nivel = 1;
       this.precision = 5;
    }
    public Gengar(String nombre){
        this();
        this.nombre = nombre;
    }
public void atacar (Pokemon oponente, Gengar.Movimientos movimientosAutilizar){
        Movimiento instanciaMovimiento;
        switch(movimientosAutilizar){
            case TINIEBLAS :
                instanciaMovimiento = new Tinieblas();
                break;
            case RAYOCONFUSO:
                instanciaMovimiento = new RayoConfuso();
                break;
            case LENGUETAZO:
                instanciaMovimiento = new Lenguetazo();
                break;
            default:
                throw new AssertionError();
        }
    }
    
}
