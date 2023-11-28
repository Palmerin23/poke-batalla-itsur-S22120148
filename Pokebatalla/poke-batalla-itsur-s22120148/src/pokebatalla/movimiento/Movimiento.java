/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokebatalla.movimiento;

import pokebatalla.pokemones.Pokemon;
/**
 *
 * @author STACY CHAVEZ PALMERIN
 */
public class Movimiento {
    enum TiposDeMovimiento{
        AGUA,
        BICHO,
        DRAGON,
        ELECTRICO,
        FANTASMA,
        FUEGO,
        HIELO,
        LUCHA,
        NORMAL,
        PLANTA,
        PSIQUICO,
        ROCA,
        SINIESTRO,
        TIERRA,
        VENENO,
        VOLADOR,
    }
    
    //Atributos
    protected TiposDeMovimiento tipo;
    protected int potencia;
    protected int precision;
    protected int puntosPoder;
    
    //Metodos
    public void utilizar(Pokemon usuario, Pokemon objetivo){
        //Calcular el daño
        int nivelAtacante = usuario.getNivel();
        int ataqueAtacante = usuario.getAtaque();
        int poderMovimiento = this.puntosPoder;
        int defensaObjetivo = objetivo.getDefensa();
        
        //Calcular el modificador, considerando tipos.
        double modificador = 1.0; //Modificador base (sin modificaciones)
        // if ()... POR HACER
        
        int danio = (int) (((
                          ((2 * nivelAtacante / 5 + 2)
                               * ataqueAtacante
                               * poderMovimiento / defensaObjetivo)
                             / 50) + 2) * modificador);
        objetivo.recibirDanio(danio);
        
        //Imprimir efecto del movimiento en consola
        System.out.println("El Contricante tiene la siguiente vida:"+ objetivo);
        System.out.println(usuario.getClass().getSimpleName() + " aplica" +
                            this.getClass().getSimpleName() + " a " +
                              objetivo.getClass().getSimpleName() + " Y causa danio de " +
                              danio);
        
    } 
}
