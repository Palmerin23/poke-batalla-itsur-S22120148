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
    
    @Override
    public Enum[] getMovimientos(){
        return Squirtle.Movimientos.values();
    }
    
    @Override
    public void atacar(Pokemon oponente, int ordinalMovimiento){
        Movimiento instanciaMovimiento;
        Squirtle.Movimientos movimientoAUtilizar = Squirtle.Movimientos.values()[ordinalMovimiento];
        switch(movimientoAUtilizar){
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
        if(this.hp<=0){
            System.out.println("Squirtle esta agotado y ya no puede realizar mas movimientos");
            return;
        }
        instanciaMovimiento.utilizar(this, oponente);
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
