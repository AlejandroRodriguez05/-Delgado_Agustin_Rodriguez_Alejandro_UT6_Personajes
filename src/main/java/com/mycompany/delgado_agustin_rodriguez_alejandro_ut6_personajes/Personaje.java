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

    public static abstract class PersonajeFisico extends Personaje {

        //Constructor
        public PersonajeFisico(String nombre, int nivel, int salud) {
            super(nombre, nivel, salud);
        }

        public void Afilar() {
            System.out.println("esta afilando su Arma (Daño +3)");
        }

    }

    public static abstract class PersonajeMagico extends Personaje {

        //Constructor
        public PersonajeMagico(String nombre, int nivel, int salud) {
            super(nombre, nivel, salud);
        }

        public void ConjurarHechizo() {
            System.out.println("ha aprendido un nuevo Hechizo");
        }

    }

    public static class Guerrero extends PersonajeFisico implements Defendible {

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
            System.out.println("El guerreo ataca");
        }

        @Override
        public void defender() {
            System.out.println("El guerrero se defiende");
        }
        public void cargarataque(){
            System.out.println("El guerrero carga el ataque");
        }
    }

    public static class Mago extends PersonajeMagico implements Magico, Curable {

        int mana;
        int sabiduria;

        public Mago(int mana, int sabiduria, String nombre, int nivel, int salud) {
            super(nombre, nivel, salud);
            this.mana = mana;
            this.sabiduria = sabiduria;
        }

        @Override
        public void atacar() {
            System.out.println("El mago ataca");
        }

        @Override
        public void LanzarHechizo() {
            System.out.println("El mago lanza un hechizo");
        }

        @Override
        public void curar() {
            System.out.println("El mago se cura");
        }
        public void regenerarmana(){
            System.out.println("el mago regenera mana");
        }
    }

    public static class Arquero extends PersonajeFisico implements Volador {

        int agilidad;
        int numerodeflechas;

        public Arquero(int agilidad, int numerodeflechas, String nombre, int nivel, int salud) {
            super(nombre, nivel, salud);
            this.agilidad = agilidad;
            this.numerodeflechas = numerodeflechas;
        }

        @Override
        public void atacar() {
            System.out.println("El arquero ataca");
        }

        @Override
        public void volar() {
            System.out.println("El arquero empieza a volar");
        }
public void disparaflecha(){
    System.out.println("El arquero dispara una flecha");
}
public void reabastecerflecha(){
    System.out.println("El arquero reabastece sus flechas");
}
    }

    public static class Hechizero extends PersonajeMagico implements Magico, Defendible {

        int mana;
        int Concentracion;

        public Hechizero(int mana, int Concentracion, String nombre, int nivel, int salud) {
            super(nombre, nivel, salud);
            this.mana = mana;
            this.Concentracion = Concentracion;
        }

        @Override
        public void atacar() {
            System.out.println("El hechizero ataca");
        }

        @Override
        public void LanzarHechizo() {
            System.out.println("El hechizero lanza un hechizo");
        }

        @Override
        public void defender() {
            System.out.println("El hechizero se defiende");
        }
        public void invocarentidad(){
            System.out.println("El hechizero invoco una sombra");
        }

    }

    public static class Asesino extends PersonajeFisico implements Movilizable, Curable {

        int sigilo;
        int critico;

        public Asesino(int sigilo, int critico, String nombre, int nivel, int salud) {
            super(nombre, nivel, salud);
            this.sigilo = sigilo;
            this.critico = critico;
        }

        @Override
        public void atacar() {
            System.out.println("El asesino ataca");
        }

        @Override
        public void moverse() {
            System.out.println("El asesino se mueve");
        }

        @Override
        public void curar() {
            System.out.println("El asesino se cura");
        }
        public void atacarporlaespalda(){
                System.out.println("El asesino te ataca por la espalda");
    }
        public void ocultar(){
            System.out.println("El asesino se oculta");
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
