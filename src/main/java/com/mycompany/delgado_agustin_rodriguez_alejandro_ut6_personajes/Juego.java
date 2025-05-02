/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.delgado_agustin_rodriguez_alejandro_ut6_personajes;

<<<<<<< HEAD
import com.mycompany.delgado_agustin_rodriguez_alejandro_ut6_personajes.Personaje;
=======
>>>>>>> 2fc59bd6fdd438943e3d947366c6d303771845d9
import java.util.ArrayList;

/**
 *
 * @author AlumnadoTarde
 */
public class Juego {


    public void mostrarAcciones(ArrayList<Personaje> personaje) {
        for (Personaje p : personaje) {
            p.atacar();

            //Verifica las habilidades con instanceof
            if (p instanceof Personaje.Curable) {
                ((Personaje.Curable) p).curar();
            }

            if (p instanceof Personaje.Magico) {
                ((Personaje.Magico) p).LanzarHechizo();
            }

            if (p instanceof Personaje.Defendible) {
                ((Personaje.Defendible) p).defender();
            }

            if (p instanceof Personaje.Volador) {
                ((Personaje.Volador) p).volar();
            }

            if (p instanceof Personaje.Movilizable) {
                ((Personaje.Movilizable) p).moverse();
            }

            //Ataque de los personajes:
            
            if (p instanceof Personaje.Guerrero) {
                ((Personaje.Guerrero) p).cargarataque();
            }

            if (p instanceof Personaje.Asesino) {
                ((Personaje.Asesino) p).atacarporlaespalda();
                ((Personaje.Asesino) p).ocultar();
            }

            if (p instanceof Personaje.Arquero) {
                ((Personaje.Arquero) p).disparaflecha();
                ((Personaje.Arquero) p).reabastecerflecha();
            }

            if (p instanceof Personaje.Hechizero) {
                ((Personaje.Hechizero) p).invocarentidad();
            }

            if (p instanceof Personaje.Mago) {
                ((Personaje.Mago) p).regenerarmana();
            }

            System.out.println();
        }

    }
}
