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
        return "Nombre:" + nombre + " nivel:" + nivel + " salud:" + salud;
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

    public class Guerrero extends PersonajeFisico implements Defendible {

        int fuerza;
        int armadura;
        int escudo;

        public Guerrero(int fuerza, int armadura, int escudo, String nombre, int nivel, int salud) {
            super(nombre, nivel, salud);
            this.fuerza = fuerza;
            this.armadura = armadura;
            this.escudo = escudo;
        }

        @Override
        public void atacar() {

        }

        @Override
        public void defender() {
        }
    }

    public class Mago extends PersonajeMagico implements Magico, Curable {

        int mana;
        int sabiduria;

        public Mago(int mana, int sabiduria, String nombre, int nivel, int salud) {
            super(nombre, nivel, salud);
            this.mana = mana;
            this.sabiduria = sabiduria;
        }

        @Override
        public void atacar() {

        }

        @Override
        public void LanzarHechizo() {
        }

        @Override
        public void curar() {

        }
    }

    public class Arquero extends PersonajeFisico implements Volador {

        int agilidad;
        int numerodeflechas;

        public Arquero(int agilidad, int numerodeflechas, String nombre, int nivel, int salud) {
            super(nombre, nivel, salud);
            this.agilidad = agilidad;
            this.numerodeflechas = numerodeflechas;
        }

        @Override
        public void atacar() {

        }

        @Override
        public void volar() {

        }

    }

    public class Hechizero extends PersonajeMagico implements Magico, Defendible {

        int mana;
        int Concentracion;

        public Hechizero(int mana, int Concentracion, String nombre, int nivel, int salud) {
            super(nombre, nivel, salud);
            this.mana = mana;
            this.Concentracion = Concentracion;
        }

        @Override
        public void atacar() {

        }

        @Override
        public void LanzarHechizo() {

        }

        @Override
        public void defender() {

        }

    }

    public class Asesino extends PersonajeFisico implements Movilizable, Curable {

        int sigilo;
        int critico;

        public Asesino(int sigilo, int critico, String nombre, int nivel, int salud) {
            super(nombre, nivel, salud);
            this.sigilo = sigilo;
            this.critico = critico;
        }

        @Override
        public void atacar() {

        }

        @Override
        public void moverse() {

        }

        @Override
        public void curar() {

        }

    }

    public interface Curable {

        void curar();
    }

    public interface Volador {

        void volar();
    }

    public interface Magico {

        void LanzarHechizo();
    }

    public interface Defendible {

        void defender();
    }

    public interface Movilizable {

        void moverse();
    }

}
