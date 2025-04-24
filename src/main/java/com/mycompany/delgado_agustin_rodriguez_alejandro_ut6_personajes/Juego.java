/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.delgado_agustin_rodriguez_alejandro_ut6_personajes;

import com.mycompany.delgado_agustin_rodriguez_alejandro_ut6_personajes.Personaje.Defendible;
import java.util.ArrayList;



/**
 *
 * @author AlumnadoTarde
 */
public class Juego {
      private ArrayList<Personaje> personajes;

    public Juego(ArrayList<Personaje> personajes) {
        personajes = new ArrayList<>();
    }
    
    public void AgregarPersonaje(Personaje p){
        personajes.add(p);
    }

     public void mostrarAcciones() {
         for (Personaje p : personajes) {
             p.atacar();
             
              if (p instanceof Defendible) {
                ((Defendible) p).defender();
            }
         }
     }
    
    
}
