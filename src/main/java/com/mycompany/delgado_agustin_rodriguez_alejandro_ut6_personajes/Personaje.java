/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.delgado_agustin_rodriguez_alejandro_ut6_personajes;

/**
 *
 * @author AlumnadoTarde
 */
class Personaje {
    protected String nombre;
    protected int nivel;
    protected int salud;

    public Personaje(String nombre, int nivel, int salud) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.salud = salud;
    }
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Personaje Personaje = (Personaje) obj;
        return this.nombre.equals(Personaje.nombre);
    }
     public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "Nombre:" + nombre + " nivel:" + nivel +" salud:"+ salud;
    }

    
}
