/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokebatalla.Batallas.FileManager;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import pokebatalla.Batallas.Batalla;

/**
 *
 * @author stacy
 */
public class FileManager {
    public static final String pokemones = "batalla.txt";

    public static void guardarPartida(Batalla b) {
        try (ObjectOutputStream guardarObjectos = new ObjectOutputStream(new FileOutputStream(pokemones))) {
            guardarObjectos.writeObject(b);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static Batalla leerPartida() {
        Batalla b = null;
        try (ObjectInputStream leerObjectos = new ObjectInputStream(new FileInputStream(pokemones))) {
            b = (Batalla) leerObjectos.readObject();
        } catch (EOFException e) {
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        return b;
    }
}
