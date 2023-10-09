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
public class Bullbasaur extends Pokemon {

   public  Bullbasaur() {
       this.tipo = "PLANTA/VENENO";
       this.hp = 45;
       this.ataque = 49;
       this.defensa = 49;
       this.nivel = 1;
       this.precision = 4;
       this.habilidades.add("LATIGO CEPPA");
       this.habilidades.add("HOJA AFILADA");
    }
   public Bullbasaur(String nombre){
       this();
       this.nombre =nombre;
   }
   public void atacar(Pokemon oponente, String habilidad){
       if(habilidad.equals("LATIGO CEPA")){
           System.out.println("Realizando LATIGO CEPA");
       }else if(habilidad.equals("HOJA AFILADA")){
           System.out.println("Realizando HOJA AFILADA");
       }
   }

}
