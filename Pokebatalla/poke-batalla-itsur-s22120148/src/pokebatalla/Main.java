/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pokebatalla;

import pokebatalla.pokemones.Squirtle;
import pokebatalla.pokemones.Lapras;
import pokebatalla.pokemones.Gengar;
import pokebatalla.Batallas.Batalla;
import pokebatalla.Batallas.Entrenador;

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
        Gengar gengarSalvaje = new Gengar("ALEGRIA");
        Lapras laprasSalvaje = new Lapras("DESAGRADO");
        Squirtle squirtleSalvaje = new Squirtle("FURIA");
        
       Entrenador entrenador1 = new Entrenador("STACY");
       entrenador1.capturarPokemon(laprasSalvaje);
       entrenador1.capturarPokemon(squirtleSalvaje);
       
       Entrenador entrenador2 = new Entrenador("JAYDEN");
       entrenador2.capturarPokemon(gengarSalvaje);
       entrenador2.capturarPokemon(squirtleSalvaje);
       
       Batalla batalla = new Batalla(entrenador1, entrenador2);
       batalla.desarrollarBatalla();
        
       
    }
    
}
