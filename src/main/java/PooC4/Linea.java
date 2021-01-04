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

    public Linea() {

        this.puntoA = new PuntoGeometrico(0, 0);
        this.puntoB = new PuntoGeometrico(1, 1);
    }

    public Linea(PuntoGeometrico a, PuntoGeometrico b) {
        this.puntoA = a;
        this.puntoB = b;
    }

    public void mueveDerecha(double x) {
        //si queremso moverlo a la derecha, ambos puntos, la coordenada x se 
        //sumara tantas unidades como sea marcado por el objeto
        this.puntoA.setX(puntoA.getX() + x);
        this.puntoB.setX(puntoB.getX() + x);
    }
    
    public void mueveIzquierda(double x) {
        //si queremso moverlo a la izquierda, ambos puntos, la coordenada x se 
        //restara tantas unidades como sea marcado por el objeto
        this.puntoA.setX(puntoA.getX() - x);
        this.puntoB.setX(puntoB.getX() - x);
    }

    public void mueveArriba(double y) {
        //si queremso moverlo hacia arriba, ambos puntos, la coordenada y se 
        //sumara tantas unidades como sea marcado por el objeto
        this.puntoA.setY(puntoA.getY() + y);
        this.puntoB.setY(puntoB.getY() + y);
    }

    public void mueveAbajo(double y) {
        //si queremso moverlo hacia abajo, ambos puntos, la coordenada y se 
        //restara tantas unidades como sea marcado por el objeto
        this.puntoA.setY(puntoA.getY() - y);
        this.puntoB.setY(puntoB.getY() - y);
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

    public void MostrarLinea() {
        System.out.println("[(" + puntoA.getX() + "," + puntoA.getY() + "),(" + puntoB.getX() + "," + puntoB.getY() + ")]");
    }
}
