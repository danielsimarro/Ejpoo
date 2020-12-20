/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PooC4;

/**
 *
 * @author NitroPc
 */
public class Linea {
    private PuntoGeometrico puntoA;
    private PuntoGeometrico puntoB;
    
    public Linea (){
        puntoA.x = 0;
        puntoA.y = 0;
        puntoB.x = 1;
        puntoB.y = 1;
    }
    
    public Linea (PuntoGeometrico a, PuntoGeometrico b){
        this.puntoA = a;
        this.puntoB = b;
    }
    
    public void mueveDerecha(double x){
        puntoA.x += x;
    }
    
    public void mueveIzquierda(double x){
        puntoB.x += x;
    }
    
    public void mueveArriba(double y){
        puntoA.y += y;
    }
    
    public void mueveAbajo(double y){
        puntoB.y += y;
    }

    public PuntoGeometrico getPuntoA() {
        return puntoA;
    }

    public void setPuntoA(PuntoGeometrico puntoA) {
        this.puntoA = puntoA;
    }

    public PuntoGeometrico getPuntoB() {
        return puntoB;
    }

    public void setPuntoB(PuntoGeometrico puntoB) {
        this.puntoB = puntoB;
    }
    
    public void MostrarLinea(){
        System.out.println("[(" + puntoA.x + "," + puntoA.y + "),(" + puntoB.x + "," + puntoB.y + ")]" );
    }
}
