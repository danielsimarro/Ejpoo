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
public class PruebaBanco {

    public static void main(String[] args) {

        CuentaBancaria a = new CuentaBancaria();
        CuentaBancaria b = new CuentaBancaria();
        CuentaBancaria c = new CuentaBancaria();

        CuentaBancaria d = new CuentaBancaria("789446145W", "Daniel Simarro", 351416.654, 0.0025);

        System.out.println(d.toString());
        d.ingresarInteres();
        System.out.println(d.toString());
        d.ingresarDinero(256.263);
        System.out.println(d.toString());
        d.retirarEfectivo(656623652.12);
        System.out.println(d.toString());
        
    }

}
