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
public class Squirtle extends Pokemon{
    
    public Squirtle(){
       this.tipo = "AGUA";
       this.hp = 44;
       this.ataque = 48;
       this.defensa = 65;
       this.nivel = 1;
       this.precision = 4;
       this.habilidades.add("LATIGO");
       this.habilidades.add("PISTOLA AGUA");
    }
    public Squirtle(String nombre){
        this();
        this.nombre = nombre;
    }
    public void atacar(Pokemon oponente, String habilidad){
        if(habilidad.equals("LATIGO")){
            System.out.println("Realizando LATIGO");
        }else if(habilidad.equals("PISTOLA AGUA")){
            System.out.println("Realizando PISTOLA AGUA");
        }
    }
    
    
}
