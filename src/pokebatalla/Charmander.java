/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokebatalla;

/**
 *
 * @author FJML1983
 */
import java.util.ArrayList;
public class Charmander extends Pokemon {
    public Charmander(){
       this.tipo = "FUEGO";
       this.hp = 39;
       this.ataque = 52;
       this.defensa = 43;
       this.nivel = 1;
       this.precision = 4;
       this.habilidades.add("LANZALLAMAS");
       this.habilidades.add("GIRO FUEGO");
    }
    public Charmander(String nombre){
        this();
        this.nombre = nombre;
    }
    public void atacar(Pokemon oponente, String habilidad){
        if(habilidad.equals("LANZALLAMAS")){
            System.out.println("Realizando LANZALLMAS");
        }else if(habilidad.equals("GIRO FUEGO")){
            System.out.println("Realizando GIRO FUEGO");
        }
    }
    
}
