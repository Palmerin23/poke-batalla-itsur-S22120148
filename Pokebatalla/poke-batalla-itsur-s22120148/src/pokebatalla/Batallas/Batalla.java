/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokebatalla.Batallas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;
import pokebatalla.Batallas.FileManager.FileManager;
import pokebatalla.pokemones.Pokemon;

/**
 *
 * @author Stacy Chavez Palmerin S22120148
 * 
 */
public class Batalla implements Serializable{

    public Batalla(Entrenador entrenador1, Entrenador entrenador2) {
        this.entrenador1 = entrenador1;
        this.entrenador2 = entrenador2;
    }
  protected Entrenador entrenador1;
    protected Entrenador entrenador2;
    protected int turno = 1;
    protected boolean batallaFinalizada = false;

    private boolean primerAtaqueRealizado = false;
    
public void guardarBatalla(){
    FileManager.guardarPartida(this);
}
       public void desarrollarBatalla() {
        System.out.println(" ************************************************* LA BATALLA ESTA POR NINICIAR ********************************************************");
        System.out.println("LOS OPONENTES SON: ");
        System.out.println(entrenador1.getNombre() + "    <----------------V.S--------------->   " + entrenador2.getNombre());

        System.out.println("");

        do {
            try {
                eligirPokemon(entrenador1);
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Cuentas con los siguientes pokemones:  " + "{" + entrenador1.getPokemonsCapturados().size() + "}" + "  Elige alguno de tus Pokemons");
                entrenador1.setPokemonActual(null);
            }
        } while (entrenador1.getPokemonActual() == null);

        do {
            try {
                eligirPokemon(entrenador2);
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Cuentas con los siguientes pokemones:  " + "{" + entrenador2.getPokemonsCapturados().size() + "}" + "  Elige alguno de tus Pokemons");
                entrenador2.setPokemonActual(null);
            }
        } while (entrenador2.getPokemonActual() == null);

        
        while (!batallaFinalizada) {
            Entrenador entrenadorEnTurno = (turno == 1) ? entrenador1 : entrenador2;
            Entrenador oponente = (turno == 1) ? entrenador2 : entrenador1;

            System.out.println("Turno del entrenador: " + entrenadorEnTurno.getNombre());

            if (entrenadorEnTurno.getPokemonActual() == null || entrenadorEnTurno.getPokemonActual().getHp() <= 0) {
                cambiarPokemon(entrenadorEnTurno);
            }

            seleccionarAtaque(entrenadorEnTurno, oponente.getPokemonActual());

            if (entrenadorEnTurno.getPokemonActual() == null || entrenadorEnTurno.getPokemonActual().getHp() <= 0) {
                cambiarPokemon(entrenadorEnTurno);

                while (entrenadorEnTurno.getPokemonActual() == null || entrenadorEnTurno.getPokemonActual().getHp() <= 0) {
                    System.out.println("Bebes de cambiar de pokemon para avanzar.");
                    cambiarPokemon(entrenadorEnTurno);
                }
            }
            Pokemon pokemonEnTurno = entrenadorEnTurno.getPokemonActual();

            if (oponente.estaDerrotado()) {
                System.out.println("¡El entrenador " + oponente.getNombre() + " ha sido derrotado!");
                batallaFinalizada = true;
            } else {
                // Cambiar el turno
                guardarBatalla();
                turno = (turno == 1) ? 2 : 1;
            }
        }
    }

    private void eligirPokemon(Entrenador entrenadorEnturno) {
        int idx = 1;
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        for (Pokemon pokemon : entrenadorEnturno.getPokemonsCapturados()) {
            System.out.println(idx + ".- " + pokemon.getClass().getSimpleName()+" " + "HP" +" "+pokemon.getHp());
            idx++;
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        }
        System.out.println("");
        System.out.println("Elige un  pokemon " + entrenadorEnturno.getNombre());

        char auxLectura = '0';

        try {
            auxLectura = (char) System.in.read();
            System.in.read((new byte[System.in.available()]));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        Pokemon pokemonSeleccionado = entrenadorEnturno.getPokemonsCapturados()
                .get(Character.getNumericValue(auxLectura) - 1);
        entrenadorEnturno.setPokemonActual(pokemonSeleccionado);
    }

   
    private void seleccionarAtaque(Entrenador entrenadorEnturno, Pokemon oponente) {

        Pokemon pokemonActual = entrenadorEnturno.getPokemonActual();

        System.out.println("/////////////////////////////////////////////////////////////");
        System.out.println("Seleccione un ataque para " + pokemonActual.getClass().getSimpleName() + ":");

        int idx = 1;

        for (Enum movimiento : pokemonActual.getMovimientos()) {
            System.out.println(idx + ".- " + movimiento);
            idx++;
        }
        System.out.println("///////////////////////////////////////////////////////////");

        int opcionAtaque = -1;
        while (true) {
            try {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                String input = br.readLine();

                opcionAtaque = Integer.parseInt(input);

                if (opcionAtaque < 1 || opcionAtaque > pokemonActual.getMovimientos().length) {
                    System.out.println("Elige un ataque valido. Inténtalo de nuevo.");
                } else {
                    break;
                }
            } catch (IOException ex) {
                System.out.println("Entrada invalida. Inténtalo de nuevo.");
                ex.printStackTrace();
            } catch (NumberFormatException ex) {
                System.out.println("Ingrese un número válido.");
            }
        }

        entrenadorEnturno.instruirMovimientoAlPokemonActual(oponente, opcionAtaque - 1);
    }

    private void cambiarPokemon(Entrenador entrenador) {
        System.out.println("¿Deseas cambiar de Pokémon? (S/N)");

        char respuesta = 'N';

        while (true) {
            try {
                respuesta = (char) System.in.read();
                System.in.read((new byte[System.in.available()]));
                break;
            } catch (IOException ex) {
                System.out.println("Entrada o salida invalida.");
                ex.printStackTrace();
            }
        }

        if (respuesta == 'S' || respuesta == 's') {

            System.out.println("Pokémones disponibles:");
            int idx = 1;
            for (Pokemon pokemon : entrenador.getPokemonsCapturados()) {
                System.out.println(idx + ".- " + pokemon.getClass().getSimpleName());
                idx++;
            }

            System.out.println("Elige un nuevo Pokémon:");

            char auxLectura = '0';

            try {
                auxLectura = (char) System.in.read();
                System.in.read((new byte[System.in.available()]));
            } catch (Exception ex) {
                ex.printStackTrace();
            }

            int indicePokemonNuevo = Character.getNumericValue(auxLectura) - 1;
            
            if (indicePokemonNuevo >= 0 && indicePokemonNuevo < entrenador.getPokemonsCapturados().size()) {
                Pokemon nuevoPokemon = entrenador.getPokemonsCapturados().get(indicePokemonNuevo);
                entrenador.setPokemonActual(nuevoPokemon);
                System.out.println("Has cambiado a " + nuevoPokemon.getClass().getSimpleName() + " en tu equipo.");
            } else {
                System.out.println("Ingresa un pokemon valido.");
            }
        }
    }
}

