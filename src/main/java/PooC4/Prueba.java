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
public class Prueba {
    public static void main(String[] args) {
        
        
        PuntoGeometrico coordenada1 = new PuntoGeometrico(5.50,10);
        
        PuntoGeometrico coordenada2 = new PuntoGeometrico(20,8.50);
        
        /*System.out.println("Muestrame las cordenadas 1, x=" + coordenada1.getX() + " y=" + coordenada1.getY() );
        
        System.out.println("Muestrame las cordenadas 2, x=" + coordenada2.getX() + " y=" + coordenada2.getY() );
        
        coordenada1.setX(3.25);
        
        System.out.println("Muestrame las cordenadas 1, x=" + coordenada1.getX() + " y=" + coordenada1.getY() );
        
        coordenada2.setY(30);
        
        System.out.println("Muestrame las cordenadas 2, x=" + coordenada2.getX() + " y=" + coordenada2.getY() );*/
        
        PuntoGeometrico valorPredeterminado = new PuntoGeometrico ();
        PuntoGeometrico  puntoA = new PuntoGeometrico (4,2);
        PuntoGeometrico  puntoB = new PuntoGeometrico (8,6);
        
        Linea linea1 = new Linea ();
        Linea linea2 = new Linea(puntoA, puntoB);
        
        linea1.MostrarLinea();
        linea1.mueveDerecha(4);
        linea1.mueveAbajo(1);
        linea1.MostrarLinea();
        
        linea2.MostrarLinea();
        
    }
}
