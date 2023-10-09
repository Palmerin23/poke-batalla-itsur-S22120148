/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokebatalla;

/**
 *
 * @author stacy
 */
import java.util.ArrayList;
public class Gengar extends Pokemon{
    
    public Gengar(){
       this.tipo = "FANTASMA/VENENO";
       this.hp = 60;
       this.ataque = 65;
       this.defensa = 60;
       this.nivel = 1;
       this.precision = 5;
       this.habilidades.add("TINIEBLAS");
       this.habilidades.add("HIPNOSIS");
    }
    public Gengar(String nombre){
        this();
        this.nombre = nombre;
    }
    public void atacar(Pokemon enemigo, String habilidad){
        if(habilidad.equals("TINIEBLAS")){
            System.out.println("Realizando TINIEBLAS");
        }else if(habilidad.equals("HIPNOSIS")){
            System.out.println("Realizando HIPNOSIS");
        }
    }
    
}
