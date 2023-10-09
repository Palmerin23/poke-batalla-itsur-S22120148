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
public class Lapras extends Pokemon {
    
    public Lapras(){
       this.tipo = "AGUA/HIELO";
       this.hp = 130;
       this.ataque = 85;
       this.defensa = 80;
       this.nivel = 1;
       this.precision = 4;
       this.habilidades.add("HIDROBOMBA");
       this.habilidades.add("RAYO HIELO");
    }
    public Lapras(String nombre){
        this();
        this.nombre = nombre;
    }
    public void atacar(Pokemon oponente, String habilidad){
        if(habilidad.equals("HIDROBOMBA")){
            System.out.println("Realizando HIDROBOMBA");
        }else if(habilidad.equals("RAYO HIELO")){
            System.out.println("Realizando RAYO HIELO");
        }
    }
    
}
