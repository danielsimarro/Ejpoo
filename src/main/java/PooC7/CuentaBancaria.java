/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PooC7;

/**
 *
 * @author NitroPc
 */
public class CuentaBancaria {
    
    private long numeroCuenta;
    private double interes, saldoCuenta;
    private String nifCliente, nombreCliente;
    private static int contador;

    public CuentaBancaria() {
        contador ++;
        this.numeroCuenta = 10000 + contador;
        this.interes = 0;
        this.saldoCuenta = 0;
        this.nifCliente = "";
        this.nombreCliente = "";
    }

    public CuentaBancaria(String nifCliente, String nombreCliente, double interes, double saldoCuenta) {
        contador ++;
        this.numeroCuenta = 10000 + contador;
        this.interes = interes;
        this.saldoCuenta = saldoCuenta;
        this.nifCliente = nifCliente;
        this.nombreCliente = nombreCliente;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public double getSaldoCuenta() {
        return saldoCuenta;
    }

    public void setSaldoCuenta(double saldoCuenta) {
        this.saldoCuenta = saldoCuenta;
    }

    public String getNifCliente() {
        return nifCliente;
    }

    public void setNifCliente(String nifCliente) {
        this.nifCliente = nifCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        CuentaBancaria.contador = contador;
    }

    public long getNumeroCuenta() {
        return numeroCuenta;
    }
    
    public void ingresarInteres(){
        this.saldoCuenta += this.interes + this.saldoCuenta;
    }
   
    public void ingresarDinero(double cantidad){
        this.saldoCuenta += cantidad;
    }
    public void retirarEfectivo(double cantidad){
        if (this.saldoCuenta >= cantidad){
            this.saldoCuenta -= cantidad;
        }
    }

    @Override
    public String toString() {
        return "CuentaBancaria:" + "\nnumeroCuenta=" + numeroCuenta + "\ninteres=" + interes + "\nsaldoCuenta=" + saldoCuenta + "\nnifCliente=" + nifCliente + "\nnombreCliente=" + nombreCliente ;
    }
    
    
    
    
}
