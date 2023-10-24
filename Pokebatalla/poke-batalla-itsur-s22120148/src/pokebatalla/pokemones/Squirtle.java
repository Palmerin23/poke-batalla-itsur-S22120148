/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokebatalla.pokemones;

/**
 *
 * @author STACY CHAVEZ PALMERIN 
 */
import pokebatalla.movimiento.Cascada;
import pokebatalla.movimiento.Movimiento;
import pokebatalla.movimiento.RayoBurbuja;
import pokebatalla.movimiento.Refugio;
public class Squirtle extends Pokemon{
    
    public enum Movimientos{
        CASCADA,
        RAYOBURBUJA,
        REFUGIO,
    }
    
    public Squirtle(){
       this.tipo = "AGUA";
       this.hp = 44;
       this.ataque = 48;
       this.defensa = 65;
       this.nivel = 1;
       this.precision = 4;
    }
    public Squirtle(String nombre){
        this();
        this.nombre = nombre;
    }
    public void atacar (Pokemon oponente, Squirtle.Movimientos movimientosAutilizar){
        Movimiento instanciaMovimiento;
        switch(movimientosAutilizar){
            case CASCADA :
                instanciaMovimiento = new Cascada();
                break;
            case RAYOBURBUJA:
                instanciaMovimiento = new RayoBurbuja();
                break;
            case REFUGIO:
                instanciaMovimiento = new Refugio();
                break;
            default:
                throw new AssertionError();
        }
    }
    
    
}
