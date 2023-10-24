/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pokebatalla;

import pokebatalla.pokemones.Squirtle;
import pokebatalla.pokemones.Lapras;
import pokebatalla.pokemones.Gengar;


/**
 *
 * @author STACY CHAVEZ PALMERIN
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hello PokeBatalla!");
        Gengar gengarSalvaje = new Gengar();
        Lapras laprasSalvaje = new Lapras();
        Squirtle squirtleSalvaje = new Squirtle();
        
        System.out.println("Lapras se encuentra con Squirtle, se enojan y empiezan a pelear");
        laprasSalvaje.atacar(squirtleSalvaje, Lapras.Movimientos.RAYOHIELO);
        System.out.println("Gengar pelea contra Gastly");
        gengarSalvaje.atacar(laprasSalvaje, Gengar.Movimientos.TINIEBLAS);
        System.out.println("Squirtle se enoja y pelea contra Gengar");
        squirtleSalvaje.atacar(gengarSalvaje, Squirtle.Movimientos.RAYOBURBUJA);
        
       
    }
    
}
