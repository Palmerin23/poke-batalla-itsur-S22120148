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
public class Pikachu  extends Pokemon{

    //Constructor default
    public Pikachu() {
       this. tipo = "ELECTRICO";
       this.hp = 35;
       this. ataque = 55;
       this.defensa = 30;
       this.nivel = 1;
       this. precision = 4;
       this.habilidades.add("ATACKTRUENO");
       this.habilidades.add("BOLAVOLTIO");
    }    
    //constructor 1
    public Pikachu(String nombre){
        this();
        this.nombre =nombre;
        
    }
    public void atacar(Pokemon oponente, String habilidad){
        if(habilidad.equals("ATACKTRUENO")){
            System.out.println("Realizando ATACKTRUENO");
        }else if(habilidad.equals("BOLAVOLTIO")){
            System.out.println("Realizando BOLAVOLTIO");
        }
        
    }
    
}
