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
public class PuntoGeometrico {
    
    private double x;
    private double y;
    
    public PuntoGeometrico (double x, double y){
        
        this.x = x;
        this.y = y;
    }
    
    public PuntoGeometrico (){
        
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "PuntoGeometrico{" + "x=" + x + ", y=" + y + '}';
    }
    
    
}
