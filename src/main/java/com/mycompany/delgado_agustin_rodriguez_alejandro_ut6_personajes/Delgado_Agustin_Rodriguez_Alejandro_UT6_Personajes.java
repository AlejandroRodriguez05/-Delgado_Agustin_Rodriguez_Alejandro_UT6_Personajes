/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.delgado_agustin_rodriguez_alejandro_ut6_personajes;

import java.util.ArrayList;
import com.mycompany.delgado_agustin_rodriguez_alejandro_ut6_personajes.Personaje;
import com.mycompany.delgado_agustin_rodriguez_alejandro_ut6_personajes.Juego;
import com.mycompany.delgado_agustin_rodriguez_alejandro_ut6_personajes.Personaje.*;
/**
 *
 * @author AlumnadoTarde
 */
public class Delgado_Agustin_Rodriguez_Alejandro_UT6_Personajes {

    public static void main(String[] args) {
        Juego Juego = new Juego ();
       ArrayList<Personaje> personajes = new ArrayList<>();

        // Crear instancias de personajes concretos
        Personaje guerrero = new Guerrero(12, 8, 2, "Justiciero", 7, 120);
        Personaje mago = new Mago(14, 6, "Merlin", 9, 90);
        Personaje arquero = new Arquero(10, 9, "zariel", 5, 95);
        Personaje hechizero = new Hechizero(10, 15, "Gowther", 8, 90);
        Personaje asesino = new Asesino(18, 4, "jin-woo", 15, 60);

        // Añadir a la lista
        personajes.add(guerrero);
        personajes.add(mago);
        personajes.add(arquero);
        personajes.add(hechizero);
        personajes.add(asesino);

        // Llamar al método mostrarAcciones
         Juego.mostrarAcciones(personajes);
    }
    }

