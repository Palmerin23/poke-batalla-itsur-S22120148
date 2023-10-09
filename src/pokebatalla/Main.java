/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pokebatalla;

/**
 *
 * @author FJML1983
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hello PokeBatalla!");
        
        Pikachu pikachuSalvaje = new Pikachu(); //Instanciando                     
        Charmander charmanderSalvaje = new Charmander();   //Instanciando                     
        Bullbasaur bullbasaurSalvaje = new Bullbasaur();//Instanciando
        Gengar gengarSalvaje = new Gengar();
        Lapras laprasSalvaje = new Lapras();
        Squirtle squirtleSalvaje = new Squirtle();
        
        //Realizar la captura del pikachu salvaje
        pikachuSalvaje.setNombre("Pedro");
        Pikachu miPikachu = pikachuSalvaje;
        miPikachu.atacar(charmanderSalvaje);
        miPikachu.atacar(charmanderSalvaje, "ATACKTRUENO");
        
        charmanderSalvaje.setNombre("Harry");
        Charmander miCharmander = charmanderSalvaje;
        miCharmander.atacar(laprasSalvaje);
        miCharmander.atacar(laprasSalvaje, "LANZALLAMAS");
        
        bullbasaurSalvaje.setNombre("Juan");
        Bullbasaur miBullbasaur = bullbasaurSalvaje;
        miBullbasaur.atacar(gengarSalvaje);
        miBullbasaur.atacar(gengarSalvaje, "HOJA AFILADA");
        
        gengarSalvaje.setNombre("Jay");
        Gengar miGengar = gengarSalvaje;
        miGengar.atacar(pikachuSalvaje);
        miGengar.atacar(pikachuSalvaje, "HIPNOSIS");
        
        laprasSalvaje.setNombre("Mario");
        Lapras miLapras = laprasSalvaje;
        miLapras.atacar(squirtleSalvaje);
        miLapras.atacar(squirtleSalvaje, "RAYO HIELO");
        
        squirtleSalvaje.setNombre("Eduardo");
        Squirtle miSquirtle = squirtleSalvaje;
        miSquirtle.atacar(laprasSalvaje);
        miSquirtle.atacar(laprasSalvaje, "PISTOLA AGUA"); 
    }
    
}
