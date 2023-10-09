/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokebatalla;

import java.util.List;

/**
 *
 * @author FJML1983
 */
public class Pokemon {

    //Atributos
    protected String nombre;
    protected int nivel;
    protected int hp;
    protected int ataque;
    protected int defensa;
    protected double precision;
    protected String tipo;
   protected List<String> habilidades;

    Pokemon() {
    }
    //Setters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    

    //Métodos
    void atacar(Pokemon enemigo) {
        System.out.println("Mi pokemon: " + this.nombre);
        System.out.println("Esta atacando a:"+ enemigo);
        
        if(this.ataque > enemigo.defensa){
            //calcular el dano
            int dagame = this.ataque - enemigo.defensa;
            //Restar el dano del HP del oponente
            enemigo.hp = enemigo.hp - dagame;
            System.out.println("Y le causo un daño de:" + dagame);
        }else{
            // todo y si no que pasa
        }
        System.out.println("El pokemon enemigo quedo asi:" + enemigo);

    }

    @Override
    public String toString() {
        return this.getClass().getName() + "{tipo:" + tipo + " hp:" + hp + "}";
    }

}
