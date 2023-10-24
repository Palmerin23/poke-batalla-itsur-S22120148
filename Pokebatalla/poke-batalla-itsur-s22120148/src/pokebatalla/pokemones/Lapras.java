/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokebatalla.pokemones;

/**
 *
 * @author STACY CHAVEZ PALMERIN 
 */
import pokebatalla.movimiento.Neblina;
import pokebatalla.movimiento.Movimiento;
import pokebatalla.movimiento.RayoHielo;
import pokebatalla.movimiento.Martillazo;

public class Lapras extends Pokemon {
    
    public enum Movimientos{
        NEBLINA,
        RAYOHIELO,
        MARTILLAZO,
    }
    
    public Lapras(){
       this.tipo = "AGUA/HIELO";
       this.hp = 130;
       this.ataque = 85;
       this.defensa = 80;
       this.nivel = 1;
       this.precision = 4;
    }
    public Lapras(String nombre){
        this();
        this.nombre = nombre;
    }
public void atacar (Pokemon oponente, Lapras.Movimientos movimientosAutilizar){
        Movimiento instanciaMovimiento;
        switch(movimientosAutilizar){
            case MARTILLAZO:
                instanciaMovimiento = new Martillazo();
                break;
            case RAYOHIELO:
                instanciaMovimiento = new RayoHielo();
                break;
            case NEBLINA:
                instanciaMovimiento = new Neblina();
                break;
            default:
                throw new AssertionError();
        }
    }
    
}
