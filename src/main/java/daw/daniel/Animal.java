/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daw.daniel;

import java.time.*;

/**
 *
 * @author daniel
 */
public class Animal {

    private LocalDate nacimiento = LocalDate.now();
    private String nombre;
    private String tipo;
    private double peso;
    private String estado;
    private static int contador;

    public Animal() {
        contador++;
        this.nacimiento = LocalDate.now();
        this.nombre = "turrón";
        this.tipo = "gato";
        this.peso = 2200;
        this.estado = "durmiendo";
    }

    public Animal(String nombre, String tipo, double peso, String estado) {
        contador++;
        this.nombre = nombre;
        this.tipo = tipo;
        this.peso = peso;
        this.estado = estado;
    }

    public void comer(double cantidadGramos) {
        if (cantidadGramos < 0) {
            this.peso += (Math.abs(cantidadGramos));
        } else {

            this.peso += cantidadGramos;
        }

    }
    
    public void dormir (){
        this.estado="durmiendo";
    }
    
    public void despertar(){
        this.estado="despierto";
    }
    
    public void descansar(){
        this.estado="reposo";
    }
    
    public void getContadorInstancias(){
        System.out.println("El numero de objetos creados son" + contador);
    }

    @Override
    public String toString() {
        return "Animal{" + "nacimiento=" + nacimiento + ", nombre=" + nombre + ", tipo=" + tipo + ", peso=" + peso + ", estado=" + estado + '}';
    }

}
