/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.delgado_agustin_rodriguez_alejandro_ut6_personajes;

/**
 *
 * @author AlumnadoTarde
 */
public abstract class Personaje {
    protected String nombre;
    protected int nivel;
    protected int salud;
    
    //Constructor
    public Personaje(String nombre, int nivel, int salud) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.salud = salud;
    }
    
    public abstract void atacar();

    @Override
    public String toString() {
        return nombre + " (Nivel " + nivel + ", Salud " + salud + ")";
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Personaje)) return false;
        Personaje p = (Personaje) obj;
        return nombre.equals(p.nombre) && nivel == p.nivel;
    }
    
    @Override
    public int  hashCode(){
        return nombre.hashCode();
    }
    
    
    public abstract class PersonajeFisico extends Personaje {
        
        //Constructor
         public PersonajeFisico(String nombre, int nivel, int salud) {
          super(nombre, nivel, salud);
        }
         
         public void Afilar() {
             System.out.println("esta afilando su Arma (Daño +3)");
        }
         
    }
    
    public abstract class PersonajeMagico extends Personaje {
        
        //Constructor
         public PersonajeMagico(String nombre, int nivel, int salud) {
          super(nombre, nivel, salud);
        }
         
         public void ConjurarHechizo() {
             System.out.println("ha aprendido un nuevo Hechizo");
        }
         
    }
    
    
    
    
    
}
